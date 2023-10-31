/*
Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas.
Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor,
este resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas. 
 */
package ej9e;

import java.util.Scanner;

public class Ej9E {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el número a dividir");
        int num1=leer.nextInt();
        System.out.println("Ingrese el número por el que desea dividir");
        int num2=leer.nextInt();
        leer.nextLine();
        int cociente=0;
        int resto=num1;
        while (resto>=num2) {            
            cociente+=1;
            resto=resto-num2;
        }
        System.out.println("El cociente de la division entre "+num1+" y "+num2+" es "+cociente+" y el resto es "+resto);
    }
    
}
