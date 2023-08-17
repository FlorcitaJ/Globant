/*
Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 */
package ej1;

import Entidad.Dni;
import Entidad.Persona;

public class Ej1 {

    public static void main(String[] args) {
        Dni dni=new Dni();
        dni.setSerie('A');
        dni.setNumero(34317415);
        
        Persona p=new Persona();
        p.setNombre("Florencia");
        p.setApellido("Juárez");
        p.setDni(dni);
        
        System.out.println(p.getDni().getNumero());
        
    }
    
}
