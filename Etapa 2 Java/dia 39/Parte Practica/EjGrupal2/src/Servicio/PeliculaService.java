/*
Crear Película
Crear Alquiler
Listar todas las películas disponibles
Listar todas las películas alquiladas
Buscar una película por título (Decir si se existe o no)
Buscar una película por género (Decir si se existe o no)
Buscar un alquiler por fecha (Decir si se existe o no, y si existe, mostrar los datos del alquiler)
Calcular el ingreso total del servicio (El alquiler cuesta $10, por 3 días. Por cada día extra, se aumenta un 10% de
interés.)
 */
package Servicio;

import Entidad.Pelicula;
import java.util.Arrays;
import java.util.Scanner;


public class PeliculaService {
    private Pelicula p;
    public int n=0;
    Pelicula[] lista=new Pelicula[100];
    
    public PeliculaService(){
        this.p=new Pelicula();
    }
    
    Scanner leer=new Scanner(System.in);
    
    public void crearPelicula(){
        String rta;
        do {
            System.out.println("Ingrese el título de la película");
            p.setTitulo(leer.nextLine());
            System.out.println("Ingrese el género de la película");
            p.setGenero(leer.nextLine());
            System.out.println("Ingrese el año de la película");
            p.setAnio(leer.nextInt());
            leer.nextLine();
            System.out.println("Ingrese la duración en minutos");
            p.setDuracion(leer.nextInt());
            leer.nextLine();

            System.out.println("Desea ingresar otra película?(S/N)");
            rta = leer.next();
            leer.nextLine();
            lista[n]=(p);
            n++;
            Pelicula p=new Pelicula();
        } while (rta.equalsIgnoreCase("S"));
        
        
    }
    
    public void peliculasDisponibles(){
        for (int i = 0; i < n; i++) {
            System.out.println(lista[i]);
        }
    }
}
