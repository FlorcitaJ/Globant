/*
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran
por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package ej6e;

import java.util.Scanner;

public class Ej6E {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas que desea evaluar");
        int personas=leer.nextInt();
        float sumaAlturas=0;
        float sumaAlturasMenores=0;
        int contador=0;
        for (int i = 0; i < personas; i++) {
            System.out.println("Ingrese la altura de la persona "+(i+1)+" en metros");
            float altura=leer.nextFloat();
            sumaAlturas+=altura;
            if(altura<1.6){
                sumaAlturasMenores+=altura;
                contador+=1;
            }
        }
        System.out.println("El promedio de las alturas de "+personas+" personas es: "+(sumaAlturas/personas));
        System.out.println("El promedio de las alturas de "+contador+" personas que miden menos de 1.6 es "+(sumaAlturasMenores/contador));
    }
    
}
