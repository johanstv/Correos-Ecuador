/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.*;

/**
 *
 * @author johan
 */
public class CorreoEcuador {

    private LinkedList<Trabajador> trabajadores;
    private LinkedList<Vehiculo> vehiculos;
    private LinkedList<Ruta> rutas;

    public CorreoEcuador(LinkedList<Trabajador> trabajadores, LinkedList<Vehiculo> vehiculos, LinkedList<Ruta> rutas) {
        this.trabajadores = trabajadores;
        this.vehiculos = vehiculos;
        this.rutas = rutas;
    }

    public LinkedList<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(LinkedList<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
    }

    public LinkedList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(LinkedList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public LinkedList<Ruta> getRutas() {
        return rutas;
    }

    public void setRutas(LinkedList<Ruta> rutas) {
        this.rutas = rutas;
    }

    public LinkedList<String> clasificarCajeros() {
        LinkedList<String> cajerosclasificados = new LinkedList<>();
        for (int i = 0; i < trabajadores.size(); i++) {
            Trabajador trabajador = trabajadores.get(i);
            if (trabajador.getClass().getSimpleName().equals("Cajero")) {
                Cajero cajero = (Cajero) trabajador;
                String info = cajero.getNombres() + ";" + cajero.Clasificacion();
                cajerosclasificados.add(info);
            }
        }
        return cajerosclasificados;
    }

    public double salarioTotalTrabajadores() {
        double total = 0;
        for (int i = 0; i < trabajadores.size(); i++) {
            total += trabajadores.get(i).salario();
        }

        return total;
    }

}
