package Exception;

public class NaoExisteContaException extends Exception 
{
    public  NaoExisteContaException()
    {
        super("NAO EXISTE ESSA CONTA");
    }
}
