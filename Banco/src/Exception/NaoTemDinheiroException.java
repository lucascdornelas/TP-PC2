/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

/**
 *
 * @author erick
 */
public class NaoTemDinheiroException extends Exception 
{
    public  NaoTemDinheiroException()
    {
        super("VOCÊ NÃO POSSUI ESSE VALOR DISPONÍVEL PARA O SAQUE");
    }
    
}
