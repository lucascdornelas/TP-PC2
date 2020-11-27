package servicos;

import dominio.Pessoa;
import java.io.File;

public class DeleteTextFile 
{
    public static void apagarConta(Pessoa cliente)
    {
        String login = cliente.getLoginDaConta();
        File diretorio = new File("pessoas");
        File file = new File("pessoas/" + login + ".txt");
        
        file.delete();
    }
}
