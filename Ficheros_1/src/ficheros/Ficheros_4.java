/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author H
 */

/*HONDA REBEL 500
APRILIA RS 50
YAMAHA BOLD 950*/
public class Ficheros_4 {

   public static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("ficheros/fichero_4.txt",true));
        
        escribirEnFichero(bw);
    }

    public static void escribirEnFichero(BufferedWriter bw) throws IOException {

        System.out.println("Escribe la marca: ");
        String marca = sc.next();
         System.out.println("Escribe el modelo: ");
        String modelo = sc.next();
         System.out.println("Escribe la cilindrada: ");
        String cc = sc.next();
        
        String linea = marca+" "+modelo+" "+cc;
        bw.write(linea);
        bw.newLine(); 
        bw.flush();
    }
}
