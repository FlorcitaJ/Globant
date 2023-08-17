/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package ej1;

import Entidad.Perro;
import Entidad.Persona;

public class Ej1 {

    public static void main(String[] args) {
        Perro p1=new Perro("Pupe", "Desconocida", 1, "Pequeño");
        Perro p2=new Perro("Mindy", "Obejero Aleman", 15, "Grande");
        
        Persona pp1=new Persona("Florencia", "Juarez", 34, 34317415, p1);
        Persona pp2=new Persona("Patricia", "Alonso", 62, 14475648, p2);
        
        pp1.mostrarDatos();
        pp2.mostrarDatos();
    }
    
}
