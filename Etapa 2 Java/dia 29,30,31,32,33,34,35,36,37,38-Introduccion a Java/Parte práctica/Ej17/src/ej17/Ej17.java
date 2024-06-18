/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package ej17;

import java.util.Random;
import java.util.Scanner;


public class Ej17 {

    
    public static void main(String[] args) {
      Scanner leer=new Scanner(System.in);
      Random rand=new Random();
      System.out.println("Ingrese el tamaño del vector");  
      int n=leer.nextInt();
      int[] vector=new int[n];  
      rellenarVector(vector, n, rand);
      mostrarVector(vector, n);
      contabilizando(vector, n);
    }
    
   public static void rellenarVector(int[] vector, int n,Random rand){
       for (int i = 0; i < n; i++) {
           vector[i]=rand.nextInt(10500);
       }
   }
   public static void mostrarVector(int[] vector, int n){
       for (int i = 0; i < n; i++) {
           System.out.print("[");
           System.out.print(vector[i]);
           System.out.print("]");
       }
       System.out.println("");
   }
    public static void contabilizando(int[] vector, int n){
        
        int unDigito=0;
        int dosDigitos=0;
        int tresDigitos=0;
        int cuatroDigitos=0;
        int cincoDigitos=0;
         for (int i = 0; i < n; i++) {
             int contador=0;
             int num=vector[i];
             do {                 
                 num=(int)Math.floor(num/10);
                 contador++;
             } while (num!=0);
            switch(contador){
                case 1:
                    unDigito++;
                    break;
                case 2:
                    dosDigitos++;
                    break;
                case 3:
                    tresDigitos++;
                    break;
                case 4:
                    cuatroDigitos++;
                    break;
                case 5:
                    cincoDigitos++;
                    break;
            }
        }
        System.out.println("En el vector hay "+unDigito+" valores de un dígito, "+dosDigitos+" valores de dos dígitos, ");
        System.out.print(tresDigitos+" valores de tres dígitos, "+cuatroDigitos+" valores de cuatro dígitos y ");
        System.out.print(cincoDigitos+" valores de 5 dígitos");
        System.out.println("");
    }
}
