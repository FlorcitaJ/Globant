/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
 */
package ej5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej5 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int numero=(int)(Math.random()*500);
        System.out.println(numero);
        int cont=0;
        boolean band=true;
        System.out.println("Ingrese un número entre 1 y 500");
        do {            
             cont += 1;
            try {
                int num = leer.nextInt();
                if (num == numero) {
                    System.out.println("Adivinaste!!");
                    System.out.println("Después de " + cont + " intentos");
                    band = false;
                } else if(num<numero){
                    System.out.println("Tu número es mas chico");
                    System.out.println("---------------------------");
                }else{
                    System.out.println("Tu número es mas grande");
                    System.out.println("---------------------------");
                }
            } catch (InputMismatchException e) {
                System.out.println("No ingresaste un número pero seguí intentando");
                leer.nextLine();
            }
        } while (band);
    }
    
}
