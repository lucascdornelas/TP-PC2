package Exception;

public class NaoExisteDadosException extends Exception{
    
    public  NaoExisteDadosException()
    {
        super("Dados Ausentes");
    }
}
