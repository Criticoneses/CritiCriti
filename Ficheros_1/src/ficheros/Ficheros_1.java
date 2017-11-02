/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author H
 */
public class Ficheros_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("ficheros/fichero_original.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("ficheros/fichero_copia.txt"));
             
            copiarFichero(bw, br);
        } catch (IOException e) {
            System.out.println("Error en JAVA.IO Ficheros: [L:30 FICHEROS_1.java]" + e);
        }
    }

     

    public static void copiarFichero(BufferedWriter bw, BufferedReader br) throws IOException {
            
        String linea = br.readLine();
        while (linea != null) {
            
            bw.write(linea);
            bw.newLine();
            linea = br.readLine();
        }
        
        bw.flush();
        br.close();
        System.out.println("Fichero copiado...");
    }

}
