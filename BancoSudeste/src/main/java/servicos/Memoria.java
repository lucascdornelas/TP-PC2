package servicos;

import dominio.*;
import java.io.File;
import java.util.ArrayList;

/* Classe para registrar e ler dados de um arquivo de texto
   para inicializacao de uma variavel do tipo pessoa. */

public class Memoria {
    private Banco banco;
    private int limiteContaUsuario;

    public Memoria(Banco banco) {
        this.banco = banco;
        this.limiteContaUsuario = 11;
    }
      
    public void lerBanco(){
        // Retornar uma array contendo tudo? sim
        File diretorio = new File("pessoas");
        //System.out.println(diretorio.listFiles().length);
        for(int i = 0; i < diretorio.listFiles().length; i++)
        {
            String login = Integer.toString(i+1);
            
            // Criar diretorio separado para pessoas para facilitar contagem no for (editar)
            File file = new File("pessoas/" + login + ".txt");
            while(!file.exists())
            {
                i++;
                login = Integer.toString(i+1);
                file = new File("pessoas/" + login + ".txt");
            }
                ReadTextFile.openFile("pessoas/" + login + ".txt");

            ArrayList<String> dadosPessoa = ReadTextFile.readRecords();
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
            
            //identificação da pessoas, cpf ou cnpj
            String id = dadosPessoa.get(10);
            
            Endereco endereco = new Endereco(rua, numero, bairro, cidade, estado);
            
            Pessoa pessoa = new Pessoa(nome, contato, endereco, login, senha, id);
            
            Conta conta1;
            
            // Contas
            for(int j = limiteContaUsuario; j > 1; j++){
                try {
                    String words[] = dadosPessoa.get(j).split(" ");
                    String agencia = words[0] ;
                    String numeroDaConta = words[1];
                    String numeroContaNovoCliente = words[2];
                    String numeroContaUltimoCliente = words[3];
                    String Saldo = words[4];
                    String tipoConta = words[5];
                    String aux1 = words[6];
                    String aux2 = words[7];

                    if(tipoConta.equals("1"))
                    {
                        double saldoDisponivel = Double.parseDouble(aux1);
                        double taxaMensal = Double.parseDouble(aux2);

                        ContaCorrente conta2 = new ContaCorrente(agencia, numeroContaNovoCliente, numeroContaUltimoCliente, Double.parseDouble(Saldo));
                        conta2.setNumero(numeroDaConta);
                        conta2.setSaldoTotal(Double.parseDouble(Saldo));
                        conta2.setTaxaMensal(taxaMensal);
                        
                        conta1 = conta2;

                        pessoa.setContas(conta1);
                    }
                    else 
                    {
                        double rendimento = Double.parseDouble(aux1);
                        double saldoInvestido = Double.parseDouble(aux2); 

                        ContaPoupanca conta2 = new ContaPoupanca(agencia, numeroContaNovoCliente, numeroContaUltimoCliente, Double.parseDouble(Saldo));
                        conta2.setNumero(numeroDaConta);
                        conta2.setRendimento(rendimento);
                        conta2.setSaldoInvestido(saldoInvestido);

                        conta1 = conta2;
                        
                        pessoa.setContas(conta1);
                    }
                }
                catch (Exception e){
                    //System.err.println(11 - i + " Contas cadastradas!");
                    j = -1; 
                }
            }

            this.banco.getClientes().add(pessoa);

            ReadTextFile.closeFile();
        }
    }
}