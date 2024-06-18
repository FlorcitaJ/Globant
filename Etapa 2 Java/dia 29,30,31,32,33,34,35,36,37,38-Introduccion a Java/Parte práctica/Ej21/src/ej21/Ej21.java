/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.
 */
package ej21;

import java.util.Scanner;


public class Ej21 {

    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int n=10;
        int [][] matrizM=new int[n][n];
        rellenarMatrizM(matrizM, n, leer);
        mostrarMatriz(matrizM, n);
        n=3;
        int [][] matrizP=new int[n][n];
        rellenarMatriz(matrizP,n,leer);
        mostrarMatriz(matrizP,n);
        estaContenida(matrizP, matrizM, n);
    }
    public static void rellenarMatriz(int[][] matriz, int n,Scanner leer){
       for (int i = 0; i < n; i++) {
           for (int j = 0; j < n; j++) {
               System.out.println("Ingrese el valor para la posición ["+i+","+j+"]");
               matriz[i][j]=leer.nextInt();
           }
       }
   }
    public static void rellenarMatrizM(int[][] matriz, int n,Scanner leer){
       for (int i = 0; i < n; i++) {
           for (int j = 0; j < n; j++) {
               matriz[i][j]=(int)(Math.random()*10);
           }
       }
   }
    public static void mostrarMatriz(int[][] matriz,int n) {
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
    public static void estaContenida(int[][] matrizP,int[][]matrizM, int n) {
        boolean rta=false;
        int k=0;
        int l=0;
        int fila=0;
        int col=0;
        for (int i = 0; i < 10; i++) {
            if(i>7){
                System.out.println("La matríz P no está contenida en la matriz M");
                i=9;
            }
            for (int j = 0; j < 10; j++) {
                if (matrizM[i][j] == matrizP[0][0]) {
                    rta=true;
                    if (i < 8 && j < 8) {
                        fila = i;
                        col = j;
                        for (int m = fila; m < fila + 3; m++) {
                            for (int o = col; o < col + 3; o++) {
                                if (matrizM[m][o] == matrizP[k][l] && rta == true) {
                                    l++;
                                } else {
                                    rta=false;
                                    o = col + 3;
                                    m = fila + 3;
                                }
                            }
                            k++;
                            l=0;
                        }
                        if (rta==true) {
                            j = 10;
                            i = 10;
                            System.out.println("La matriz P esta contenida en la matriz M y comienza en la posicion ["+fila+","+col+"]");
                        }else{
                            k=0;
                        }
                    }
                } 
            }
        }
    }
}
