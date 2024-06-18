/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.
 */
package ej18e;

import java.util.Scanner;

public class Ej18E {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Cuantos valores desea agregar?");
        int n=leer.nextInt();
        int [] vector=new int[n];
        int suma=0;
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el primer valor");
            int num=leer.nextInt();
            vector[i]=num;
            suma+=num;
        }
        for (int i = 0; i < n; i++) {
            if(i==0){
                System.out.print("["+vector[i]);
            }else{
               System.out.print(","+vector[i]); 
            }           
        }
        System.out.println("]");
        System.out.println("La suma total de los "+n+" valores ingresados da como resultado: "+suma);        
    }
    
}
