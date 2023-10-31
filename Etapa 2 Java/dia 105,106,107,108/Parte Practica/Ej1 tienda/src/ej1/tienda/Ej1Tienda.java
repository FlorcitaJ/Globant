/*a) Lista el nombre de todos los productos que hay en la tabla producto.
b) Lista los nombres y los precios de todos los productos de la tabla producto.
c) Listar aquellos productos que su precio esté entre 120 y 202.
d) Buscar y listar todos los Portátiles de la tabla producto.
e) Listar el nombre y el precio del producto más barato.
f) Ingresar un producto a la base de datos.
g) Ingresar un fabricante a la base de datos
h) Editar un producto con datos a elección.*/
package ej1.tienda;

import Servicios.FabricanteService;
import Servicios.ProductoService;
import java.util.Scanner;

public class Ej1Tienda {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        FabricanteService fs=new FabricanteService();
        ProductoService ps=new ProductoService();
        try {
            boolean band = true;
            while (band) {
                System.out.println("Ingrese la opción deseada");
                System.out.println("Menu:");
                System.out.println("1-Generar lista de nombres de los productos");
                System.out.println("2-Generar lista de nombres y precio de los productos");
                System.out.println("3-Generar lista de los productos con precio entre 120 y 202");
                System.out.println("4-Generar lista de los Portátiles");
                System.out.println("5-Mostrar producto más barato");
                System.out.println("6-Agregar un Producto");
                System.out.println("7-Agregar un Fabricante");
                System.out.println("8-Modificar un producto");
                System.out.println("9-Salir");
                int op = leer.nextInt();
                switch (op) {
                    case 1:
                        ps.listarPorNombre();
                        System.out.println("-----------------------------------------");
                        break;
                    case 2:
                        ps.listarPorNombreYPrecio();
                        System.out.println("-----------------------------------------");
                        break;
                    case 3:
                        ps.listarPrecioEnRango();
                        System.out.println("-----------------------------------------");
                        break;
                    case 4:
                        ps.listarPortatiles();
                        System.out.println("-----------------------------------------");
                        break;
                    case 5:
                        ps.listarPorNombreYPrecioMasBarato();
                        System.out.println("-----------------------------------------");
                        break;
                    case 6:
                        ps.crearProducto();
                        System.out.println("-----------------------------------------");
                        break;
                    case 7:
                        fs.crearFabricante();
                        System.out.println("-----------------------------------------");
                        break;
                    case 8:
                        ps.ModificarProducto();
                        System.out.println("-----------------------------------------");
                        break;
                    case 9:
                        band = false;
                        break;
                    default:
                        System.out.println("La opción ingresada no es válida, ingrese una opción válida");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error del sistema por \n" + e.getMessage());
        }
    }
    
}
