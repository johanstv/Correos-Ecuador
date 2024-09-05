/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*;
import java.io.*;
import java.util.*;
import javax.imageio.IIOException;

/**
 *
 * @author johan
 */
public class FileHandler {

    public void guardarTrabajador(Trabajador t) throws IOException, Exception {
        File f = new File("Trabajadores.txt");
        //Escritura
        if ("Repartidor".equals(t.getClass().getSimpleName())) {
            BufferedWriter br = new BufferedWriter(new FileWriter(f, true));
            Repartidor r = (Repartidor) t;
            br.append(r.getId() + ";" + r.getNombres() + ";" + r.getApellidos() + ";" + r.getEdad() + ";" + r.getTelefono() + ";" + r.getSexo() + ";" + r.salario() + ";" + "No aplica" + ";" + r.getHorasAlMes() + ";" + r.getVehiculoRepartidor() + ";" + r.getClass().getSimpleName());
            br.newLine();
            br.close();
        } else if ("Cajero".equals(t.getClass().getSimpleName())) {
            BufferedWriter br1 = new BufferedWriter(new FileWriter(f, true));
            Cajero c = (Cajero) t;
            br1.append(c.getId() + ";" + c.getNombres() + ";" + c.getApellidos() + ";" + c.getEdad() + ";" + c.getTelefono() + ";" + c.getSexo() + ";" + c.salario() + ";" + c.Clasificacion() + ";" + c.getClass().getSimpleName());
            br1.newLine();
            br1.close();
        } else if ("Mecanico".equals(t.getClass().getSimpleName())) {
            BufferedWriter br2 = new BufferedWriter(new FileWriter(f, true));
            Mecanico m = (Mecanico) t;
            br2.append(m.getId() + ";" + m.getNombres() + ";" + m.getApellidos() + ";" + m.getEdad() + ";" + m.getTelefono() + ";" + m.getSexo() + ";" + m.salario() + ";" + "No aplica" + ";" + m.getVehiculosPorReparar() + ";" + m.getClass().getSimpleName());
            br2.newLine();
            br2.close();
        } else {

            throw new IOException("Tipo de trabajador incorrecto");
        }

    }

    public LinkedList<String> LecturaTrabajadores() throws IOException {
        File f = new File("Trabajadores.txt");
        LinkedList<String> paraMostrar = new LinkedList<>();

        String Linea = null;

        if (f.exists()) {
            BufferedReader br = new BufferedReader(new FileReader("Trabajadores.txt"));
            while ((Linea = br.readLine()) != null) {
                String corte[] = Linea.split(";");
                String c = corte[corte.length - 1] + ";" + corte[6] + ";" + corte[7];
                paraMostrar.add(c);
            }
        }

        return paraMostrar;

    }

}
