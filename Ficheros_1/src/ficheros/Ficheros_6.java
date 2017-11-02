/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros;

import Clases.Agenda;
import Clases.Moto;
import static ficheros.Ficheros_5.lista_motos;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 *  Crea un programa que gestione una agenda de un club de padel.
 *  La información de la agenda se guarda en un fichero de la siguiente forma:
 * 
 * PISTA 1-31728184Y-Lunes-18:00
 * PISTA 2-12332123X-Martes-20:00
 * 
 * - Crear una clase Agenda
 * - Lee el fichero y cargalo en un ArrayList
 * - Crea los metodos:
 *    
 *      - modificarCita();      -> Pedira el DNI y si encuentra alguna cita con ese DNI nos pedirá que cambiemos el Día y la hora
 * 
 * - Imprimir antes y despues de cargar y modificar
 */
public class Ficheros_6 {
    
    public static ArrayList<Agenda> lista_agenda = new ArrayList<Agenda>();
    public static Scanner sc = new Scanner(System.in);
    
      public static void main(String[] args) throws FileNotFoundException, IOException {
          
          BufferedReader br = new BufferedReader(new FileReader("ficheros/fichero_6.txt"));
          cargarAgenda(br);
          imprimirAgenda();
          
          
      }
      
       private static void imprimirAgenda() {
        for (int i = 0; i < lista_agenda.size(); i++) {
            System.out.println(lista_agenda.get(i));
        }
    }
       
  public static void cargarAgenda(BufferedReader br) throws IOException {
        String linea = br.readLine();

        while (linea != null) {
            if (!linea.equals("")) {

                //Separar linea por ; con split
                String[] linea_array = linea.split("-");
                Agenda a = new Agenda(linea_array[0], linea_array[1], linea_array[2], linea_array[3]);
                lista_agenda.add(a);
            }
            linea = br.readLine();
        }
        br.close();

        imprimirAgenda();

    }
    
}
