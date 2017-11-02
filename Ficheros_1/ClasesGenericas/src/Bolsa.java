
import java.util.ArrayList;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VicDance
 */
public class Bolsa<T> implements Iterable<T>{

    private ArrayList<T> lista= new ArrayList<T>();
    private int tope;
    
    public Bolsa(int tope){
        
        super();
        this.tope=tope;
    }

    Bolsa() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void añadir(T objeto) throws RunTimeException{
        
        if(lista.size()<tope){
            
            lista.add(objeto);
        }else throw new RunTimeException("No caben mas objetos en la bolsa");
    }
    
    @Override
    public Iterator<T> iterator() {
        
        return lista.iterator();
    }

    public static class RunTimeException extends Exception {

        public RunTimeException(String no_caben_mas_objetos_en_la_bolsa) {
        }
    }
    
}
