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
public class Alumno {
    String nombre;
    int edad;
    double notaMatematicas;
    double notaLengua;
    double notaIngles;

    public Alumno(String nombre, int edad, double notaMatematicas, double notaLengua, double notaIngles) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaMatematicas = notaMatematicas;
        this.notaLengua = notaLengua;
        this.notaIngles = notaIngles;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getNotaMatematicas() {
        return notaMatematicas;
    }

    public double getNotaLengua() {
        return notaLengua;
    }

    public double getNotaIngles() {
        return notaIngles;
    }

    @Override
    public String toString() {
        return "Alumno{" + "Nombre= " + nombre + ", edad =" + edad + ", notaMatematicas= " + notaMatematicas + ", notaLengua= " + notaLengua + ", notaIngles= " + notaIngles + '}';
    }
    
    
    
}
