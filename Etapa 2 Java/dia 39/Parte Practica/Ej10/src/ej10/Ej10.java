/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
package ej10;

import java.util.Arrays;

public class Ej10 {

    public static void main(String[] args) {
       double []A=new double[50];
       double []B=new double[20];
        rellenarArregloA(A);
        ordenarArregloA(A);
        rellenarArregloB(B, A);
        mostrarArreglo(A);
        mostrarArreglo(B);     
    }
    
   public static void rellenarArregloA(double[]A){
       for (int i = 0; i < 50; i++) {
           A[i]=(int)(Math.random()*10);
       }
   }
   
   public static void ordenarArregloA(double[]A){
       System.out.println(Arrays.toString(A));
       Arrays.sort(A);
       System.out.println(Arrays.toString(A));
   }
   
   public static void rellenarArregloB(double[]B,double[]A){
        System.arraycopy(A, 0, B, 0, 10);
        Arrays.fill(B,10,20,0.5);
   }
   
   public static void mostrarArreglo(double []arreglo){
       System.out.println(Arrays.toString(arreglo));
   }
}
