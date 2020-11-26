package servicos;

import dominio.Banco;
import dominio.Conta;
import dominio.Pessoa;
import java.io.FileNotFoundException;         
import java.util.ArrayList;
import java.util.Formatter;               
import java.util.FormatterClosedException;
import java.util.Iterator;
import java.util.NoSuchElementException;               

public class CreateTextFile{
   private static Formatter output; // outputs text to a file       

   // open file clients
   public static void openFile(String URL){
        //String mensage = null;
        try {
            output = new Formatter("./pessoas/" + URL); // open the file
        } catch (SecurityException securityException) {
            //mensage = ("Write permission denied. Terminating.");
            System.err.println("Write permission denied. Terminating.");
            System.exit(1); // terminate the program
        } catch (FileNotFoundException fileNotFoundException) {
            //mensage = ("Error opening file. Terminating.");
            System.err.println("Error opening file. Terminating.");
            System.exit(1); // terminate the program
        }
        //return mensage;
    }

   // add records to file
   public static void addRecords(Banco b){
       //String mensageReturn;
        try {
            ArrayList<Pessoa> clientes = b.getClientes();
            String URL = null;
            
            Iterator<Pessoa> it = clientes.iterator();
            
            while(it.hasNext()){
                
                Pessoa cliente = it.next();
                
                URL = cliente.getLoginDaConta() + ".txt";
                openFile(URL);
                
                String senha = String.valueOf(cliente.getSenhaDaConta());
                String nome = cliente.getNome();
                
              
                output.format("%s\n", senha); 
                output.format("Dados do Usuario:\n%s\n", nome); 
                
                String telefone = cliente.getContato().getTelefone();
                String email = cliente.getContato().getEmail();
                
                output.format("%s\n%s\n", telefone, email); 
                
                String rua = cliente.getEndereco().getRua();
                String numero = cliente.getEndereco().getNumero();
                String bairro = cliente.getEndereco().getBairro();
                String cidade = cliente.getEndereco().getCidade();
                String estado = cliente.getEndereco().getEstado();
                
                output.format("%s\n%s\n%s\n%s\n%s\n", rua, numero, bairro, cidade, estado);
                
                ArrayList<Conta> contas = cliente.getContas();
                
                String conta = "";
                
                for(Conta c : contas){
                    conta = c.toString();
                    output.format("%s", conta);
                }
                
                String id = cliente.getId();
                output.format("%s", id);
                closeFile();
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
