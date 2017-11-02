/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author H
 */
public class Jugador {
    
    String nombre;
    String apellido;
    int dorsal;

    public Jugador(String nombre, String apellido, int dorsal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dorsal = dorsal;
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDorsal() {
        return dorsal;
    }

    @Override
    public String toString() {
        return "Jugador: " + "Nombre=" + nombre + ", Apellido=" + apellido + ", Dorsal=" + dorsal;
    }
       
}
