/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit;

/**
 *
 * @author VicDance
 */
public class BRException extends Exception{
    
    BRException(){
        
    }
    public String toString(){
        
        return "No se ha podido realizar la operación";
    }
}
