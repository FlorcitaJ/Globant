/*
Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y
los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).
 */
package eje1;

import java.util.ArrayList;
import java.util.Scanner;

public class EjE1 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        ArrayList<Integer> numeros=new ArrayList();
        int valor;
        int cont=0;
        int suma=0;
        do {            
            System.out.println("Ingrese un valor, si no desea agregar valores ingrese -99");
            valor=leer.nextInt();
            if(valor!=-99){
                numeros.add(valor);
                cont++;
            }
        } while (valor!=-99);
        
        for (int i = 0; i < numeros.size(); i++) {
            suma+=numeros.get(i);
        }
        double promedio=(double)suma/cont;
        
        System.out.println("Se han ingresado "+cont+" valores, la suma total de los valores es igual a "+suma+" y su promedio es igual a "+promedio);
        
        
    }
    
}
