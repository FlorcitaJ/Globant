/*
Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
 */
package ej5e;

import java.util.Scanner;


public class Ej5E {

   
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        double precioFinal=0;
        boolean band=true;
        System.out.println("Ingrese el monto del tratamiento para calcular su costo final");
        double precio=leer.nextDouble();
        System.out.println("Ingrese su tipo de socio (A,B o C)");
        char letraSocio=leer.next().charAt(0);
        letraSocio=Character.toUpperCase(letraSocio);
        do {
            switch (letraSocio) {
                case 'A':
                    precioFinal = precio - precio * 0.5;
                    band=false;
                    break;
                case 'B':
                    precioFinal = precio - precio * 0.35;
                    band=false;
                    break;
                case 'C':
                    precioFinal = precio;
                    band=false;
                    break;
                default:
                    System.out.println("Ese tipo de socio no se encuentra en el sistema, por favor ingrese otro válido");
                    letraSocio = Character.toUpperCase(leer.next().charAt(0));
            }
        } while (band);
        System.out.println("El monto a abonar por el tratamiento será de $"+precioFinal+" ya que usted es un socio de la categoría "+letraSocio);
        
    }
    
}
