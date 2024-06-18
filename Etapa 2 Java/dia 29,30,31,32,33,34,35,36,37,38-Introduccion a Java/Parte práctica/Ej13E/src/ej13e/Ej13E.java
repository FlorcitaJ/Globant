/*
Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
 */
package ej13e;

import java.util.Scanner;

public class Ej13E {

    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese un número entero del 1 al 9");
        int num = leer.nextInt();
        int num1 = 0;
                
        for (int i = 1; i <= num; i++) {
            
            num1 = num1 * 10+i;
            System.out.println(num1);
        }
        
        
    }
    
}
