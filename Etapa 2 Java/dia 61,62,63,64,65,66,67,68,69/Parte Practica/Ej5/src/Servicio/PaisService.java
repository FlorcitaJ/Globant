/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package Servicio;

import Entidad.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class PaisService {
    Scanner leer=new Scanner(System.in);
    Pais p;
    HashSet<Pais> paises=new HashSet();
    
    public void crearPais(){
       String respuesta;
        do { 
            p=new Pais();
            System.out.println("Ingrese el nombre del País");
            p.setNombre(leer.nextLine());
            paises.add(p);
            System.out.println("---------------------------------------------------");
            System.out.println("Desea ingresar otro país?(si/no)");
            respuesta=leer.nextLine();
            while (!respuesta.equalsIgnoreCase("si")&&!respuesta.equalsIgnoreCase("no")) {
                System.out.println("Respuesta inválida, ingrese una respuesta válida");
                 respuesta=leer.nextLine();
            }
            System.out.println("---------------------------------------------------");
        } while (respuesta.equalsIgnoreCase("si"));
    }
    
    public void mostrarPaises(){
        paises.forEach(pais->{
            System.out.println(pais);
        });
    }
     
    public void mostrarOrdenados(){
        System.out.println("Países ordenados alfabéticamente:");
        ArrayList<Pais>listaPaises=new ArrayList(paises);
        listaPaises.sort(Pais.compararAlfabeticamente);
        listaPaises.forEach(pelicula->{
            System.out.println(pelicula);
        });
    }
    
    public void eliminarPais(){
        System.out.println("Ingrese el país que desea quitar de la lista");
        String paisEliminar=leer.nextLine();
        Iterator<Pais> it=paises.iterator();
        int cont=0;
        while (it.hasNext()) {
            Pais pais = it.next();
            if(pais.getNombre().equalsIgnoreCase(paisEliminar)){
                it.remove();
                cont=1;
            }
        }
        if(cont==0){
            System.out.println("El nombre del país no se encuentra en la lista");
        }else{
            mostrarOrdenados();
        }
    }
}
