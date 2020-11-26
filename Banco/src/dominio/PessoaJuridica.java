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
public class PessoaJuridica extends Pessoa{
  
    private String cnpj;

    public PessoaJuridica(String cnpj, String nome, Contato contato, Endereco endereo) {
        super(nome, contato, endereo, cnpj);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
