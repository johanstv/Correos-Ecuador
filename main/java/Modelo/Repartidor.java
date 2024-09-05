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
public class Repartidor extends Trabajador{
    private int horasAlMes;
    private Vehiculo vehiculoRepartidor;

    public Repartidor(int horasAlMes, Vehiculo vehiculoRepartidor, String nombres, String apellidos, String id, String sexo, String telefono, int edad) {
        super(nombres, apellidos, id, sexo, telefono, edad);
        this.horasAlMes = horasAlMes;
        this.vehiculoRepartidor = vehiculoRepartidor;
    }

    public int getHorasAlMes() {
        return horasAlMes;
    }

    public void setHorasAlMes(int horasAlMes) {
        this.horasAlMes = horasAlMes;
    }

    public Vehiculo getVehiculoRepartidor() {
        return vehiculoRepartidor;
    }

    public void setVehiculoRepartidor(Vehiculo vehiculoRepartidor) {
        this.vehiculoRepartidor = vehiculoRepartidor;
    }

    
    @Override
    public double salario() {
        return 500 + (2 * horasAlMes); 
    }
    
}
