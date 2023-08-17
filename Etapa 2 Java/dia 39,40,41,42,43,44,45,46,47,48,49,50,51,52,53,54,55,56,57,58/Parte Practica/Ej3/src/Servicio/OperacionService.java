/*
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */
package Servicio;

import Entidad.Operacion;
import java.util.Scanner;


public class OperacionService {
    public Operacion crearOperacion(){
        Operacion o1=new Operacion();
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        o1.setNumero1(leer.nextInt());
        System.out.println("Ingrese el segundo número");
        o1.setNumero2(leer.nextInt());
        return o1;
    }
    
    public int sumar(int numero1,int numero2){
        int suma=numero1+numero2;
        return suma;
    }
    
    public int restar(int numero1,int numero2){
        int resta=numero1-numero2;
        return resta;
    }
    
    public int multiplicar(int numero1,int numero2){
        int multiplicacion=0;
        if(numero1==0 || numero2==0){
            System.out.println("Error. Uno de los números es 0");
        }else{
            multiplicacion=numero1*numero2;
        }
        return multiplicacion;
    }
    
    public double dividir(int numero1, int numero2){
        double division=0;
        if(numero2==0){
            System.out.println("Error.No se puede dividir por 0");
        }else{
            division=numero1/numero2;
        }
        return division;
    }
}
