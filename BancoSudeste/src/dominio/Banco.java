package dominio;

import Exception.NaoExisteContaException;
import Exception.NaoExisteDadosException;
import Exception.NaoTemDinheiroException;
import Exception.SaqueDepositoException;

import java.util.ArrayList;
import java.util.Iterator;
import servicos.CreateTextFile;
import servicos.DeleteTextFile;

public class Banco {
    
    private ArrayList<Pessoa> clientes;

    public Banco() {
        this.clientes = new ArrayList<>();
    }

    public ArrayList<Pessoa> getClientes(){
        return clientes;
    }

    public void setClientes(ArrayList<Pessoa> clientes) {
        this.clientes = clientes;
    }
    
    public String abrirConta(Pessoa pessoa, Conta conta) throws NaoExisteDadosException {
        String mensage = "";
        
        // se nao tem cliente
        if(this.getClientes().isEmpty())
        {
            if(!((pessoa.getNome().equals("")) || (pessoa.getContato().getEmail().equals("")) || (pessoa.getEndereco().getCidade().equals("")) 
                || (pessoa.getEndereco().getEstado().equals("")) ))
            {
                
                pessoa.setContas(conta);
                clientes.add(pessoa);

                mensage = String.format("SEJA BEM VINDO AO NOSSO BANCO %s, SUA CONTA FOI CRIADA\nLOGIN: %s\nSENHA: %d",
                        pessoa.getNome(),pessoa.getLoginDaConta(),pessoa.getSenhaDaConta());
               }

            else
                throw new NaoExisteDadosException();
        }
        else
        {
            int cont = 0;
            for(Pessoa p : this.getClientes())
            {
                if(p.equals(pessoa))
                {
                    p.setContas(conta);
                    mensage = "Conta Adicionada ao Usuario ja cadastrado anteriormente!";
                    //abrirNada(pessoa, conta);
                    return mensage;
                }
                cont++;
            }
            if(cont == this.getClientes().size())
            {
                    if(!((pessoa.getNome().equals("")) || (pessoa.getContato().getEmail().equals("")) 
                    || (pessoa.getEndereco().getCidade().equals("")) || (pessoa.getEndereco().getEstado().equals("")) ))
                    {
                        pessoa.setContas(conta);
                        clientes.add(pessoa);

                        mensage = String.format("SEJA BEM VINDO AO NOSSO BANCO %s, SUA CONTA FOI CRIADA\nLOGIN: %s\nSENHA: %d",
                                pessoa.getNome(),pessoa.getLoginDaConta(),pessoa.getSenhaDaConta());
                    }

                    else
                        throw new NaoExisteDadosException();
            }       
        }
        
        return mensage;
    }
    
    public void fecharConta(String id, Conta conta, String numeroContaASerFechada)
    {
        Iterator<Pessoa> it_pessoa = clientes.iterator();
        
        while(it_pessoa.hasNext())
        {
            Pessoa aux_pessoa = it_pessoa.next();
            
            if(aux_pessoa.getId().equals(id))
            {
                DeleteTextFile.apagarConta(aux_pessoa);
            }
        }
    }
    
    public String[] verificaLogin(String login, String senha) throws NaoExisteContaException
    {
        String retorno[] = new String[2];
        int registrador = 0;
        Iterator<Pessoa> it = clientes.iterator();
        
        while(it.hasNext()){
            
            Pessoa aux = it.next();
            if(aux.getLoginDaConta().equals(login))
            {
                if(aux.getSenhaDaConta() == Integer.parseInt(senha))
                {
                    retorno[0] = aux.getNome();
                    retorno[1] = aux.getId();
                    registrador++;
                    return retorno;
                }
            }
        }
        if(registrador == 0)
        {
            throw new NaoExisteContaException();
        }
        return null;
    }
    
    public double saldoContaCliente(String numeroDaConta)
    {
        Iterator<Pessoa> it_pessoas = clientes.iterator();
        
        while(it_pessoas.hasNext())
        {
            Pessoa aux_pessoas = it_pessoas.next();
            Iterator<Conta> it_conta = aux_pessoas.getContas().iterator();
            while(it_conta.hasNext())
            {
                Conta conta_aux = it_conta.next();
                
                if(conta_aux.getNumero().equals(numeroDaConta))
                {
                    return conta_aux.getSaldoTotal();
                }       
            }
        }    
        return 0;
    }
    
    public void saque(String numeroDaConta, double valorDoSaque) throws SaqueDepositoException, NaoTemDinheiroException
    {
        double saldo = saldoContaCliente(numeroDaConta);
        if(valorDoSaque<0)
            throw new SaqueDepositoException();
        
        if(saldo >= valorDoSaque)
        {
            Iterator<Pessoa> it_pessoas = clientes.iterator();
        
            while(it_pessoas.hasNext())
            {
                Pessoa aux_pessoas = it_pessoas.next();
                Iterator<Conta> it_conta = aux_pessoas.getContas().iterator();
                while(it_conta.hasNext())
                {
                    Conta conta_aux = it_conta.next();

                    if(conta_aux.getNumero().equals(numeroDaConta))
                    {
                        conta_aux.setSaldoTotal(conta_aux.getSaldoTotal() - valorDoSaque);
                    }       
                }
            }        
        }
        else
        {
            throw new NaoTemDinheiroException();
        }
    }
    
    public void deposito(String numeroDaConta, double valorDeposito) throws SaqueDepositoException, NaoExisteContaException
    {
        int registrador = 0;
        if(valorDeposito<0)
            throw new SaqueDepositoException();
        
        Iterator<Pessoa> it_pessoas = clientes.iterator();

        while (it_pessoas.hasNext()) 
        {
            Pessoa aux_pessoas = it_pessoas.next();
            Iterator<Conta> it_conta = aux_pessoas.getContas().iterator();
            while(it_conta.hasNext())
            {
                Conta conta_aux = it_conta.next();
                
                if(conta_aux.getNumero().equals(numeroDaConta))
                {
                    conta_aux.setSaldoTotal(conta_aux.getSaldoTotal() + valorDeposito);
                    registrador++;
                }                  
            }

        }
        if(registrador ==0)
            throw new NaoExisteContaException();
    }
    
    public void transferir(String numeroContaOrigem, String numeroDaContaDestino, double valorTransferencia) throws NaoExisteContaException, NaoTemDinheiroException, SaqueDepositoException
    {
        int registrador = 0;
        //se conseguir sacar, ele pode transferir

        this.saque(numeroContaOrigem,valorTransferencia);
        this.deposito(numeroDaContaDestino, valorTransferencia);
        /*
            Iterator<Pessoa> it_pessoas = clientes.iterator();

            while (it_pessoas.hasNext()) 
            {
                Pessoa aux_pessoas = it_pessoas.next();
                Iterator<Conta> it_conta = aux_pessoas.getContas().iterator();
                while(it_conta.hasNext())
                {
                    Conta conta_aux = it_conta.next();

                    if(conta_aux.getNumero().equals(numeroContaOrigem))
                    {
                        conta_aux.setSaldoTotal(conta_aux.getSaldoTotal() + valorTransferencia);//realizada
                        registrador ++;
                    }

                }
            }
           
            if(registrador == 0)
                throw new NaoExisteContaException();*/ 
    }
    
    public void salvarClientes(){
        
        CreateTextFile.addRecords(this);
    }
}
