/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 */
package ej11;

import java.util.Scanner;


public class Ej11 {


    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        int num1=leer.nextInt();
        System.out.println("Ingrese el segundo número");
        int num2=leer.nextInt();
        int op=0;
        int resultado;
        String respuesta="";
        do {            
            menu();
            op=leer.nextInt();
            switch(op){
                case 1:
                    resultado=num1+num2;
                    System.out.println("La suma es "+resultado);
                    System.out.println("");
                break;
                case 2:
                    resultado=num1-num2;
                    System.out.println("La resta es "+resultado);
                    System.out.println("");
                    break;
                case 3:
                    resultado=num1*num2;
                    System.out.println("La multiplicación es "+resultado);
                    System.out.println("");
                    break;
                case 4:
                    resultado=num1/num2;
                    System.out.println("La división es "+resultado);
                    System.out.println("");
                    break;
                case 5:
                    leer.nextLine();
                    System.out.println("¿Está seguro que desea salir del programa(S/N?)");
                    respuesta=leer.nextLine();
                    if(respuesta.equalsIgnoreCase("s")){
                        op=5;
                        break;
                    }else{
                       break;
                    }                   
                default:
                    System.out.println("Opción inválida, ingrese una opción del menu");
                    System.out.println("");
                    respuesta="";
            }
        } while (!respuesta.equalsIgnoreCase("s"));
    }
    public static void menu(){
        System.out.println("MENU");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("Elija Opción:");
    }
}
