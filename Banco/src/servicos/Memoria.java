package servicos;
import dominio.Pessoa;
import java.io.File;
import java.io.FileWriter;

/* Classe para registrar e ler dados de um arquivo de texto
   para inicializacao de uma variavel do tipo pessoa. */

public class Memoria {

    /* Recebe uma variavel pessoa e grava seus dados
    em um arquivo com seu nome no diretorio "pessoas". */
    public static void gravarPessoa(Pessoa pessoa){
        File diretorio = new File("pessoas");
        File arquivo = new File("");

        // Verifica se arquivo ja existe para tal pessoa.
        boolean existe = false;
        for(int i = 0; i < diretorio.listFiles().length; i++){
            if( (pessoa.getNome() + ".txt").equals(diretorio.listFiles()[i].getName())  ){
                existe = true;
                arquivo = new File("pessoa/" + pessoa.getNome() + ".txt");
                break;
            }
        }

        // Cria um arquivo para a pessoa caso ela nao exista
        if(!existe){
            arquivo = new File("pessoa/" + pessoa.getNome() + ".txt");
            try{
                arquivo.createNewFile();
            }
            catch (Exception e){
                System.out.println("Nao foi possivel criar arquivo.");
            }
        }

        // Inicia o processo de registro dos dados no arquivo da pessoa
        try{
            // Reescrita de dados no arquivo
            FileWriter fileWriter = new FileWriter(arquivo, false);
            // Dados sao adicionados na ordem que sao declarados na classe Pessoa.
            // Adiciona nome da pessoa no arquivo
            fileWriter.write(String.format("%s\n", pessoa.getNome()));

            /* Implementar para demais tipos de dado.*/

            fileWriter.close();
        }
        catch (Exception e){
            System.out.println("Nao foi possivel acessar arquivo.");
        }
    }

    // Le dados do arquivo de uma pessoa
    public static void lerPessoa(Pessoa pessoa){
        // Retornar uma array contendo tudo?
    }

}
