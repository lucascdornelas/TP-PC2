package dominio;

public class Conta {
    
    private String agencia;
    private String numero;
    private String numeroDaContaDoNovoCliente;
    private String numeroDaContaDoUltimoCliente;
    private double saldoTotal;

    public Conta() {
        this.agencia = "0001";
        this.numero = "";
        this.numeroDaContaDoUltimoCliente = "0";
        this.numeroDaContaDoNovoCliente = "";
        this.saldoTotal = 0;
    }

    public Conta(String agencia, String numeroDaContaDoNovoCliente, String numeroDaContaDoUltimoCliente, double saldoTotal) {
        this.agencia = agencia;
        this.numeroDaContaDoNovoCliente = numeroDaContaDoNovoCliente;
        this.numeroDaContaDoUltimoCliente = numeroDaContaDoUltimoCliente;
        this.saldoTotal = saldoTotal;
    }
    
    public void definindoNumeroDaConta()
    {
        int numeroDoUltimoCliente = Integer.parseInt(numeroDaContaDoUltimoCliente);
        int numeroNovoCliente; 
        numeroDoUltimoCliente++;
        numeroNovoCliente = numeroDoUltimoCliente;
        
        this.setNumeroDaContaDoUltimoCliente(Integer.toString(numeroDoUltimoCliente));
        this.setnumeroDaContaDoNovoCliente(Integer.toString(numeroNovoCliente));
    }
    
    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getnumeroDaContaDoNovoCliente() {
        return numeroDaContaDoNovoCliente;
    }

    public void setnumeroDaContaDoNovoCliente(String numero) {
        this.numeroDaContaDoNovoCliente = numero;
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    public String getNumeroDaContaDoUltimoCliente() {
        return numeroDaContaDoUltimoCliente;
    }

    public void setNumeroDaContaDoUltimoCliente(String numeroDaContaDoUltimoCliente) {
        this.numeroDaContaDoUltimoCliente = numeroDaContaDoUltimoCliente;
    } 

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumeroDaContaDoNovoCliente() {
        return numeroDaContaDoNovoCliente;
    }

    public void setNumeroDaContaDoNovoCliente(String numeroDaContaDoNovoCliente) {
        this.numeroDaContaDoNovoCliente = numeroDaContaDoNovoCliente;
    }

    @Override
    public String toString() {
        return agencia + " " + numero + " " + numeroDaContaDoNovoCliente + " " + numeroDaContaDoUltimoCliente + " " + saldoTotal;
    }
}
