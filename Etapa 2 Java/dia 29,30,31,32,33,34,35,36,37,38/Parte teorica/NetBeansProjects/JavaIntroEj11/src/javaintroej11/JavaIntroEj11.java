
package javaintroej11;
import java.util.Scanner;

public class JavaIntroEj11 {

    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase=leer.nextLine(); 
        System.out.println(codificar(frase));
    }
    public static String codificar(String frase){
        String frase2;
        frase2="";
        for (int i = 0; i <frase.length(); i++) {
            char letra=frase.charAt(i);
            switch(letra){
                case 'a':
                    frase2=frase2.concat("@");
                    break;
                case 'e':
                    frase2=frase2.concat("#");
                    break;
                case 'i':
                    frase2=frase2.concat("$");
                    break;
                case 'o':
                    frase2=frase2.concat("%");
                    break;                    
                case 'u':
                    frase2=frase2.concat("*");
                    break;                    
                default:
                    frase2=frase2.concat(Character.toString(letra));
                    break;                    
            }
        }
        return frase2;
    }
}


