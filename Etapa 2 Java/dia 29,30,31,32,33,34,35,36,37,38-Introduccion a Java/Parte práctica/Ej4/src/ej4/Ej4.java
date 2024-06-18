/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package ej4;

import java.util.Scanner;


public class Ej4 {


    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la temperatura");
        int temp=leer.nextInt();
        double far=32+9*temp/5;
        System.out.println("El valor en Fahrenheit de los "+temp+"° que usted ingresó es: "+far+"F");
    }
    
}
