/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.
 */
package ej15e;

import java.util.Scanner;

public class Ej15E {

    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        double num1=leer.nextDouble();
        System.out.println("Ingrese el segundo número");
        double num2=leer.nextDouble();
        int op=0;
        do {            
            System.out.println("Ingrese la opción que desea hacer");
            System.out.println("1-Sumar");
            System.out.println("2-Restar");
            System.out.println("3-Multiplicar");
            System.out.println("4-Dividir");
            System.out.println("5-Salir");
            op=leer.nextInt();
            switch(op){
                case 1:
                    double suma=num1+num2;
                    System.out.println("La suma de "+num1+" y "+num2+" da como resultado "+suma);
                    System.out.println("----------------------------------------------------------");
                    break;
                case 2:
                    double resta=num1-num2;
                    System.out.println("La resta de "+num1+" y "+num2+" da como resultado "+resta);
                    System.out.println("----------------------------------------------------------");
                    break;
                case 3:
                    double multiplicacion=num1*num2;
                    System.out.println("La multiplicación de "+num1+" y "+num2+" da como resultado "+multiplicacion);
                    System.out.println("----------------------------------------------------------");
                    break;
                case 4:
                    if(num2==0){
                        System.out.println("No es posible dividir por 0");
                        System.out.println("----------------------------------------------------------");
                    }else {
                        double division=num1/num2;
                    System.out.println("La división de "+num1+" y "+num2+" da como resultado "+division);
                    System.out.println("----------------------------------------------------------");
                    break;
                    }
            }
        } while (op!=5);
    }
    
}
