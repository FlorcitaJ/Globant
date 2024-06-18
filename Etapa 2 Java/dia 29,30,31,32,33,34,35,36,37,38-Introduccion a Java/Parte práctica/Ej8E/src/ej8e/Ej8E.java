/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares
y la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
package ej8e;

import java.util.Scanner;

public class Ej8E {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        boolean band=true;
        int cont=0;
        int contPar=0;
        int contImpar=0;
            while (band) {            
                System.out.println("Ingrese un número entero");
                int num=leer.nextInt();
                if(num%5==0){
                    break;
                }else{
                    if(num>=0){
                        cont+=1;
                        if(num%2==0){
                            contPar+=1;
                        }else{
                            contImpar+=1;
                        }
                    }
                }
        }
        System.out.println("De un total de "+cont+" números enteros positivos, "+contImpar+" son impares y "+contPar+" son pares");
    }
    
}
