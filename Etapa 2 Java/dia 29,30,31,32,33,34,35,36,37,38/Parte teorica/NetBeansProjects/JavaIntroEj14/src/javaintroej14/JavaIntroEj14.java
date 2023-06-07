/*
Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo
 */
package javaintroej14;
import java.util.Scanner;

public class JavaIntroEj14 {


    public static void main(String[] args) {
        String [] Equipo=new String[7];
        RellenarVector(Equipo);
        MostrarVector(Equipo);
    }
    public static void RellenarVector(String [] Equipo){
        Scanner leer=new Scanner(System.in);
        for(int i=0;i<7;i++){
            System.out.println("Ingrese el nombre del compañero");
            String nombre=leer.nextLine();
            Equipo[i]=nombre;
        }
    }
   public static void MostrarVector(String [] Equipo){
        Scanner leer=new Scanner(System.in);
        for(int i=0;i<7;i++){
            System.out.print("["+Equipo[i]+"]");
        }
        System.out.println("");
    } 
    
}
