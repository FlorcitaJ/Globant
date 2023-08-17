/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList. */
package ej1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {
        ArrayList<String> razas=new ArrayList();
        Scanner leer=new Scanner(System.in);
        String respuesta;
        do {            
            System.out.println("Ingrese la raza del perro");
            String raza=leer.nextLine();
            razas.add(raza);
            System.out.println("Desea ingresar otra raza?(si/no)");
            respuesta=leer.nextLine();
            while (!respuesta.equalsIgnoreCase("si")&& !respuesta.equalsIgnoreCase("no")){
                System.out.println("La respuesta ingresada no es válida, ingrese una opción válida(si/no)");
                respuesta=leer.nextLine();
            } 
        } while (respuesta.equalsIgnoreCase("si"));
        System.out.println("--------------------------------------------------");
        if(respuesta.equalsIgnoreCase("no")){
            razas.forEach((raza) -> {
                System.out.println(raza);
            });
        }
    }
    
}
