/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exameii;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.*;

/**
 *
 * @author marcela
 */
public class Barra extends Thread {

    private JProgressBar barra;
    private double largo;
    private boolean avanzar;
    private boolean vive;
    private JDialog jd;

    public Barra(JProgressBar barra, double largo,JDialog jd) {
        this.barra = barra;
        this.largo = largo;
        avanzar = true;
        vive = true;
        this.jd = jd;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public JDialog getJd() {
        return jd;
    }

    public void setJd(JDialog jd) {
        this.jd = jd;
    }
    
    

    @Override
    public void run() {
        long largo1 = Double.valueOf(largo).longValue();

        long tiempo = largo1 * 7;
        int max = (int) tiempo;
        barra.setMaximum(max);
        while (vive) {
            if (avanzar) {
                barra.setValue(barra.getValue() + 1);
                if (barra.getValue() == tiempo) {
                    vive = false;
                }
            } //FIN IF

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }

        barra.setValue(0);
        jd.setVisible(true);
    }
}
