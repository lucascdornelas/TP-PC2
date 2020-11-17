/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

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
    
}
