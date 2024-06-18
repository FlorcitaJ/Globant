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
import com.Florcita.Negocio.entidades.Cliente;
import com.Florcita.Negocio.entidades.Order;
import com.Florcita.Negocio.repositorios.ClienteRepositorio;
import com.Florcita.Negocio.repositorios.OrderRepositorio;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {
    @Autowired
    OrderRepositorio orderRepo;
    
    @Autowired
    ClienteRepositorio clienteRepo;
    
    @Transactional
    public void crearOrder (String idCliente) throws MiExcepcion{
        validar(idCliente);
        
        Order order=new Order();
        
        Cliente cliente=new Cliente();
        
        Optional<Cliente> respuesta=clienteRepo.findById(idCliente);
        if(respuesta.isPresent()){
            cliente=respuesta.get();
        }
        
        order.setFecha(new Date());
        order.setCliente(cliente);
        
        orderRepo.save(order);
    } 
    
    @Transactional
    public void modificarOrder(String id,String idCliente) throws MiExcepcion{
        validar(idCliente);
        Optional<Order> respuesta=orderRepo.findById(id);
        Optional<Cliente>respuestaCliente=clienteRepo.findById(idCliente);
        Cliente cliente=new Cliente();
        if(respuestaCliente.isPresent()){
            cliente=respuestaCliente.get();
        }
        if (respuesta.isPresent()) {
            Order order=respuesta.get();
            
            order.setCliente(cliente);
            orderRepo.save(order);
        }
        
    }
    
    @Transactional
    public void eliminarOrder(String id){
        Optional<Order> respuesta=orderRepo.findById(id);
        Order order=respuesta.get();
        orderRepo.delete(order);
    }

    public List<Order> listarOrders(){
        List<Order> orders=new ArrayList();
        orders=orderRepo.findAll();
        return orders;
    }
    
    public Order getOne(String id){
        return orderRepo.getOne(id);
    }
    
    private void validar(String idCliente) throws MiExcepcion{
        if(idCliente==null || idCliente.trim().isEmpty()){
            throw new MiExcepcion("Debe especificar el id del cliente");
        }
    }
}
