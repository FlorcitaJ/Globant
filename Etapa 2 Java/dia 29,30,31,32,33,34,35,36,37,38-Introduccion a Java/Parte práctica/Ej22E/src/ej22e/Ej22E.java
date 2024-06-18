/*
Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
muestre la suma de sus elementos.
 */
package ej22e;

public class Ej22E {

    public static void main(String[] args) {
        int suma=0;
        int n=3;
        int m=5;
        int[][] matriz=new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j]=(int)(Math.random()*10);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(i==0 && j==0){
                    System.out.print("["+matriz[i][j]+",");
                }else if(i==n-1 && j==m-1){
                    System.out.print(matriz[i][j]+"]");
                }else{
                    System.out.print(matriz[i][j]+",");
                }
            }
            System.out.println("");
        }
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                suma+=matriz[i][j];
            }
        }
        System.out.println("La suma de los elementos de la matriz es "+ suma);
    }
    
}
