package servicos;

import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile{
    private static Scanner input;

    //open file
    public static void openFile(String arquivoURL){
        try
        {
            input = new Scanner(Paths.get(arquivoURL)); 
        } 
        catch (IOException ioException)
        {
            System.err.println("Error opening file. Terminating.");
            System.exit(1);
        } 
   }

    //read record from file
    public static ArrayList<String> readRecords(){
        ArrayList<String> palavras = new ArrayList();
        
        try 
        {
            while(input.hasNext())
            {
                String a = input.nextLine();
                palavras.add(a);
            }
            
        } 
        catch (NoSuchElementException elementException)
        {
            System.err.println("File improperly formed. Terminating.");
        } 
        catch (IllegalStateException stateException)
        {
            System.err.println("Error reading from file. Terminating.");
        }
      
      return palavras;
    } // end method readRecords

    // close file and terminate application
    public static void closeFile(){
        if (input != null)
            input.close();
    } 
} // end class ReadTextFile
