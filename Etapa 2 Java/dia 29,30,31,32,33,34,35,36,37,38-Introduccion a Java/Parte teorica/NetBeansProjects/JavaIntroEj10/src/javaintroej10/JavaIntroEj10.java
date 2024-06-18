/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package javaintroej10;
import java.util.Scanner;

public class JavaIntroEj10 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese un número entre 1 y 20");
            int num=leer.nextInt();
            while (num<1 || num>20) {                
                System.out.println("El número ingresado no se encuentra dentro del rango 1-20, ingrese otro número");
                num=leer.nextInt();
            }
            for (int j = 0; j < num; j++) {
                if(j==0){
                    System.out.print(num+"*");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
    }
    
}
