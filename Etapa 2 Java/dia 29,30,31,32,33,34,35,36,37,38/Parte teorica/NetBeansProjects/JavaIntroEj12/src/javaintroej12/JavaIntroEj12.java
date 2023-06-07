/*
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
segundo, sino informe que no lo son.
 */
package javaintroej12;
import java.util.Scanner;

public class JavaIntroEj12 {


    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        int num1=leer.nextInt();
        System.out.println("Ingrese el segundo número");
        int num2=leer.nextInt();
        EsMultiplo(num1,num2);
    }
    
    public static void EsMultiplo(int num1, int num2){
        if(num1%num2==0){
            System.out.println("El número "+num1+" es múltiplo del número "+num2);
        }else{
            System.out.println("El numero "+num1+" no es múltiplo del número "+num2);
        }
    }
    
}
