package dominio;

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
