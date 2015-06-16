/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimeraexception;

/**
 *
 * @author T-107
 */
public class MenorEdadException extends Exception{
    public  MenorEdadException ()
    {
    // super se usa en un constructor inmediatamente y adentro se pone el argumento del papá
    super("Eres un chamaco pervertido, le diré a tu mamá, no te puedo" +"Registrar");
    
        
    }
    
}
