/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package ej20;

import java.util.Scanner;


public class Ej20 {

   
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int n=3;
        int [][] matriz=new int[n][n];
        rellenarMatriz(matriz, n,leer);
        mostrarMatriz(matriz, n);
        esMagica(matriz, n);
    }
    public static void rellenarMatriz(int[][] matriz,int n,Scanner leer){
       for (int i = 0; i < n; i++) {
           for (int j = 0; j < n; j++) {
               System.out.println("Ingrese el valor para la posición ["+i+","+j+"]");
               int num=leer.nextInt();
               matriz[i][j]=num;
           }
       }
   }
    public static void mostrarMatriz(int[][] matriz, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("[");
            for (int j = 0; j < n; j++) {
                if(j==n-1){
                    System.out.print(matriz[i][j]);
                }else{
                    System.out.print(matriz[i][j] + ",");
                }
            }
            System.out.print("]");
            System.out.println("");
        }
        System.out.println("");
    }
    public static void esMagica(int[][] matriz, int n) {
        int sumFila=0;
        int sumFila2=0;
        int sumDiagonal=0;
        int sumDiagonalInv=0;
        int sumCol=0;
        boolean rta=true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sumFila+=matriz[i][j];
                if(i==j){
                    sumDiagonal+=matriz[i][j];
                }
                if(i+j==n-1){
                    sumDiagonalInv+=matriz[i][j];
                }
                sumCol+=matriz[j][i];
            }
            if(i==0){
                sumFila2=sumFila;
            }
            rta = sumFila==sumFila2&&rta==true;
            rta=sumCol==sumFila2&&rta==true;
            sumCol=0;
            sumFila=0;
        }
        rta=sumDiagonal==sumDiagonalInv&&rta==true;
        if(rta){
            System.out.println("La matríz es mágica");
        }else{
            System.out.println("La matríz no es mágica");
        }
    }
    
}
