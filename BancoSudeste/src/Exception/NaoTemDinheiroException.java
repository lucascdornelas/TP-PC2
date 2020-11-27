package Exception;

public class NaoTemDinheiroException extends Exception 
{
    public  NaoTemDinheiroException()
    {
        super("VOCE NAO POSSUI ESSE VALOR DISPONIVEL PARA O SAQUE/TRANSFERENCIA");
    }
    
}
