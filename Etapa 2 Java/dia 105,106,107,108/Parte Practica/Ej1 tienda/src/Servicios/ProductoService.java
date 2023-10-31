
package Servicios;

import Entidades.Producto;
import Persistencia.ProductoDao;
import java.util.Collection;
import java.util.Scanner;

public class ProductoService {
    private ProductoDao dao;

    public ProductoService() {
        this.dao = new ProductoDao();
    }
    
    Scanner leer=new Scanner(System.in);
    
    public void crearProducto() throws Exception{
        System.out.println("A continuación ingrese los datos del producto nuevo");
        System.out.println("Nombre:");
        String nombre=leer.nextLine();
        System.out.println("Precio");
        double precio=leer.nextDouble();
        System.out.println("Código del fabricante");
        System.out.println("1-Asus");
        System.out.println("2-Lenovo");
        System.out.println("3-Hewlett-Packard");
        System.out.println("4-Samsung");
        System.out.println("5-Seagate");
        System.out.println("6-Crucial");
        System.out.println("7-Gigabyte");
        System.out.println("8-Huawei");
        System.out.println("9-Xiaomi");
        int codFab=leer.nextInt();
        while (codFab<1||codFab>9) {
            System.out.println("Opción inválida, ingrese una opción válida(1 a 9");
            codFab=leer.nextInt();
        }
        try {
            if(nombre==null||nombre.trim().isEmpty()){
                throw new Exception("Debe ingresar el nombre");
            }
            if(precio<0){
                throw new Exception("Debe ingresar un precio válido");
            }
            if(codFab<0){
                throw new Exception("Debe ingresar un fabricante válido");
            }
            Producto producto=new Producto();
            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setCodigoFabricante(codFab);
            dao.guardarProducto(producto);
            System.out.println("Producto creado y guardado con éxito");
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Collection<Producto> listarPorNombre() throws Exception{
         try {
            Collection<Producto>productos=dao.listarPorNombre();
             System.out.println("Lista de nombres:");
            for (Producto producto : productos) {
                System.out.println(producto.getNombre());
            }
             return productos;
         } catch (Exception e) {
             throw e;
         }
     }
     
    public Collection<Producto> listarPorNombreYPrecio() throws Exception{
         try {
            Collection<Producto>productos=dao.listarPorNombreYPrecio();
             System.out.println("Lista de nombres y precios:");
            for (Producto producto : productos) {
                System.out.println(producto.getNombre()+"..."+producto.getPrecio());
            }
            return productos;
         } catch (Exception e) {
             throw e;
         }
     }
    
    public Collection<Producto> listarPrecioEnRango() throws Exception{
         try {
             Collection<Producto>productos=dao.listarPrecioEnRango();
             System.out.println("Productos entre 120 y 202 de valor:");
            for (Producto producto : productos) {
                System.out.println(producto.getCodigo()+"-"+producto.getNombre()+"-"+producto.getPrecio()+"-"+producto.getCodigoFabricante());
            }
             return productos;
         } catch (Exception e) {
             throw e;
         }
     }
    
    public Collection<Producto> listarPortatiles() throws Exception{
         try {
            Collection<Producto>productos=dao.listarPortatiles();
            System.out.println("Lista de próductos prtátiles:");
            for (Producto producto : productos) {
                System.out.println(producto.getCodigo()+"-"+producto.getNombre()+"-"+producto.getPrecio()+"-"+producto.getCodigoFabricante());
            }
            return productos;
         } catch (Exception e) {
             throw e;
         }
     }
    
    public Producto listarPorNombreYPrecioMasBarato() throws Exception{
         try {
             Producto producto=dao.listarPorNombreYPrecioMasBarato();
             System.out.println("Producto mas barato:");
             System.out.println(producto.getNombre()+"-"+producto.getPrecio());
             return producto;
         } catch (Exception e) {
             throw e;
         }
     }
    
    public void ModificarProducto() throws Exception{
         try {
            dao.ModificarProducto();
             System.out.println("Modificación exitosa");
         } catch (Exception e) {
             throw e;
         }
     }
}
