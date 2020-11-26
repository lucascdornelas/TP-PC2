/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

public class ContaPoupanca extends Conta{
    
    private double rendimento;
    private double saldoInvestido;

    public ContaPoupanca() {
        super();
        this.rendimento = 10;
        this.saldoInvestido = 0;
        renderDinheiro();
    }

    public ContaPoupanca(String agencia, String numeroDaContaDoNovoCliente, String numeroDaContaDoUltimoCliente, double saldoTotal) 
    {
        super(agencia, numeroDaContaDoNovoCliente, numeroDaContaDoUltimoCliente, saldoTotal);
        this.rendimento = 10;
        this.saldoInvestido = 0;
        renderDinheiro();
    }
    
    void renderDinheiro()
    {
        double acrescimo = (this.rendimento*getSaldoInvestido())/100;
        setSaldoInvestido(getSaldoInvestido()+acrescimo);
        super.setSaldoTotal(super.getSaldoTotal()+saldoInvestido);
    }
    
    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    public double getSaldoInvestido() {
        return saldoInvestido;
    }

    public void setSaldoInvestido(double saldoInvestido) {
        this.saldoInvestido = saldoInvestido;
    }

    @Override
    public String toString() {
        return super.toString() + " 2 " + rendimento + " " + saldoInvestido + "\n";
    }
    
    
}
