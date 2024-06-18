/*
Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el
operador de división. Nota: recordar que las variables de tipo entero truncan los
números o resultados.
 */
package ej11e;

import java.util.Scanner;

public class Ej11E {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        int num=leer.nextInt();
        int cont=0;
        while (num>0) {            
            cont+=1;
            num= (int)(num/10);
        }
        System.out.println("El numero tiene "+cont+" digitos");
    }
    
}
