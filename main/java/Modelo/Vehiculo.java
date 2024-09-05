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
public class Vehiculo {
    private String placa, color;
    private Ruta rutavehiculo;

    public Vehiculo(String placa, String color, Ruta rutavehiculo) {
        this.placa = placa;
        this.color = color;
        this.rutavehiculo = rutavehiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Ruta getRutavehiculo() {
        return rutavehiculo;
    }

    public void setRutavehiculo(Ruta rutavehiculo) {
        this.rutavehiculo = rutavehiculo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "placa=" + placa + ", color=" + color + ", rutavehiculo=" + rutavehiculo + '}';
    }
    
    
}
