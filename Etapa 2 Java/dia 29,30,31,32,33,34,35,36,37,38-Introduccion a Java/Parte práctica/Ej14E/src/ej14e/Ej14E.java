/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la
cantidad de hijos para averiguar la media de edad de los hijos de todas las familias.
 */
package ej14e;

import java.util.Scanner;

public class Ej14E {

    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de familias");
        int familias=leer.nextInt();
        int cont=0;
        int sumaEdades=0;
        for (int i = 0; i < familias; i++) {
            System.out.println("Ingrese la cantidad de hijos de la familia "+(i+1));
            int hijos=leer.nextInt();
            for (int j = 0; j < hijos; j++) {
                cont+=1;
                System.out.println("Ingrese la edad del hijo n°"+(j+1));
                int edad=leer.nextInt();
                sumaEdades+=edad;
            }
        }
        int promedioEdades=(int) sumaEdades/cont;
        System.out.println("El promedio de las edades de los hijos de todas las familias es "+promedioEdades);
    }
    
}
