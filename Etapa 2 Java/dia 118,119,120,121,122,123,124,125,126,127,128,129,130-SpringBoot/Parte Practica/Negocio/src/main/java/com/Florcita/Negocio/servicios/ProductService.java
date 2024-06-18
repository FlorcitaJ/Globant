/*
Crea un servicio para la entidad Cliente que contenga métodos para crear, leer, actualizar
y eliminar clientes. Utiliza DTOs para mapear datos entre el controlador y el servicio.
8) Crea un servicio para la entidad Order con métodos para gestionar pedidos. Utiliza DTOs
para transferir datos entre el controlador y el servicio.
9) Crea un servicio para la entidad Product con métodos para administrar productos. Emplea
DTOs para la transferencia de datos.
 */
package com.Florcita.Negocio.servicios;

import Excepciones.MiExcepcion;
import com.Florcita.Negocio.entidades.Product;
import com.Florcita.Negocio.repositorios.ProductRepositorio;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {
    
    @Autowired
    ProductRepositorio productRepo;
    
    @Transactional
    public void crearProduct (String nombre, Double precio) throws MiExcepcion{
        validar(nombre, precio);
        
        Product product=new Product();
        
        product.setNombre(nombre);
        product.setPrecio(precio);
        
        productRepo.save(product);
    } 
    
    @Transactional
    public void modificarProduct(String id,String nombre,Double precio) throws MiExcepcion{
        validar(nombre, precio);
        Optional<Product> respuesta=productRepo.findById(id);
        if (respuesta.isPresent()) {
            Product product = respuesta.get();
            product.setNombre(nombre);
            product.setPrecio(precio);
            
            productRepo.save(product);
        }
        
    }
    
    @Transactional
    public void eliminarProduct(String id){
        Optional<Product> respuesta=productRepo.findById(id);
        Product product=respuesta.get();
        productRepo.delete(product);
    }

    public List<Product> listarClientes(){
        List<Product> products=new ArrayList();
        products=productRepo.findAll();
        return products;
    }
    
    public Product getOne(String id){
        return productRepo.getOne(id);
    }
    
    private void validar(String nombre, Double precio) throws MiExcepcion{
        if(nombre==null||nombre.trim().isEmpty()){
            throw new MiExcepcion("Debe ingresar un nombre");
        }
                
        if(precio<0||precio==null){
            throw new MiExcepcion("Debe ingresar un precio válido");
        }
        
        
    }
}
