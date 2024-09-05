/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author johan
 */
public class Ruta {
    private String idruta;
    private double distanciaKm;

    public Ruta(String idruta, double distanciaKm) {
        this.idruta = idruta;
        this.distanciaKm = distanciaKm;
    }

    public String getIdruta() {
        return idruta;
    }

    public void setIdruta(String idruta) {
        this.idruta = idruta;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    @Override
    public String toString() {
        return "Ruta{" + "idruta=" + idruta + ", distanciaKm=" + distanciaKm + '}';
    }
    
    
}
