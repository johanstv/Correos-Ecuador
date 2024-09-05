/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


import java.util.LinkedList;

/**
 *
 * @author johan
 */
public class Mecanico extends Trabajador {
    private LinkedList<Vehiculo> vehiculosPorReparar;

    public Mecanico(LinkedList<Vehiculo> vehiculosPorReparar, String nombres, String apellidos, String id, String sexo, String telefono, int edad) {
        super(nombres, apellidos, id, sexo, telefono, edad);
        this.vehiculosPorReparar = vehiculosPorReparar;
    }

    public LinkedList<Vehiculo> getVehiculosPorReparar() {
        return vehiculosPorReparar;
    }

    public void setVehiculosPorReparar(LinkedList<Vehiculo> vehiculosPorReparar) {
        this.vehiculosPorReparar = vehiculosPorReparar;
    }

   
   

    @Override
    public double salario() {
        return 400 + (20 * vehiculosPorReparar.size()); 
    }
    
}
