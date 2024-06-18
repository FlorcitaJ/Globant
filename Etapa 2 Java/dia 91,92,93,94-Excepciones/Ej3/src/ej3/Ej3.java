/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
 */
package ej3;

import Entidad.DivisionNumero;
import java.util.Scanner;

public class Ej3 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        DivisionNumero d=new DivisionNumero(); 
        try {
            System.out.println("Ingrese el número a dividir");
            String numero1=leer.nextLine();
            System.out.println("Ingrese el número por el cual va a dividir ");
            String numero2=leer.nextLine();
            int num1=Integer.parseInt(numero1);
            int num2=Integer.parseInt(numero2);
            d.crearDivision(num1, num2);
            d.division();
        } catch (NumberFormatException e) {
            System.out.println("Debe ingresar un número"); 
        }
         
    }
    
}
