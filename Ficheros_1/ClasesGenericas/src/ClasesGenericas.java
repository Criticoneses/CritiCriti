/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author VicDance
 */
public class ClasesGenericas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Bolsa.RunTimeException{
        
        Bolsa<Chocolatina> bolsa= new Bolsa<Chocolatina>();
        
        Bolsa b= new Bolsa(5);
        Chocolatina c= new Chocolatina("milka");
        Chocolatina c1= new Chocolatina("milka");
        Chocolatina c2= new Chocolatina("Kinder");
        Chocolatina c3= new Chocolatina("milka");
        Chocolatina c4= new Chocolatina("Kinder");
       // Chocolatina c5= new Chocolatina("kinder");
        
        bolsa.añadir(c);
        bolsa.añadir(c1);
        bolsa.añadir(c2);
        bolsa.añadir(c3);
        bolsa.añadir(c4);
        //bolsa.añadir(c5);
        
        for(Chocolatina choc:bolsa){
            
            System.out.print(choc.getMarca());
        }
    }
    
}
