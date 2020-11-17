/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import Exception.NaoTemDinheiroException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author erick
 */
public class Banco {
    
    private ArrayList<Pessoa> clientes;

    public Banco() {
        this.clientes = new ArrayList<>();
    }

    public ArrayList<Pessoa> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Pessoa> clientes) {
        this.clientes = clientes;
    }
    
    public String abrirConta(Pessoa pessoa, Conta conta)
    {
        pessoa.setContas(conta);
        clientes.add(pessoa);
        
        String mensage = String.format("SEJA BEM VINDO AO NOSSO BANCO %s, SUA CONTA FOI CRIADA\nLOGIN: %s\nSENHA: %d",pessoa.getNome(),pessoa.getLoginDaConta(),pessoa.getSenhaDaConta());
        return mensage;
        //JOptionPane.showMessageDialog(null,mensage ,"CONTA CRIADA COM SUCESSO!", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public String verificaLogin(String login, String senha)
    {
        Iterator<Pessoa> it = clientes.iterator();
        
        while(it.hasNext())
        {
            Pessoa aux = it.next();
            if(aux.getLoginDaConta().equals(login))
            {
                if(aux.getSenhaDaConta() == Integer.parseInt(senha))
                {
                    return aux.getNome();
                }
            }
        }
        return null;
    }
    
    public double saldoContaCliente(String numeroDaConta)
    {
        Iterator<Pessoa> it_pessoas = clientes.iterator();
        
        while(it_pessoas.hasNext())
        {
            Pessoa aux_pessoas = it_pessoas.next();
            if(aux_pessoas.getLoginDaConta().equals(numeroDaConta))
            {
                Iterator<Conta> it_contas = aux_pessoas.getContas().iterator();
                while(it_contas.hasNext())
                {
                    Conta conta_aux = it_contas.next();
                    
                    if(conta_aux.getNumero().equals(numeroDaConta))
                        return conta_aux.getSaldoTotal();
                }
            }
        }
        return 0;
    }
    
    public void saque(String numeroDaConta, double valorDoSaque) throws NaoTemDinheiroException
    {
        double saldo = saldoContaCliente(numeroDaConta);
        if(saldo >= valorDoSaque)
        {
            Iterator<Pessoa> it_pessoas = clientes.iterator();
        
            while(it_pessoas.hasNext())
            {
                Pessoa aux_pessoas = it_pessoas.next();
                if(aux_pessoas.getLoginDaConta().equals(numeroDaConta))
                {
                    Iterator<Conta> it_contas = aux_pessoas.getContas().iterator();
                    while(it_contas.hasNext())
                    {
                        Conta conta_aux = it_contas.next();

                        if(conta_aux.getNumero().equals(numeroDaConta))
                        {
                            conta_aux.setSaldoTotal(conta_aux.getSaldoTotal()-valorDoSaque);
                        }

                    }
                }
            }    
        }
        else
        {
            throw new NaoTemDinheiroException();
        }
    }
}
