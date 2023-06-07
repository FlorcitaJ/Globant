/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 */
package ej1;

import java.util.Scanner;


public class Ej1 {


    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        int num1=leer.nextInt();
        System.out.println("Ingrese el segundo número");
        int num2=leer.nextInt();
        System.out.println("La suma de "+num1+" y "+num2+" da como resultado "+suma(num1,num2));
    }
    
    public static int suma(int num1, int num2){
        int resultado=num1+num2;
        return resultado;
    }
}
