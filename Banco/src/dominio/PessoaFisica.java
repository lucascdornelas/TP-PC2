/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author erick
 */
public class PessoaFisica extends Pessoa{
    
    private String cpf;

    public PessoaFisica(String cpf, String nome, Contato contato, Endereco endereo) {
        super(nome, contato, endereo, cpf);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
