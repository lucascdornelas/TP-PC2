package servicos;
import dominio.*;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

/* Classe para registrar e ler dados de um arquivo de texto
   para inicializacao de uma variavel do tipo pessoa. */

public class Memoria {
    private Banco banco;

    public Memoria(Banco banco) {
        this.banco = banco;
    }
      
    public void lerBanco(){
        //String[] arquivos = 
        // Retornar uma array contendo tudo? sim
        File diretorio = new File("pessoas");

        for(int i = 0; i < diretorio.listFiles().length; i++){
            String login = Integer.toString(i+1);
            
            // Criar diretorio separado para pessoas para facilitar contagem no for (editar)
            ReadTextFile.openFile("pessoas/" + login + ".txt");
            
            ArrayList<String> dadosPessoa = ReadTextFile.readRecords();
            /*
            for(String d : dadosPessoa){
                System.out.println(d);
            }
            System.out.println(dadosPessoa.get(0).toString());*/
            int senha = Integer.parseInt(dadosPessoa.get(0));

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

            // Conta
            String words[] = dadosPessoa.get(10).split(" ");
            String agencia = words[0] ;
            String numeroDaConta = words[1];
            String numeroContaNovoCliente = words[2];
            String numeroContaUltimoCliente = words[3];
            String Saldo = words[4];
            String tipoConta = words[5];
            String aux1 = words[6];
            String aux2 = words[7];
            
            String id = dadosPessoa.get(11);
            
            Pessoa pessoa = new Pessoa(nome, contato, endereco, login, senha, id);

            if(tipoConta.equals("1")){
                double saldoDisponivel = Double.parseDouble(aux1);
                double taxaMensal = Double.parseDouble(aux2);
                
                ContaCorrente conta1 = new ContaCorrente(agencia, numeroContaNovoCliente, numeroContaUltimoCliente, Double.parseDouble(Saldo));
                conta1.setNumero(numeroDaConta);
                conta1.setSaldoTotal(Double.parseDouble(Saldo));
                conta1.setTaxaMensal(taxaMensal);
                
                pessoa.setContas(conta1);
            }
            else {
                double rendimento = Double.parseDouble(aux1);
                double saldoInvestido = Double.parseDouble(aux2); 
                
                ContaPoupanca conta1 = new ContaPoupanca(agencia, numeroContaNovoCliente, numeroContaUltimoCliente, Double.parseDouble(Saldo));
                conta1.setNumero(numeroDaConta);
                conta1.setRendimento(rendimento);
                conta1.setSaldoInvestido(saldoInvestido);
                
                pessoa.setContas(conta1);
            }
/*
            try 
            {
                words = dadosPessoa.get(11).split(" ");
                agencia = words[0] ;
                numeroDaConta = words[1];
                numeroContaNovoCliente = words[2];
                numeroContaUltimoCliente = words[3];
                Saldo = words[4];
                tipoConta = words[5];
                aux1 = words[6];
                aux2 = words[7];

                if(tipoConta.equals("1")){
                    double saldoDisponivel = Double.parseDouble(aux1);
                    double taxaMensal = Double.parseDouble(aux2);

                    ContaCorrente conta1 = new ContaCorrente(agencia, numeroContaNovoCliente, numeroContaUltimoCliente, Double.parseDouble(Saldo));
                    conta1.setNumero(numeroDaConta);
                    conta1.setSaldoTotal(Double.parseDouble(Saldo));
                    conta1.setTaxaMensal(taxaMensal);

                    pessoa.setContas(conta1);
                }
                else {
                    double rendimento = Double.parseDouble(aux1);
                    double saldoInvestido = Double.parseDouble(aux2); 

                    ContaPoupanca conta1 = new ContaPoupanca(agencia,numeroContaNovoCliente, numeroContaUltimoCliente, Double.parseDouble(Saldo));
                    conta1.setNumero(numeroDaConta);
                    conta1.setRendimento(rendimento);
                    conta1.setSaldoInvestido(saldoInvestido);

                    pessoa.setContas(conta1);
                }

            }
            catch (Exception e)
            {
                System.err.println("Apenas uma conta cadastrada");
            }
*/
            //System.out.println(pessoa.toString());
            
            this.banco.getClientes().add(pessoa);

            ReadTextFile.closeFile();
        }
    }

}
