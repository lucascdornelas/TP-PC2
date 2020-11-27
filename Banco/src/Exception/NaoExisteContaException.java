package Exception;

public class NaoExisteContaException extends Exception 
{
    public  NaoExisteContaException()
    {
        super("NÃO EXISTE ESSA CONTA");
    }
}
