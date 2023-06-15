/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package ej1;

import Entidad.Libro;
import Servicio.LibroService;


public class Ej1 {

    
    public static void main(String[] args) {
        //creamos un objeto tipo Servicio
        LibroService ls=new LibroService();
        //creamos un objeto tipo Libro y usamos el metodo crear libro de la clase servicio
        Libro l1=ls.crearLibro();
        System.out.println("------------------------------");
        //llamamos al metodo mostrar libro y le pasamos por parametro el objeto libro
        ls.mostrarLibro(l1);
    }
    
}
