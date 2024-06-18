/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package ej10;

import java.util.Scanner;


public class Ej10 {

   
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un límite");
        int limite=leer.nextInt();
        int suma=0;
        do {            
            System.out.println("Ingrese un número");
            int num=leer.nextInt();
            suma+=num;
        } while (suma<limite);
    }
    
}
