/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package Servicio;

import Entidad.Libro;
import java.awt.AWTException;
import java.awt.Robot;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LibroService {
    //creamos un metodo de creacion de un libro
    public Libro crearLibro(){
        //creamos una instanciacion de un objeto tipo libro
        Libro l1=new Libro();
        //creamos un objeto tipo scanner
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        //comenzamos a llenar los atributos
        System.out.println("Ingrese el ISBN del libro");
        l1.setIsbn(leer.nextInt());
        System.out.println("Ingrese el título");
        l1.setTitulo(leer.next());
        System.out.println("Ingrese el autor");
        l1.setAutor(leer.next());
        System.out.println("Ingrese el número de páginas");
        l1.setNumeroDePaginas(leer.nextInt());
        
        return l1;
    }
    
    public void mostrarLibro(Libro l1){
        System.out.println(l1.getIsbn());
        System.out.println(l1.getTitulo());
        System.out.println(l1.getAutor());
        System.out.println(l1.getNumeroDePaginas()+"Hola");
    }
    public void cls() {
        try {
            Robot pressbot = new Robot();
            pressbot.keyPress(17); // Holds CTRL key.
            pressbot.keyPress(76); // Holds L key.
            pressbot.keyRelease(17); // Releases CTRL key.
            pressbot.keyRelease(76); // Releases L key.
        } catch (AWTException ex) {
            Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
