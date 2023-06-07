/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package ej19;

import java.util.Scanner;


public class Ej19 {

   
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int n=3;
        int [][] matriz=new int[n][n];
        int [][] matrizAT=new int[n][n];
        rellenarMatriz(matriz, n,leer);
        mostrarMatriz(matriz, n);
        rellenarTranspuesta(matriz, n,matrizAT);
        mostrarMatriz(matrizAT, n);
        esAntiSimetrica(matriz, n, matrizAT);
    }
    public static void rellenarMatriz(int[][] matriz,int n,Scanner leer){
       for (int i = 0; i < n; i++) {
           for (int j = 0; j < n; j++) {
               System.out.println("Ingrese un valor para la posicion ["+i+","+j+"]");
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
    
    public static void rellenarTranspuesta(int[][] matriz, int n,int[][]matrizAT) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizAT[i][j]=matriz[j][i];
            }
        }
    }
    
    public static void esAntiSimetrica(int[][]matriz,int n,int[][] matrizAT){
        boolean retorno=true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                retorno = matriz[i][j]==-matrizAT[i][j]&&retorno==true;
            }
        }
        if(retorno){
            System.out.println("La matríz es anti simétrica");
        }else{
            System.out.println("La matríz no es anti simétrica");
        }
    } 
}
