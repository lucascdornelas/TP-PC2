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
public class ContaPoupanca {
    
    private double rendimento;
    private double saldoInvestido;

    public ContaPoupanca(double rendimento, double saldoInvestido) {
        this.rendimento = rendimento;
        this.saldoInvestido = saldoInvestido;
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
    
    
    
}
