/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exameii;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author marcela
 */
public class Deporte implements Serializable{

    private ArrayList<Torneo> torneos = new ArrayList();
    
    private String nombre;

    public Deporte() {
    }

    public Deporte(String nombre) {

        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Torneo> getTorneos() {
        return torneos;
    }

    public void setTorneos(ArrayList<Torneo> torneos) {
        this.torneos = torneos;
    }

    

    @Override
    public String toString() {
        return  nombre;
    }

    

}
