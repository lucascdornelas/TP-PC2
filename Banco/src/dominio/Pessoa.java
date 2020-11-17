/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author erick
 */
public class Pessoa {
    
    private String nome;
    private Contato contato;
    private Endereco endereo;
    private ArrayList<Conta> contas;
    private String loginDaConta;
    private int senhaDaConta;

    public Pessoa(String nome, Contato contato, Endereco endereo) {
        this.nome = nome;
        this.contato = contato;
        this.endereo = endereo;
        this.contas = new ArrayList<>();
        this.loginDaConta = "";
        this.senhaDaConta = 0;
    }
    
    public void definindoLoginESenha()
    {
        SecureRandom gerador = new SecureRandom();
        Iterator<Conta> it = contas.iterator();
        
        while(it.hasNext())
        {
            Conta aux = it.next();            
            loginDaConta = aux.getnumeroDaContaDoNovoCliente();
            senhaDaConta = gerador.nextInt(1000);
        }
    }
    
    public String definindoLoginDoCliente()
    {
        return this.getLoginDaConta();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Endereco getEndereo() {
        return endereo;
    }

    public void setEndereo(Endereco endereo) {
        this.endereo = endereo;
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(Conta contas) {
        this.contas.add(contas);
        definindoLoginESenha();
    }

    public String getLoginDaConta() {
        return loginDaConta;
    }

    public void setLoginDaConta(String loginDaConta) {
        this.loginDaConta = loginDaConta;
    }

    public int getSenhaDaConta() {
        return senhaDaConta;
    }

    public void setSenhaDaConta(int senhaDaConta) {
        this.senhaDaConta = senhaDaConta;
    }
}
