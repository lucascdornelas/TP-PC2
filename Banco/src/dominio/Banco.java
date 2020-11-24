package dominio;

import Exception.NaoExisteContaException;
import Exception.NaoExisteDadosException;
import Exception.NaoTemDinheiroException;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import servicos.CreateTextFile;
import servicos.ReadTextFile;

public class Banco {
    
    private ArrayList<Pessoa> clientes;

    public Banco() {

        this.clientes = new ArrayList<>();

        File diretorio = new File("pessoas");

        for(int i = 0; i < diretorio.listFiles().length; i++){
                // Criar diretorio separado para pessoas para facilitar contagem no for (editar)
                ReadTextFile.openFile("pessoas/" + Integer.toString(i+1) + ".txt");
                ArrayList<String> dadosPessoa = ReadTextFile.readRecords();

                // Nome
                String nome = dadosPessoa.get(2);
                // Contato
                String telefone = dadosPessoa.get(3);
                String email = dadosPessoa.get(4);
                Contato contato = new Contato(telefone, email);
                // Endereco
                String rua = dadosPessoa.get(5);
                String numero = dadosPessoa.get(6);
                String bairro = dadosPessoa.get(7);
                String cidade = dadosPessoa.get(8);
                String estado = dadosPessoa.get(9);
                Endereco endereco = new Endereco(rua, numero, bairro, cidade, estado);

                Pessoa pessoa = new Pessoa(nome, contato, endereco);

                // Conta
                String agencia = dadosPessoa.get(10);
                String numeroDaConta = dadosPessoa.get(11);
                String numeroContaNovoCliente = dadosPessoa.get(12);
                String numeroContaUltimoCliente = dadosPessoa.get(13);
                String Saldo = dadosPessoa.get(14);
                String tipoConta = dadosPessoa.get(15);
                String var1 = dadosPessoa.get(16);
                String var2 = dadosPessoa.get(17);

                if(tipoConta.equals("1")){
                    Conta conta1 = new ContaCorrente(agencia, numeroContaNovoCliente, numeroContaUltimoCliente, Double.parseDouble(Saldo));
                    pessoa.setContas(conta1);
                }
                else {
                    Conta conta1 = new ContaPoupanca(agencia,numeroContaNovoCliente, numeroContaUltimoCliente, Double.parseDouble(Saldo));
                    pessoa.setContas(conta1);
                }


                try {
                    agencia = dadosPessoa.get(18);
                    numeroDaConta = dadosPessoa.get(19);
                    numeroContaNovoCliente = dadosPessoa.get(20);
                    numeroContaUltimoCliente = dadosPessoa.get(21);
                    Saldo = dadosPessoa.get(22);
                    tipoConta = dadosPessoa.get(23);
                    var1 = dadosPessoa.get(24);
                    var2 = dadosPessoa.get(25);

                    if(tipoConta.equals("1")){
                        Conta conta2 = new ContaCorrente(agencia, numeroContaNovoCliente, numeroContaUltimoCliente, Double.parseDouble(Saldo));
                        pessoa.setContas(conta2);
                    }
                    else {
                        Conta conta2 = new ContaPoupanca(agencia,numeroContaNovoCliente, numeroContaUltimoCliente, Double.parseDouble(Saldo));
                        pessoa.setContas(conta2);
                    }

                }
                catch (Exception e){
                    System.out.println("Apenas uma conta");
                }

                clientes.add(pessoa);

                ReadTextFile.closeFile();

            }


    }

    public ArrayList<Pessoa> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Pessoa> clientes) {
        this.clientes = clientes;
    }
    
    public String abrirConta(Pessoa pessoa, Conta conta) throws NaoExisteDadosException
    {
        if(!((pessoa.getNome().equals("")) || (pessoa.getContato().getEmail().equals("")) 
                || (pessoa.getEndereco().getCidade().equals("")) || (pessoa.getEndereco().getEstado().equals("")) ))
        {
            pessoa.setContas(conta);
            clientes.add(pessoa);

            String mensage = String.format("SEJA BEM VINDO AO NOSSO BANCO %s, SUA CONTA FOI CRIADA\nLOGIN: %s\nSENHA: %d",
                    pessoa.getNome(),pessoa.getLoginDaConta(),pessoa.getSenhaDaConta());
            return mensage; 
        }
        
        else
        {
            throw new NaoExisteDadosException();
        }
    }
    
    public void fecharConta(String nomeDoCliente, Conta conta, String numeroContaASerFechada)
    {
        Iterator<Pessoa> it_pessoa = clientes.iterator();
        
        while(it_pessoa.hasNext())
        {
            Pessoa aux_pessoa = it_pessoa.next();
            
            if(aux_pessoa.getNome().equals(nomeDoCliente))
            {
                Iterator<Conta> it_conta = aux_pessoa.getContas().iterator();
                while(it_conta.hasNext())
                {
                    Conta aux_conta = it_conta.next();
                    if(aux_conta.getNumero().equals(numeroContaASerFechada))
                    {
                        it_conta.remove();
                        it_pessoa.remove();                                              
                    }
                    
                }
            }
        }
    }
    
    public String verificaLogin(String login, String senha) throws NaoExisteContaException
    {
        int registrador = 0;
        Iterator<Pessoa> it = clientes.iterator();
        
        while(it.hasNext())
        {
            Pessoa aux = it.next();
            if(aux.getLoginDaConta().equals(login))
            {
                if(aux.getSenhaDaConta() == Integer.parseInt(senha))
                {
                    registrador++;
                    return aux.getNome();
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
    
    public void deposito(String numeroDaConta, double valorDeposito) 
    {
        Iterator<Pessoa> it_pessoas = clientes.iterator();

        while (it_pessoas.hasNext()) {
            Pessoa aux_pessoas = it_pessoas.next();
            if (aux_pessoas.getLoginDaConta().equals(numeroDaConta)) {
                Iterator<Conta> it_contas = aux_pessoas.getContas().iterator();
                while (it_contas.hasNext()) {
                    Conta conta_aux = it_contas.next();

                    if (conta_aux.getNumero().equals(numeroDaConta)) {
                        conta_aux.setSaldoTotal(conta_aux.getSaldoTotal() + valorDeposito);
                    }
                }
            }
        }
    }
    
    public void transferir(String numeroContaOrigem, String numeroDaContaDestino, double valorTransferencia) throws NaoExisteContaException, NaoTemDinheiroException
    {
        int registrador = 0;
        //se conseguir sacar, ele pode transferir
        this.saque(numeroContaOrigem,valorTransferencia);
        
            Iterator<Pessoa> it_pessoas = clientes.iterator();

            while (it_pessoas.hasNext()) 
            {
                Pessoa aux_pessoas = it_pessoas.next();
                if (aux_pessoas.getLoginDaConta().equals(numeroDaContaDestino)) {
                    Iterator<Conta> it_contas = aux_pessoas.getContas().iterator();
                    while (it_contas.hasNext()) 
                    {
                        Conta conta_aux = it_contas.next();
                        if (conta_aux.getNumero().equals(numeroDaContaDestino)) 
                        {
                                conta_aux.setSaldoTotal(conta_aux.getSaldoTotal() + valorTransferencia);//realizada
                                registrador ++;
                        }
                    }
                }
            }
            
            if(registrador == 0)
                throw new NaoExisteContaException();
    }
    
    public void salvarClientes(){
        CreateTextFile.addRecords(this);
    }
}
