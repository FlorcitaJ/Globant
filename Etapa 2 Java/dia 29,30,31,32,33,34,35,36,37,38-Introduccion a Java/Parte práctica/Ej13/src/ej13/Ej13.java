/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
 */
package ej13;

import java.util.Scanner;


public class Ej13 {


    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese un número");
        int num=leer.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(i==1||j==1||i==num||j==num){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
    
}
