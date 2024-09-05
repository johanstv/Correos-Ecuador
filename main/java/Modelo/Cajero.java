/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.MisExcepciones;

/**
 *
 * @author johan
 */
public class Cajero extends Trabajador {

    private int cantPersonasAtendidas;

    public Cajero(int cantPersonasAtendidas, String nombres, String apellidos, String id, String sexo, String telefono, int edad) {
        super(nombres, apellidos, id, sexo, telefono, edad);
        this.cantPersonasAtendidas = cantPersonasAtendidas;
    }

    public int getCantPersonasAtendidas() {
        return cantPersonasAtendidas;
    }

    public void setCantPersonasAtendidas(int cantPersonasAtendidas) {
        this.cantPersonasAtendidas = cantPersonasAtendidas;
    }

    @Override
    public double salario() {
        return 375;
    }

    public String Clasificacion() {

        if (cantPersonasAtendidas >= 1 && cantPersonasAtendidas <= 10) {
            return "Bueno";
        } else if (cantPersonasAtendidas >= 11 && cantPersonasAtendidas <= 50) {
            return "Muy Bueno";
        } else {
            return "Excelente";
        }

    }

}
