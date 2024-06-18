/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package ej16e;

import java.util.Scanner;

public class Ej16E {

    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        String rta;
        do {            
            System.out.println("Ingrese el Nombre");
            String nombre=leer.nextLine();
            System.out.println("Ingrese la edad");
            int edad=leer.nextInt();
            if(edad<18){
                System.out.println("Nombre:"+nombre+", Edad:"+edad+" es menor de edad");
            } else{
                System.out.println("Nombre:"+nombre+", Edad:"+edad+" es mayor de edad");
            }
            leer.nextLine();
            System.out.println("-----------------------------------------------");
            System.out.println("Desea seguir mostrando personas?(si/no)");
            rta=leer.nextLine();
            while (!rta.equalsIgnoreCase("si")&&!rta.equalsIgnoreCase("no")) {
                System.out.println("Debe ingresar una respuesta válida(si/no)");        
                rta=leer.nextLine();
            }
        } while (rta.equalsIgnoreCase("si"));
        System.out.println("Muchas gracias!!");
    }
    
}
