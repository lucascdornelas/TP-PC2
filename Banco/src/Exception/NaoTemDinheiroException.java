package Exception;

public class NaoTemDinheiroException extends Exception 
{
    public  NaoTemDinheiroException()
    {
        super("VOCÊ NÃO POSSUI ESSE VALOR DISPONÍVEL PARA O SAQUE/TRANSFERÊNCIA");
    }
    
}
