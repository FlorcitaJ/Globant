/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package ej1e;

import java.util.Scanner;


public class Ej1E {

    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de minutos");
        int minutos=leer.nextInt();
        diasYHoras(minutos);
    }
    public static void diasYHoras(int minutos){
       int resultado;
       double horas=minutos/60;
       int dias=(int)(Math.floor(horas/24));
       horas=horas%24;
        System.out.println(dias+" día/s, "+horas+" hora/s");
    } 
    
}
