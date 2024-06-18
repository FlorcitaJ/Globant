/*
 Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package ej14;

import java.util.Scanner;


public class Ej14 {

    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Igrese la cantidad de euros a convertir");
        double euros=leer.nextFloat();
        System.out.println("A que moneda desea convertirlos?");
        System.out.println("Dólares");
        System.out.println("Yenes");
        System.out.println("Libras");
        leer.nextLine();
        String op=leer.nextLine();
        conversion(euros,op);
    }
    
    public static void conversion(double euros,String op){
        op.toLowerCase();
        double cambio;
        switch(op){
            case "dolares":
                cambio=euros*1.28611;                
                System.out.println("El cambio de "+euros+" euros a dólares es "+cambio);
                break;
            case "yenes":
                cambio=euros*129.852;                
                System.out.println("El cambio de "+euros+" euros a yenes es "+cambio);
                break;
            case "libras":
                cambio=euros*0.86;
                System.out.println("El cambio de "+euros+" euros a libras es "+cambio);
                break;              
        }
    }
    
}
