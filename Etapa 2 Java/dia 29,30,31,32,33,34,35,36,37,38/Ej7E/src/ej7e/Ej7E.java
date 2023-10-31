/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
promedio de n números (n>0). El valor de n se solicitará al principio del programa y los
números serán introducidos por el usuario. Realice dos versiones del programa, una
usando el bucle “while” y otra con el bucle “do - while”.
 */
package ej7e;

import java.util.Scanner;

public class Ej7E {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int max=0;
        int min=0;
        int prom=0;
        int cont=1;
        System.out.println("Cuántos números desea ingresar?");
        int cantidad=leer.nextInt();
        while (cont<=cantidad) {            
            System.out.println("Ingrese el número "+cont);
            int num=leer.nextInt();
            prom+=num;
            if(cont==1){
                max=num;
                min=num;
            }else{
                if(num<min){
                    min=num;
                }else if(num>max){
                    max=num;
                }
            }
            cont+=1;
        }
        do {            
            System.out.println("Ingrese el número "+cont);
            int num=leer.nextInt();
            prom+=num;
            if(cont==1){
                max=num;
                min=num;
            }else{
                if(num<min){
                    min=num;
                }else if(num>max){
                    max=num;
                }
            }
            cont+=1;
        } while (cont<=cantidad);
        System.out.println("El valor mínimo es "+ min+", el máximo "+max+" y el promedio "+(prom/cantidad));
    }
    
}
