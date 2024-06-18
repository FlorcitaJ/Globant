/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package ej3;

import java.util.Scanner;


public class Ej3 {


    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase=leer.nextLine();
        System.out.println("Su frase en mínusculas es: "+minusculas(frase));
        System.out.println("Su frase en mayúsculas es: "+mayusculas(frase));
    }
    
    public static String mayusculas(String frase){
        String enMayu=frase.toUpperCase();
        return enMayu;
    }
    
    public static String minusculas(String frase){
        String enMinu=frase.toLowerCase();
        return enMinu;
    }
}
