/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
 */
package ej19e;

public class Ej19E {

    public static void main(String[] args) {
        int n=5;
        int []A={1,2,6,4,5};
        int []B={1,2,3,4,5};
        boolean band=true;
        for (int i = 0; i < n; i++) {
            System.out.println(A[i]+"-"+B[i]);
            if(A[i]!=B[i]){
                band=false;
                break;
            }
        }
        if(band){
            System.out.println("Los vectores son iguales");
        }else{
            System.out.println("Los vectores son distintos");
        }
    }
    
}
