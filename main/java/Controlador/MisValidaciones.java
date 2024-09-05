/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author johan
 */
public class MisValidaciones {

    public void validarId(String id) throws Exception {
        for (int i = 0; i < id.length(); i++) {
            if (id.charAt(i) == '$' | id.charAt(i) == '%' | id.charAt(i) == '&' | id.charAt(i) == '#' | id.charAt(i) == '/' | id.charAt(i) == '*' | id.charAt(i) == '+' | id.charAt(i) == '-'
                    | id.charAt(i) == '.' | id.charAt(i) == ',' | id.charAt(i) == '-' | id.charAt(i) == ';') {
                throw new MisExcepciones("El id no puede tener caracteres especiales");

            }
        }

        if (id.contains(" ")) {
            throw new MisExcepciones("El id no puede tener espacios");
        }
        
        if (id.isEmpty()) {
             throw new MisExcepciones("El id no puede estar vacío");
        }

    }

    public void validarCajero(int a) throws Exception {

        if (a == 0) {
            throw new MisExcepciones("Cajero sin personas atendidas");
        }
        if (a < 0) {
            throw new MisExcepciones("El numero de personas atendidas no puede ser un valor negativo");
        }

    }
}
