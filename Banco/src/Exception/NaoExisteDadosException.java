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
public class NaoExisteDadosException extends Exception{
    
    public  NaoExisteDadosException()
    {
        super("Dados Ausentes");
    }
}
