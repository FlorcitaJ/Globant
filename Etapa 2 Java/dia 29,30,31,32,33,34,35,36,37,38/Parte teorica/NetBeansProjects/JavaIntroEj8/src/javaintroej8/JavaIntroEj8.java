
package javaintroej8;
import java.util.Scanner;

public class JavaIntroEj8 {

   
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese una nota");
        int nota=leer.nextInt();
        while (nota<0 || nota>10){
            System.out.println("La nota es incorrecta, ingrese una nota válida");
            nota=leer.nextInt();  
        }
    }  
}
