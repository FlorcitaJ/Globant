/*
Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta
página: https://mapanet.eu/index.htm. Nota: Poner el código postal sin la letra, solo el
número.
• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
• Muestra por pantalla los datos introducidos
• Pide un código postal y muestra la ciudad asociada si existe sino avisa al usuario.
• Muestra por pantalla los datos
• Agregar una ciudad con su código postal correspondiente más al HashMap.
• Elimina 3 ciudades existentes dentro del HashMap, que pida el usuario.
• Muestra por pantalla los datos
 */
package Servicio;

import Entidad.Codigo;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class CodigoService {
    Scanner leer=new Scanner(System.in);
    Codigo c;
    HashMap<Long,String> codigos=new HashMap();
    
    public void crearCodigo(){
        String respuesta;
        do {
            c = new Codigo();
            System.out.println("Ingrese el código postal");
            c.setCodigo(leer.nextLong());
            leer.nextLine();
            System.out.println("Ingrese el nombre de la ciudad");
            c.setCiudad(leer.nextLine());
            codigos.put(c.getCodigo(),c.getCiudad());
            System.out.println("---------------------------------------------------");
            System.out.println("Desea ingresar otro código postal?(si/no)");
            respuesta = leer.nextLine();
            while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no")) {
                System.out.println("Respuesta inválida, ingrese una respuesta válida");
                respuesta = leer.nextLine();
            }
            System.out.println("---------------------------------------------------");
        } while (respuesta.equalsIgnoreCase("si"));
        
    }
    
    public void mostrarCodigos(){
        for (Map.Entry<Long, String> codigo : codigos.entrySet()) {
            Long key = codigo.getKey();
            String value = codigo.getValue();
            System.out.println(key+"......"+value);
        }
    }
    
    public void mostrarCiudad(){
        System.out.println("Ingrese el código postal de la ciudad que desea ver");
        Long codigoABuscar=leer.nextLong();
        int cont=0;
        for (Map.Entry<Long, String> codigo : codigos.entrySet()) {
            Long key = codigo.getKey();
            String value = codigo.getValue();
            if(Objects.equals(key, codigoABuscar)){
                System.out.println("La ciudad de ese código es "+value);
                cont=1;
            }
        }
        if(cont==0){
            System.out.println("El código ingresado no se encuentra en la lista");
        }
    }
    
    public void eliminarCiudad(){
        System.out.println("Ingrese el código de la ciudad que desea eliminar");
        Long ciudadAEliminar=leer.nextLong();
        int cont=0;
        for (Map.Entry<Long, String> codigo : codigos.entrySet()) {
            Long key = codigo.getKey();
            String value = codigo.getValue();
            if(Objects.equals(key, ciudadAEliminar)){
                cont=1;
            }
        }
        if(cont==0){
            System.out.println("El código ingresado no se encuntra en la lista");
        }else{
            codigos.remove(ciudadAEliminar);
        }
    }
    
    public void menu(){
        int respuesta;
        do {
            System.out.println("Menu de opciones:");
            System.out.println("1-Agregar Código Postal");
            System.out.println("2-Mostrar Lista de Códigos con su Ciudad");
            System.out.println("3-Buscar Ciudad por Código");
            System.out.println("4-Eliminar Ciudad por Código");
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
                    crearCodigo();
                    System.out.println("------------------------------------------------");
                    break;
                case 2:
                    mostrarCodigos();
                    System.out.println("------------------------------------------------");
                    break;
                case 3:
                    mostrarCiudad();
                    System.out.println("------------------------------------------------");
                    break;
                case 4:
                    eliminarCiudad();
                    System.out.println("------------------------------------------------");
                    break;
            }
        } while (respuesta != 5);
    }
    
    
}
