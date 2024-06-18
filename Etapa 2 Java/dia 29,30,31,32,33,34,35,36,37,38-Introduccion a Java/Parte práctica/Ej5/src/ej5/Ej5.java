/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
package ej5;

import java.util.Scanner;


public class Ej5 {


    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num=leer.nextInt();
        int doble=num*2;
        int triple=num*3;
        double raiz=Math.sqrt(num);
        System.out.println("El doble de "+num+" es: "+doble);
        System.out.println("El triple de "+num+" es: "+triple);
        System.out.println("La raíz cuadrada de "+num+" es: "+raiz);
    }
    
}
