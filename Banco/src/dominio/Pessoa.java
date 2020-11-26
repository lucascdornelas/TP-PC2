package dominio;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;

public class Pessoa {
    private String nome;
    private Contato contato;
    private Endereco endereco;
    private ArrayList<Conta> contas;
    private String loginDaConta;
    private int senhaDaConta;
    private String id;

    public Pessoa(String nome, Contato contato, Endereco endereo, String id) {
        this.nome = nome;
        this.contato = contato;
        this.endereco = endereo;
        this.contas = new ArrayList<>();
        this.loginDaConta = "";
        this.senhaDaConta = 0;
        this.id = id;
    }
    
    public Pessoa(String nome, Contato contato, Endereco endereo, String login, int senha, String id) {
        this.nome = nome;
        this.contato = contato;
        this.endereco = endereo;
        this.contas = new ArrayList<Conta>();
        this.loginDaConta = login;
        this.senhaDaConta = senha;
        this.id = id;
    }
    
    public void definindoLoginESenha(){
        SecureRandom gerador = new SecureRandom();
        Iterator<Conta> it = contas.iterator();
        
        while(it.hasNext()){
            
            Conta aux = it.next();            
            loginDaConta = aux.getnumeroDaContaDoNovoCliente();
            senhaDaConta = gerador.nextInt(1000);
            aux.setNumero(loginDaConta);
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereo) {
        this.endereco = endereo;
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(Conta contas) {
        this.contas.add(contas);
        
        if(this.senhaDaConta == 0){
            definindoLoginESenha();
        }
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
    
    
}
