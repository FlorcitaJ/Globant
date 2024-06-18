/*
Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo busca
en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al método. El
método se incrementa de a uno, como un carrito de compras, el atributo ejemplares
prestados, del libro que ingresó el usuario. Esto sucederá cada vez que se realice un
préstamo del libro. No se podrán prestar libros de los que no queden ejemplares
disponibles para prestar. Devuelve true si se ha podido realizar la operación y false en
caso contrario.
Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se lo
busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método. El
método decrementa de a uno, como un carrito de compras, el atributo ejemplares
prestados, del libro seleccionado por el usuario. Esto sucederá cada vez que se
produzca la devolución de un libro. No se podrán devolver libros donde que no tengan
ejemplares prestados. Devuelve true si se ha podido realizar la operación y false en
caso contrario.
Método toString para mostrar los datos de los libros.
 */
package Servicio;

import Entidad.Libro;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class LibroService {
    Scanner leer=new Scanner(System.in);
    Libro l;
    HashSet<Libro> libros=new HashSet();
    public void crearLibro(){
        String respuesta;
        do {
            l = new Libro();
            System.out.println("Ingrese el título");
            l.setTitulo(leer.nextLine());
            System.out.println("Ingrese el nombre del autor");
            l.setAutor(leer.nextLine());
            System.out.println("Ingrese el número de ejemplares");
            l.setEjemplares(leer.nextInt());
            System.out.println("Ingrese el número de ejemplares prestados");
            l.setEjemplaresPrestados(leer.nextInt());
            leer.nextLine();
            libros.add(l);
            System.out.println("---------------------------------------------------");
            System.out.println("Desea ingresar otro libro?(si/no)");
            respuesta = leer.nextLine();
            while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no")) {
                System.out.println("Respuesta inválida, ingrese una respuesta válida");
                respuesta = leer.nextLine();
            }
            System.out.println("---------------------------------------------------");
        } while (respuesta.equalsIgnoreCase("si"));
        
    }
     
    public boolean prestamo(){
         System.out.println("Ingrese el título del libro que desea prestar");
         String libroAPrestar=leer.nextLine();
         int cont=0;
         boolean respuesta=false;
         for (Libro libro : libros) {
             if(libro.getTitulo().equalsIgnoreCase(libroAPrestar)){
                 cont=1;
                 int prestados=libro.getEjemplaresPrestados();
                 if (prestados < libro.getEjemplares()) {
                     prestados += 1;
                     libro.setEjemplaresPrestados(prestados);
                     respuesta=true;
                 }else{
                     System.out.println("No quedan mas ejemplares para prestar");
                 }
         }
     }
         if(cont==0){
             System.out.println("El libro no se encuentra en la lista");
         }
         return respuesta;
     }
     
    public boolean devolucion(){
         System.out.println("Ingrese el título del libro que desea devolver");
         String libroADevolver=leer.nextLine();
         int cont=0;
         boolean respuesta=false;
         for (Libro libro : libros) {
             if(libro.getTitulo().equalsIgnoreCase(libroADevolver)){
                 cont=1;
                 int prestados=libro.getEjemplaresPrestados();
                 if (prestados >0) {
                     prestados -= 1;
                     libro.setEjemplaresPrestados(prestados);
                     respuesta=true;
                 }else{
                     System.out.println("No quedan mas ejemplares para devolver");
                 }
         }
     }
         if(cont==0){
             System.out.println("El libro no se encuentra en la lista");
         }
         return respuesta;
     }
      
    public void mostrarLibros(){
        libros.forEach(libro->{
            System.out.println(libro.toString());
        });
    } 
    
    public void menu(){
        int respuesta;
        do {
            System.out.println("Menu de opciones:");
            System.out.println("1-Agregar Libro");
            System.out.println("2-Mostrar Lista de Libros");
            System.out.println("3-Prestar Libro");
            System.out.println("4-Devolver Libro");
            System.out.println("5-Salir");
            System.out.println("Ingrese la opción deseada");
            respuesta=leer.nextInt();
            while (respuesta > 5 || respuesta < 1) {
                System.out.println("------------------------------------------------");
                System.out.println("Opción inválida, ingrese una opción del menu");
                respuesta=leer.nextInt();
            }
            leer.nextLine();
            System.out.println("------------------------------------------------");
            switch(respuesta){
                case 1:
                    crearLibro();
                    System.out.println("------------------------------------------------");
                    break;
                case 2:
                    mostrarLibros();
                    System.out.println("------------------------------------------------");
                    break;
                case 3:
                    System.out.println("Se realizó el préstamo?"+prestamo());
                    System.out.println("------------------------------------------------");
                    break;
                case 4:
                    System.out.println("Se realizó la devolución?"+devolucion());
                    System.out.println("------------------------------------------------");
                    break;
            }
        } while (respuesta != 5);
    }
}
