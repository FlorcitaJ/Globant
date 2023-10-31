/*
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package servicio;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PeliculaService {
    Scanner leer=new Scanner(System.in);
    Pelicula p;
    ArrayList<Pelicula> peliculas=new ArrayList();
    
    public void crearPelicula(){
        String respuesta;
        do { 
            p=new Pelicula();
            System.out.println("Ingrese el título de la película");
            p.setTitulo(leer.nextLine());
            System.out.println("Ingrese el director de la película");
            p.setDirector(leer.nextLine());
            System.out.println("Ingrese la duración de la película en horas");
            p.setDuracionEnHoras(leer.nextInt());
            peliculas.add(p);
            leer.nextLine();
            System.out.println("---------------------------------------------------");
            System.out.println("Desea ingresar otra película?(si/no)");
            respuesta=leer.nextLine();
            while (!respuesta.equalsIgnoreCase("si")&&!respuesta.equalsIgnoreCase("no")) {
                System.out.println("Respuesta inválida, ingrese una respuesta válida");
                 respuesta=leer.nextLine();
            }
            System.out.println("---------------------------------------------------");
        } while (respuesta.equalsIgnoreCase("si"));
    }
    
    public void mostrarPeliculas(){
        peliculas.forEach(pelicula->{
            System.out.println(pelicula);
        });
    }
    
    public void mostrarMayorA1Hora(){
        System.out.println("Peliculas mayores de 1 hora de duración:");
        peliculas.forEach(pelicula->{
            if(pelicula.getDuracionEnHoras()>1){
                System.out.println(pelicula);
            }
        });
    }
    
    public void ordenarDeMayorAMenor(){
        System.out.println("Peliculas ordenadas de mayor a menor duración:");
        peliculas.sort(Pelicula.compararDuracion);
        peliculas.forEach(pelicula->{
            System.out.println(pelicula);
        });
    }
    
    public void ordenarDeMenorAMayor(){
        System.out.println("Peliculas ordenadas de menor a mayor duración:");
        peliculas.sort(Pelicula.compararDuracion2);
        peliculas.forEach(pelicula->{
            System.out.println(pelicula);
        });
    }
    
    public void ordenarPorTitulo(){
        System.out.println("Peliculas ordenadas alfabéticamente por título:");
        peliculas.sort(Pelicula.compararTitulo);
        peliculas.forEach(pelicula->{
            System.out.println(pelicula);
        });
    }
    
    public void ordenarPorDirector(){
        System.out.println("Peliculas ordenadas alfabéticamente por director:");
        peliculas.sort(Pelicula.compararDirector);
        peliculas.forEach(pelicula->{
            System.out.println(pelicula);
        });
    }
            
}
