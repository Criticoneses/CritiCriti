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
public class Agenda {

    String pista;
    String dNI;
    String dia;
    String hora;

    public Agenda(String pista, String dNI, String dia, String hora) {
        this.pista = pista;
        this.dNI = dNI;
        this.dia = dia;
        this.hora = hora;
    }

    public String getPista() {
        return pista;
    }

    public void setPista(String pista) {
        this.pista = pista;
    }

    public String getdNI() {
        return dNI;
    }

    public void setdNI(String dNI) {
        this.dNI = dNI;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
//hola hola
    @Override
    public String toString() {
        return "Agenda{" + "pista=" + pista + ", dNI=" + dNI + ", dia=" + dia + ", hora=" + hora + '}';
    }

}
