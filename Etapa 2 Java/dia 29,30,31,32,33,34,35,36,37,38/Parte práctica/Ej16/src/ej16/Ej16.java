/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package ej16;

import java.util.Scanner;


public class Ej16 {

    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n=leer.nextInt();
        int[]vector=new int[n];
        System.out.println("Ingrese el valor que desea buscar");
        int val=leer.nextInt();
        rellenoVector(vector,n);
        mostrarVector(vector, n);
        busquedaValor(vector, n, val);
    }
    public static void rellenoVector(int[] vector,int n){
        for (int i = 0; i < n; i++) {
            vector[i]=(int) (Math.random()*10);
        }
    }
    public static void mostrarVector(int[] vector,int n){
        for (int i = 0; i < n; i++) {
            System.out.print("[");
            System.out.print(vector[i]);
            System.out.print("]");
        }
        System.out.println("");
    }
    public static void busquedaValor(int[]vector,int n,int val){
        int contador=0;
        int posi=0;
        for (int i = 0; i < n; i++) {
            if (vector[i]==val) {
                contador++;
                if(contador==1){
                    posi=i;
                }
            }
        }
        if(contador==0){
            System.out.println("El valor "+val+" no se encuentra dentro del vector");
        }else{
            System.out.println("El valor "+val+" se encuentra por primera vez en la posicion "+posi+" y se repite "+contador+" veces"); 
        }
    }
}
