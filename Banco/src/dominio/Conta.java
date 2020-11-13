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
public class Conta {
    
    private String agencia;
    private String numeroDaContaDoNovoCliente;
    private String numeroDaContaDoUltimoCliente;
    private double saldoTotal;

    public Conta() {
        this.agencia = "0001";
        this.numeroDaContaDoUltimoCliente = "0";
        this.numeroDaContaDoNovoCliente = "";
        this.saldoTotal = 0;
        definindoNumeroDaConta();
    }

    void definindoNumeroDaConta()
    {
        int numeroDoUltimoCliente = Integer.parseInt(numeroDaContaDoUltimoCliente);
        int numeroNovoCliente = numeroDoUltimoCliente + 1;
        numeroDoUltimoCliente++;
        
        setNumeroDaContaDoUltimoCliente(Integer.toString(numeroDoUltimoCliente));
        setnumeroDaContaDoNovoCliente(Integer.toString(numeroNovoCliente));
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
}
