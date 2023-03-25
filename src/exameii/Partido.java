/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exameii;

/**
 *
 * @author marcela
 */
public class Partido {
    private Equipo equipo1;
    private Equipo equipo2;
    private int valorEquipo1;
    private int valorEquipo2;

    public Partido() {
    }

    public Partido(Equipo equipo1, Equipo equipo2, int valorEquipo1, int valorEquipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.valorEquipo1 = valorEquipo1;
        this.valorEquipo2 = valorEquipo2;
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

    

    public int getValorEquipo1() {
        return valorEquipo1;
    }

    public void setValorEquipo1(int valorEquipo1) {
        this.valorEquipo1 = valorEquipo1;
    }

    public int getValorEquipo2() {
        return valorEquipo2;
    }

    public void setValorEquipo2(int valorEquipo2) {
        this.valorEquipo2 = valorEquipo2;
    }

    @Override
    public String toString() {
        return equipo1 + " VS " + equipo2 ;
    }
    
    
}
