
package javaintroej5;
import java.util.Scanner;
        
public class JavaIntroEj5 {


    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        boolean respuesta;
        double altura;
        String sexo;
        String sexo2="F";
        sexo2=sexo2.concat("\n");
        System.out.println("Ingrese su altura");
        altura=leer.nextDouble();
        leer.nextLine();
        System.out.println("Ingrese F si es mujer o M si es hombre");
        sexo=leer.nextLine();
        sexo="F";
        if(sexo=="F"){
            respuesta=true;
        }else{
            respuesta=false;
        }
        if(respuesta==true){
            if(altura<1.5){
                System.out.println("Bienvenida al concurso de petizas");
            }else{
                System.out.println("Usted es una mujer normal o alta");
            }
        }else{
            System.out.println("Los hombres no participan" + sexo + " "+respuesta+" "+sexo2);
        }
    }
}
