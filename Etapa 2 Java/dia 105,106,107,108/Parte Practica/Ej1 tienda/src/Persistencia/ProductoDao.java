
package Persistencia;

import Entidades.Producto;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public final class ProductoDao extends Dao{
    
    public void guardarProducto(Producto producto) throws Exception{
        try {
            if(producto==null){
                throw new Exception("Debe indicar el producto");
            }
            String sql="Insert into producto (nombre,precio,codigo_fabricante)"
                    +"VALUES ( '"+ producto.getNombre()+ "', '" + producto.getPrecio()+ "' , '" 
                    + producto.getCodigoFabricante()+ "');";
            System.out.println(sql);
            insertarCrearModificar(sql);
        } catch (Exception e) {
            throw e;
        } finally{
            desconectarBase();
        }
    }
    
    public Collection<Producto> listarPorNombre() throws Exception{
        try {
            String sql="SELECT nombre FROM producto";
            consultarBase(sql);
            Producto producto;
            Collection<Producto> productos=new ArrayList<>();
            while (resultado.next()) {                
                producto=new Producto();
                producto.setNombre(resultado.getString("nombre"));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
    
    public Collection<Producto> listarPorNombreYPrecio() throws Exception{
        try {
            String sql="select nombre,precio from producto";
            consultarBase(sql);
            Producto producto;
            Collection<Producto> productos=new ArrayList<>();
            while (resultado.next()) {                
                producto=new Producto();
                producto.setNombre(resultado.getString("nombre"));
                producto.setPrecio(resultado.getDouble("precio"));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
    
    public Collection<Producto> listarPrecioEnRango() throws Exception{
        try {
            String sql="select * from producto where precio>120 and precio<202";
            consultarBase(sql);
            Producto producto;
            Collection<Producto> productos=new ArrayList<>();
            while (resultado.next()) {                
                producto=new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
    
    public Collection<Producto> listarPortatiles() throws Exception{
        try {
            String sql="select * from producto where nombre like '%portatil%'";
            consultarBase(sql);
            Producto producto;
            Collection<Producto> productos=new ArrayList<>();
            while (resultado.next()) {                
                producto=new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
    
    public Producto listarPorNombreYPrecioMasBarato() throws Exception{
        try {
            String sql="select nombre,precio from producto Order by precio asc limit 1";
            consultarBase(sql);
            Producto producto=null;
            while (resultado.next()) {                
                producto=new Producto();
                producto.setNombre(resultado.getString("nombre"));
                producto.setPrecio(resultado.getDouble("precio"));
            }
            desconectarBase();
            return producto;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
    
    public Producto buscarporId(int id) throws Exception{
        try {
            if(id<0){
                throw new Exception("Debe ingresar un id válido");
            }
            String sql="select * from producto where codigo='"+id+"'";
            consultarBase(sql);
            Producto producto=null;
            while (resultado.next()) {                
               producto=new Producto();
               producto.setCodigo(resultado.getInt(1));
               producto.setNombre(resultado.getString(2));
               producto.setPrecio(resultado.getDouble(3));
               producto.setCodigoFabricante(resultado.getInt(4));
            }
            desconectarBase();
            return producto;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void ModificarProducto() throws Exception{
        Scanner leer=new Scanner(System.in);
        String rta;
        int id;
        Producto producto=null;
        do {            
            System.out.println("Ingrese el id del producto que desea modificar");
            id=leer.nextInt();
            System.out.println("El producto que desea modificar es el siguiente?(si/no)");
            producto=buscarporId(id);
            rta=leer.nextLine();
            while (!rta.equalsIgnoreCase("si")||!rta.equalsIgnoreCase("no")) {                
                System.out.println("Respuesta inválida, ingrese si o no");
                rta=leer.nextLine();
            }            
        } while (rta.equalsIgnoreCase("no"));
        
        try {
            if(producto==null){
                throw new Exception("Debe indicar producto");
            }
            boolean band=true;
            while (band) {                
                System.out.println("Ingrese los datos a modificar, si no desea realizar cambios ingrese 4");
                System.out.println("1-Nombre");
                System.out.println("2-Precio");
                System.out.println("3-Codigo de Fabricante");
                int op=leer.nextInt();
                switch(op){
                    case 1:
                        System.out.println("Ingrese el nuevo nombre");
                        producto.setNombre(leer.nextLine());
                        break;
                    case 2:
                        System.out.println("Ingrese el nuevo precio");
                        producto.setPrecio(leer.nextDouble());
                        break;
                    case 3:
                        System.out.println("Ingrese el número de fabricante nuevo(Del 1 al 9)");
                        int valor=leer.nextInt();
                        while (valor<1 || valor>9) {                            
                            System.out.println("El valor ingresado no es válido, ingrese un valor entre 1 y 9");
                            valor=leer.nextInt();
                        }
                        producto.setCodigoFabricante(valor);
                    case 4:
                        band=false;
                }
            }
            String sql="update producto set"
                + " nombre = '" + producto.getNombre()+ "' , precio = '" + producto.getPrecio()+ "' , codigo_fabricante = " + producto.getCodigoFabricante()
                + " WHERE codigo = '" + producto.getCodigo()+ "'";
            insertarCrearModificar(sql);
        } catch (Exception e) {
            throw e;
        } finally{
            desconectarBase();
        }
    }
}
