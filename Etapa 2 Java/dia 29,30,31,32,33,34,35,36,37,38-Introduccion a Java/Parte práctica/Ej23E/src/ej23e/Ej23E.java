/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().
 */
package ej23e;

import java.util.Scanner;

public class Ej23E {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String [] palabras=new String [5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese una palabra que contenga entre 3 y 5 letras");
            String palabra=leer.nextLine();
            while (palabra.length()<3||palabra.length()>5) {            
            System.out.println("La palabra debe contener entre 3 y 5 letras, "+palabra + " contiene "+palabra.length()+
                    " letras, por favor ingrese otra");
            palabra=leer.nextLine();
            }
            palabras[i]=palabra;
        }
            
            
            
        
        
        
    }
    
}
