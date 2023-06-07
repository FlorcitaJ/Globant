/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
 */
package ej18;

public class Ej18 {

    
    public static void main(String[] args) {
        int n=4;
        int [][] matriz=new int[n][n];
        rellenarMatriz(matriz, n);
        mostrarMatriz(matriz, n);
        mostrarTranspuesta(matriz, n);
    }
    public static void rellenarMatriz(int[][] matriz,int n){
       for (int i = 0; i < n; i++) {
           for (int j = 0; j < n; j++) {
               matriz[i][j]=(int)(Math.random()*10);
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
    public static void mostrarTranspuesta(int[][] matriz, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("[");
            for (int j = 0; j < n; j++) {
                if(j==n-1){
                    System.out.print(matriz[j][i]);
                }else{
                    System.out.print(matriz[j][i] + ",");
                }
            }
            System.out.print("]");
            System.out.println("");
        }
        System.out.println("");
    }
}
