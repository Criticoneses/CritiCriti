/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros;

import Clases.Alumno;
import Clases.Jugador;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * Crear un clase alumno con el formato: Nombre, edad, nota_matematicas,
 * nota_lengua, nota_ingles Haz como el ejercicio Fichero_2: Crea una lista,
 * carga los alumnos desde un ficheor e imprimelos. METODOS: - mediaAlumnos():
 * Calculará la media de cada alumno - mejorNota(): Devuelve la mejor nota de
 * cada alumno - alumnoMasJoven() Devuelve el almuno mas joven
 */
public class Ficheros_3 {

    static ArrayList<Alumno> lista = new ArrayList<Alumno>();

    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader("ficheros/fichero_3.txt"));
            cargarAlumnos(br);
        } catch (IOException ex) {
            Logger.getLogger(Ficheros_3.class.getName()).log(Level.SEVERE, null, ex);
        }
        //mediaAlumnos();
        mejorNota();
        menorEdad();
    }

    public static void cargarAlumnos(BufferedReader br) throws IOException {
        String linea = br.readLine();

        while (linea != null) {
            if (!linea.equals("")) {

                //Separar linea por ; con split
                String[] linea_array = linea.split(";");
                Alumno a = new Alumno(linea_array[0], Integer.parseInt(linea_array[1]), Double.parseDouble(linea_array[2]), Double.parseDouble(linea_array[3]), Double.parseDouble(linea_array[4]));
                lista.add(a);
            }
            linea = br.readLine();

        }

        br.close();
      //  imprimirListaAlumnos();

    }

    private static void imprimirListaAlumnos() {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }

    public static void mediaAlumnos() {
        
        for (int i = 0; i < lista.size(); i++) {
            
            Alumno a = lista.get(i);
            
            double nota_mate=a.getNotaMatematicas();
            double nota_lengua = a.getNotaLengua();
            double nota_ingle = a.getNotaIngles();
            
            DecimalFormat df = new DecimalFormat("##.##");
            double media = (nota_ingle+nota_mate+nota_lengua)/3;
             
            System.out.println("El alumno "+a.getNombre()+" tiene una media de: "+df.format(media));
            
        }
    }
    
    public static void mejorNota(){
        for (int i = 0; i < lista.size(); i++) {
            
            Alumno a = lista.get(i);
            
            double nota_mate=a.getNotaMatematicas();
            double nota_lengua = a.getNotaLengua();
            double nota_ingle = a.getNotaIngles();
            
            if(nota_ingle > nota_lengua && nota_ingle > nota_mate) {
                System.out.println("El alumno " + a.getNombre() + " tiene la nota mas alta de inglés con un: " + a.getNotaIngles());   
            } else if(nota_lengua > nota_ingle && nota_lengua > nota_mate) {
                System.out.println("El alumno " + a.getNombre() + " tiene la nota mas alta de lengua con un: " + a.getNotaLengua());   
            } else if(nota_mate > nota_ingle && nota_mate > nota_lengua) {
                System.out.println("El alumno " + a.getNombre() + " tiene la nota mas alta de matemáticas con un: " + a.getNotaMatematicas());   
            } else {
                System.out.println("El alumno " + a.getNombre() + " tiene nota más alta ");
            }
        }   
    }
    
    public static void menorEdad(){
        int min_edad=200;
        String nombre_alumno_max_edad="";
        for (int i = 0; i < lista.size(); i++) {
             Alumno a = lista.get(i);
            
            int edad=a.getEdad();
            
            if(edad<min_edad){
                min_edad=edad;
                nombre_alumno_max_edad = a.getNombre();
            }
        }
        
        System.out.println("El alumno "+nombre_alumno_max_edad+" es el menor con "+min_edad);
    }
}
