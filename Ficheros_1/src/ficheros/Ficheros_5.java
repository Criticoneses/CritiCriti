/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros;

import Clases.Moto;
import static ficheros.Ficheros_3.lista;
import static ficheros.Ficheros_4.escribirEnFichero;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author H
 */
public class Ficheros_5 {

    public static ArrayList<Moto> lista_motos = new ArrayList<Moto>();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException, IOException {
       
        BufferedReader br = new BufferedReader(new FileReader("ficheros/fichero_5.txt"));

        cargarMotos(br);
        System.out.println("-------------");
         modificarCC();

    }

    private static void imprimirMotos() {
        for (int i = 0; i < lista_motos.size(); i++) {
            System.out.println(lista_motos.get(i));
        }
    }

    private static void guardarFichero() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("ficheros/fichero_5.txt"));
        for (int i = 0; i < lista_motos.size(); i++) {
            Moto m = lista_motos.get(i);
            String linea = m.getMarca() + " " + m.getModelo() + " " + m.getCc();
            bw.write(linea);
            bw.newLine();
            bw.flush();

        }

        imprimirMotos();
    }

    public static void modificarCC() throws IOException {
       
        System.out.println("Introduce el modelo: ");
        String modelo = sc.next();

        for (int i = 0; i < lista_motos.size(); i++) {
            Moto m = lista_motos.get(i);
            if (modelo.equals(m.getModelo())) {
                System.out.println("Introduce nueva cilindrada para el modelo " + modelo + ":");
                int cc_nueva = sc.nextInt();

                lista_motos.get(i).setCc(cc_nueva);

            }
        }

        guardarFichero();
    }

    public static void cargarMotos(BufferedReader br) throws IOException {
        String linea = br.readLine();

        while (linea != null) {
            if (!linea.equals("")) {

                //Separar linea por ; con split
                String[] linea_array = linea.split(" ");
                Moto a = new Moto(linea_array[0], linea_array[1], Integer.parseInt(linea_array[2]));
                lista_motos.add(a);
            }
            linea = br.readLine();
        }
        br.close();

        imprimirMotos();

    }
}
