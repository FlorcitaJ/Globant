/*
Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5 objetos
de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de cada cantante
y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el usuario
elija o de salir del programa. Al final se deberá mostrar la lista con todos los cambios
 */
package Servicio;

import Entidad.CantanteFamoso;
import java.util.ArrayList;
import java.util.Scanner;

public class CantanteFamosoService {
    Scanner leer=new Scanner(System.in);
    CantanteFamoso c;
    ArrayList<CantanteFamoso> listaCantantes=new ArrayList();
    
    public void crearCantante(){
        String respuesta;
        do {
            c = new CantanteFamoso();
            System.out.println("Ingrese el nombre del cantante");
            c.setNombre(leer.nextLine());
            System.out.println("Ingrese el disco con más ventas");
            c.setDiscoMasVentas(leer.nextLine());
            listaCantantes.add(c);
            System.out.println("---------------------------------------------------");
            System.out.println("Desea ingresar otro cantante?(si/no)");
            respuesta = leer.nextLine();
            while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no")) {
                System.out.println("Respuesta inválida, ingrese una respuesta válida");
                respuesta = leer.nextLine();
            }
            System.out.println("---------------------------------------------------");
        } while (respuesta.equalsIgnoreCase("si"));
        
    }
    
    public void mostrarCantantes(){
        listaCantantes.forEach(cantante->{
            System.out.println(cantante.toString());
        });
    }
    
    public void eliminarCantante(){
        System.out.println("Ingrese el cantante que desea eliminar de la lista");
        String cantanteAEliminar=leer.nextLine();
        for (int i = 0; i < listaCantantes.size(); i++) {
            if(listaCantantes.get(i).getNombre().equalsIgnoreCase(cantanteAEliminar)){
                listaCantantes.remove(i);
            }
        }
    }
    
    public void menu(){
        int respuesta;
        do {
            System.out.println("Menu de opciones:");
            System.out.println("1-Igresar Cantante");
            System.out.println("2-Mostrar Lista de Cantantes");
            System.out.println("3-Eliminar Cantante");
            System.out.println("4-Salir");
            System.out.println("Ingrese la opción deseada");
            respuesta=leer.nextInt();
            while (respuesta > 4 || respuesta < 1) {
                System.out.println("------------------------------------------------");
                System.out.println("Opción inválida, ingrese una opción del menu");
                respuesta=leer.nextInt();
            }
            leer.nextLine();
            System.out.println("------------------------------------------------");
            switch(respuesta){
                case 1:
                    crearCantante();
                    System.out.println("------------------------------------------------");
                    break;
                case 2:
                    mostrarCantantes();
                    System.out.println("------------------------------------------------");
                    break;
                case 3:
                    eliminarCantante();
                    System.out.println("------------------------------------------------");
                    break;
            }
        } while (respuesta != 4);
        mostrarCantantes();
    }
}
