/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominioBanco;

/**
 *
 * @author erick
 */
public class ContaCorrente extends Conta {
    private double saldoDisponivel;
    private double taxaMensal;

    public ContaCorrente(double saldoDisponivel, double taxaMensal, String agencia, String numero, double saldoTotal) {
        super(agencia, numero, saldoTotal);
        this.saldoDisponivel = saldoDisponivel;
        this.taxaMensal = taxaMensal;
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
    
    
}
