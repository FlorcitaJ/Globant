/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
package ej15;


public class Ej15 {

    
    public static void main(String[] args) {
        int[] vector=new int[100];
        rellenoVector(vector);
        mostrarVector(vector);
    }
    public static void rellenoVector(int[] vector){
        for (int i = 0; i<100; i++) {
            vector[i]=i;            
        }
    }
    public static void mostrarVector(int[] vector){
        for (int i = 99; i >= 0; i--) {
            System.out.print("[");
            System.out.print(vector[i]+",");
            System.out.print("]");
        }
        System.out.println("");
    }
}
