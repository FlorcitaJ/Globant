/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.
 */
package ej20e;

public class Ej20E {
    static int n=5;

    public static void main(String[] args) {
        
        int[]vector=new int[n];
        rellenarVector(vector);
        imprimirVector(vector);
    }
    
    public static int[] rellenarVector(int[]vector){
        for (int i = 0; i < n; i++) {
            vector[i]=(int)(Math.random()*10);
        }
        return vector;
        }
    
    public static void imprimirVector(int[]vector){
        for (int i = 0; i < n; i++) {
            if(i==0){
                System.out.print("{"+vector[i]+",");
            }else if(i==n-1){
                System.out.print(vector[i]+"}");
            }else{
                System.out.print(vector[i]+",");
            }
        }
        System.out.println("");
    }
}
