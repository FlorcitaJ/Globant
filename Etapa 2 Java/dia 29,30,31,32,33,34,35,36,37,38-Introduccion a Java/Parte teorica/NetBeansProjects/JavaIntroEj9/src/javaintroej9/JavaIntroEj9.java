/*Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.*/
package javaintroej9;
import java.util.Scanner;

public class JavaIntroEj9 {

   
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int k=0;
        int suma=0;
        do {            
            System.out.println("Ingrese un número");
            int num=leer.nextInt();
            leer.nextLine();
            k=k+1;
            if(num==0){
                System.out.println("Se capturó el número 0");
                k=20;
            }
            if(num<1){
                suma=suma;
            }else{
                suma=suma+num;
            }
        } while (k<20);
        System.out.println("La suma de los enteros positivos ingresados es "+suma);
    }
}
