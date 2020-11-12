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
public class Conta {
    
    private String agencia;
    private String numero;
    private double saldoTotal;

    public Conta(String agencia, String numero, double saldoTotal) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldoTotal = saldoTotal;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }
    
    
}
