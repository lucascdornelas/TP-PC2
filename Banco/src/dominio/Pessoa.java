/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.ArrayList;

/**
 *
 * @author erick
 */
public class Pessoa {
    
    private String nome;
    private Contato contato;
    private Endereco endereo;
    private ArrayList<Conta> contas;

    public Pessoa(String nome, Contato contato, Endereco endereo) {
        this.nome = nome;
        this.contato = contato;
        this.endereo = endereo;
        this.contas = new ArrayList<>();
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

    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }
    
    
}
