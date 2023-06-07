
package javaintroej;
import java.util.Scanner;

public class JavaIntroEj {

    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        int num1=leer.nextInt();
        System.out.println("Ingrese el segundo número");
        int num2=leer.nextInt();
        
        if(num1>25 || num2>25){
            System.out.println("Al menos uno de los números es mayor a 25");
        }else{
            System.out.println("Ninguno de los números es mayor a 25");
        }
    }    
}
