package dominio;

public class ContaCorrente extends Conta {
    private double saldoDisponivel;
    private double taxaMensal;

    public ContaCorrente(String agencia, String numeroDaContaDoNovoCliente, String numeroDaContaDoUltimoCliente, double saldoTotal) {
        super(agencia, numeroDaContaDoNovoCliente, numeroDaContaDoUltimoCliente, saldoTotal);
        this.saldoDisponivel = 0;
        this.taxaMensal = 10;
        this.cobrandoTaxa();
    }
    
    void cobrandoTaxa(){
        setSaldoDisponivel(getSaldoDisponivel() - this.taxaMensal);
        super.setSaldoTotal(saldoDisponivel);
    }
    public double getSaldoDisponivel() {
        return saldoDisponivel;
    }

    public void setSaldoDisponivel(double saldoDisponivel) {
        this.saldoDisponivel = saldoDisponivel;
    }

    public double getTaxaMensal() {
        return taxaMensal;
    }

    public void setTaxaMensal(double taxaMensal) {
        this.taxaMensal = taxaMensal;
    }

    @Override
    public String toString() {
        return super.toString() + " 1 " + saldoDisponivel + " " + taxaMensal + "\n";
    }    
}
