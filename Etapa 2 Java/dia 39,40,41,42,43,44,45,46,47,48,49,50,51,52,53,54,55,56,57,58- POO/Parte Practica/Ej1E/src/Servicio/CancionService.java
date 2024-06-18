/*

 */
package Servicio;

import Entidad.Cancion;
import java.util.Scanner;


public class CancionService {
    Scanner leer=new Scanner(System.in);
    Cancion c=new Cancion();
    
    public Cancion crearCancion(){
        System.out.println("Ingrese el título");
        c.setTitulo(leer.nextLine());
        System.out.println("Ingrese el autor");
        c.setAutor(leer.nextLine());
        return c;
    }
    
    public void mostrarCancion(){
        System.out.println(c.toString());
    }
}
