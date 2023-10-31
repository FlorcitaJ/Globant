/*
Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
utilizando bloques try/catch para las distintas excepciones
 */
package ej4;

import Entidad.DivisionNumero;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej4 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        DivisionNumero d=new DivisionNumero(); 
        try {
            System.out.println("Ingrese el número a dividir");
            String numero1=leer.nextLine();
            System.out.println("Ingrese el número por el cual va a dividir ");
            String numero2=leer.nextLine();
            System.out.println("Ingrese su edad");
            int edad=leer.nextInt();
            int num1=Integer.parseInt(numero1);
            int num2=Integer.parseInt(numero2);
            d.crearDivision(num1, num2);
            d.division();
            System.out.println("Usted tiene "+edad+" años");
        } catch (NumberFormatException e) {
            System.out.println("Debe ingresar un número para poder dividir"); 
        }catch(InputMismatchException e){
            System.out.println("Su edad debe ser un número");
        }
         
    }
    
}
