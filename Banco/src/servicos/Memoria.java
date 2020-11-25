package servicos;
import dominio.*;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

/* Classe para registrar e ler dados de um arquivo de texto
   para inicializacao de uma variavel do tipo pessoa. */

public class Memoria {
    private Banco banco;

    public Memoria(Banco banco) 
    {
        this.banco = banco;
    }
   
    /* Recebe uma variavel pessoa e grava seus dados
    em um arquivo com seu nome no diretorio "pessoas". */
    
    public void lerBanco()
    {
        //String[] arquivos = 
        // Retornar uma array contendo tudo? sim
        File diretorio = new File("pessoas");

        for(int i = 0; i < 10; i++)
        {
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
            String words[] = dadosPessoa.get(10).split(" ");
            String agencia = words[0] ;
            String numeroDaConta = words[1];
            String numeroContaNovoCliente = words[2];
            String numeroContaUltimoCliente = words[3];
            String Saldo = words[4];
            String tipoConta = words[5];
            String var1 = words[6];
            String var2 = words[7];

            if(tipoConta.equals("1")){
                Conta conta1 = new ContaCorrente(agencia, numeroContaNovoCliente, numeroContaUltimoCliente, Double.parseDouble(Saldo));
                conta1.setNumero(numeroDaConta);
                pessoa.setContas(conta1);
            }
            else {
                Conta conta1 = new ContaPoupanca(agencia,numeroContaNovoCliente, numeroContaUltimoCliente, Double.parseDouble(Saldo));
                conta1.setNumero(numeroDaConta);
                pessoa.setContas(conta1);
            }

            try 
            {
                words = dadosPessoa.get(11).split(" ");
                agencia = words[0] ;
                numeroDaConta = words[1];
                numeroContaNovoCliente = words[2];
                numeroContaUltimoCliente = words[3];
                Saldo = words[4];
                tipoConta = words[5];
                var1 = words[6];
                var2 = words[7];

                if(tipoConta.equals("1")){
                    Conta conta2 = new ContaCorrente(agencia, numeroContaNovoCliente, numeroContaUltimoCliente, Double.parseDouble(Saldo));
                    conta2.setNumero(numeroDaConta);
                    pessoa.setContas(conta2);
                }
                else {
                    Conta conta2 = new ContaPoupanca(agencia,numeroContaNovoCliente, numeroContaUltimoCliente, Double.parseDouble(Saldo));
                    conta2.setNumero(numeroDaConta);
                    pessoa.setContas(conta2);
                }

            }
            catch (Exception e)
            {
                System.out.println("Apenas uma conta cadastrada");
            }

            banco.clientes.add(pessoa);

            ReadTextFile.closeFile();
        }
        int a = 10;
        //return this.banco;
    }

}
