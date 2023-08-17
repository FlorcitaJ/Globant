/*
Escribir un programa en Java que simule un servicio de alquiler de películas. El programa debe tener una clase Pelicula
que represente los datos de una película, como el título, el género, el año y la duración. El programa también debe tener
una clase Alquiler que represente los datos de un alquiler, como la película alquilada, la fecha de inicio, la fecha de fin y
el precio.
El programa puede usar la clase Date para manejar las fechas, la clase Arrays para almacenar y ordenar las películas y
los alquileres, la clase Math para calcular el precio según la duración y el género de la película, y la clase String para
manipular los textos.
El programa debe permitir al usuario ingresar los datos de las películas disponibles y los datos de los alquileres
realizados, y mostrar por pantalla un menú con las opciones de cargar una pelicula, hacer una lista de todas las peliculas
disponibles, crear un alquiler, realizar una lista de todos los alquileres, buscar peliculas por titulo o por genero y buscar
alquileres por fecha
 */
package ejgrupal2;

import Entidad.Pelicula;
import Servicio.PeliculaService;
import java.util.Scanner;


public class EjGrupal2 {


    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int n=1;
        PeliculaService ps=new PeliculaService();
        menu(ps);
    }
    
    public static void menu(PeliculaService ps){
        Scanner leer=new Scanner(System.in);
            int op;
        do {
            System.out.println("Ingrese la opción deseada");
            System.out.println("Menu");
            System.out.println("1-Cargar película");
            System.out.println("2-Lista de películas disponibles");
            System.out.println("3-Crear alquiler");
            System.out.println("4-Lista de películas alquiladas");
            System.out.println("5-Buscar película por título");
            System.out.println("6-Buscar película por género");
            System.out.println("7-Buscar alquiler por fecha");
            System.out.println("8-Calcular alquiler");
            System.out.println("9-Salir");
            op=leer.nextInt();
            switch (op) {
                case 1:
                    ps.crearPelicula();    
                    break;
                case 2:
                    ps.peliculasDisponibles();
                    break;
            }
        } while (op!=9);
    }
    
}
