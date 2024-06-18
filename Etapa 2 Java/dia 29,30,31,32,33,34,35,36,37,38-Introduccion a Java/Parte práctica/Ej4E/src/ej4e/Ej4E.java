/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
 */
package ej4e;

import java.util.Scanner;


public class Ej4E {

    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un número entre 1 y 10");
        int num=leer.nextInt();
        conversion(num,leer);
    } 
    public static void conversion(int num,Scanner leer){
        String[] vector={"I","II","III","IV","V","VI","VII","VII","IX","X"};
        while (num<1 || num>10) {
            System.out.println("El número ingresado no se encuentra dentro del rango, ingrese otro");
            num=leer.nextInt();
        }
        System.out.println(vector[num-1]);
    }
}
