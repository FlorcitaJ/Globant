/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;

/**
 *
 * @author flopy
 */
public class PersonaService {
        /**
     *
     * @param persona
     */
    public static void mostrarPersona(Persona persona){
        System.out.println(persona.getNombre());
        System.out.println(persona.getDni());
        System.out.println(persona.getEdad());
    }
}
