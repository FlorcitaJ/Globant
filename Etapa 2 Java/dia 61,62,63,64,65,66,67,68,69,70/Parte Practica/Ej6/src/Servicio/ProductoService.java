/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package Servicio;

import Entidad.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductoService {
    Scanner leer= new Scanner(System.in);
    Producto p;
    HashMap<String,Double> productos=new HashMap();
    
    public void crearProducto(){
        String respuesta;
        do {
            p = new Producto();
            System.out.println("Ingrese el nombre del producto");
            p.setNombre(leer.nextLine());
            System.out.println("Ingrese el precio del producto");
            p.setPrecio(leer.nextDouble());
            leer.nextLine();
            productos.put(p.getNombre(), p.getPrecio());
            System.out.println("---------------------------------------------------");
            System.out.println("Desea ingresar otro producto?(si/no)");
            respuesta = leer.nextLine();
            while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no")) {
                System.out.println("Respuesta inválida, ingrese una respuesta válida");
                respuesta = leer.nextLine();
            }
            System.out.println("---------------------------------------------------");
        } while (respuesta.equalsIgnoreCase("si"));
        
    }
    
    public void modificarPrecio(){
        int cont=0;
        System.out.println("Ingrese el nombre del producto al que desea modificarle el precio");
        String productoAModificar=leer.nextLine();
        for (Map.Entry<String, Double> producto : productos.entrySet()) {
            String key = producto.getKey();
            Double value = producto.getValue();
            if(key.equalsIgnoreCase(productoAModificar)){
                System.out.println("Ingrese el nuevo valor");
                double nuevoValor=leer.nextDouble();
                productos.replace(key, value, nuevoValor);
                cont=1;
            }
        }
        if(cont==0){
            System.out.println("El producto ingresado no se encuentra en la lista");
        }
    }
    
    public void eliminarProducto(){
        int cont=0;
        System.out.println("Ingrese el nombre del producto que desea eliminar");
        String productoAEliminar=leer.nextLine();
        for (Map.Entry<String, Double> producto : productos.entrySet()) {
            String key = producto.getKey();
            Double value = producto.getValue();
            if(key.equalsIgnoreCase(productoAEliminar)){
                cont=1;
            }
        }
        if(cont==0){
            System.out.println("El producto ingresado no se encuentra en la lista");
        }else{
            productos.remove(productoAEliminar);
        }
    }
    
    public void mostrarProductos(){
        System.out.println("Lista con precios:");
        for (Map.Entry<String, Double> producto : productos.entrySet()) {
            String key = producto.getKey();
            Double value = producto.getValue();
            System.out.println(key+"....$"+value);
        }
    }
    
    public void menu(){
        int respuesta;
        do {
            System.out.println("Menu de opciones:");
            System.out.println("1-Igresar Producto");
            System.out.println("2-Modificar Precio");
            System.out.println("3-Eliminar Producto");
            System.out.println("4-Mostrar Lista de Productos con Precios");
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
                    crearProducto();
                    System.out.println("------------------------------------------------");
                    break;
                case 2:
                    modificarPrecio();
                    System.out.println("------------------------------------------------");
                    break;
                case 3:
                    eliminarProducto();
                    System.out.println("------------------------------------------------");
                    break;
                case 4:
                    mostrarProductos();
                    System.out.println("------------------------------------------------");
                    break;
            }
        } while (respuesta != 5);
    }
}
