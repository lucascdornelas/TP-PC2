package servicos;

import dominio.Banco;
import dominio.Pessoa;
import java.io.FileNotFoundException;         
import java.util.ArrayList;
import java.util.Formatter;               
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;               
import principal.Contato;

public class CreateTextFile
{
   private static Formatter output; // outputs text to a file       

   // open file agenda.txt
   public static void openFile(String URL){
      try{
         output = new Formatter(URL); // open the file
      } catch (SecurityException securityException) {
         System.err.println("Write permission denied. Terminating.");
         System.exit(1); // terminate the program
      } catch (FileNotFoundException fileNotFoundException) {
         System.err.println("Error opening file. Terminating.");
         System.exit(1); // terminate the program
      } 
   } 

   // add records to file
   public static void addRecords(Banco b){
        try {
            ArrayList<Pessoa> clientes = b.getClientes();
            String URL = null;
            for(Pessoa cliente : clientes){
                URL = cliente.getLoginDaConta() + ".txt";
                openFile(URL);
                
                //Arquivo de cada Cliente
                //Nome do arquivo: loginDaConta.txt
                //Linhas:
                //$ senha
                //$ Dados do Usuario:
                //$ nome do cliente
                //$ Contato:
                //$ telefone 
                //$ email
                //$ Endereço:
                //$ rua
                //$ numero
                //$ bairro;
                //$ cidade;
                //$ estado
                //$ Contas
                    //$ agencia
                    //$ numero
                    //$ numeroDaContaDoNovoCliente
                    //$ numeroDaContaDoUltimoCliente
                    //$ saldoTotal
                
                output.format("%d %s %s %s\n", ); 
                
            }
                                        
        } 
        catch (FormatterClosedException formatterClosedException)
        {
            System.err.println("Error writing to file. Terminating.");
        } 
        catch (NoSuchElementException elementException)
        {
            System.err.println("Invalid input. Please try again.");
        } 

   }

   // close file
   public static void closeFile(){
      if (output != null)
         output.close();
   } 
} // end class CreateTextFile
