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
import com.Florcita.Negocio.repositorios.ClienteRepositorio;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteService {
    
    @Autowired
    private ClienteRepositorio clienteRepo;
    
    @Transactional
    public void crearCliente (String nombre, String email, Long telefono) throws MiExcepcion{
        validar(nombre, email, telefono);
        
        Cliente cliente=new Cliente();
        
        cliente.setEmail(email);
        cliente.setNombre(nombre);
        cliente.setTelefono(telefono);
        
        clienteRepo.save(cliente);
    } 
    
    @Transactional
    public void modificarCliente(String id,String nombre, String email, Long telefono) throws MiExcepcion{
        validar(nombre, email, telefono);
        Optional<Cliente> respuesta=clienteRepo.findById(id);
        if (respuesta.isPresent()) {
            Cliente cliente = respuesta.get();
            cliente.setEmail(email);
            cliente.setNombre(nombre);
            cliente.setTelefono(telefono);
            clienteRepo.save(cliente);
        }
        
    }
    
    @Transactional
    public void eliminarCliente(String id){
        Optional<Cliente> respuesta=clienteRepo.findById(id);
        Cliente cliente=respuesta.get();
        clienteRepo.delete(cliente);
    }

    public List<Cliente> listarClientes(){
        List<Cliente> clientes=new ArrayList();
        clientes=clienteRepo.findAll();
        return clientes;
    }
    
    public Cliente getOne(String id){
        return clienteRepo.getOne(id);
    }
    
    private void validar(String nombre, String email,Long telefono) throws MiExcepcion{
        if(nombre==null||nombre.trim().isEmpty()){
            throw new MiExcepcion("Debe ingresar un nombre");
        }
                
        if(telefono<0 || telefono==null){
            throw new MiExcepcion("Debe ingresar un telefono");
        }
        
        if(email==null ||email.trim().isEmpty()){
            throw new MiExcepcion("Debe ingresar un email");
        }
        Cliente cliente=clienteRepo.buscarPorEmail(email);
        if(cliente!=null){
            throw new MiExcepcion("Este email ya se encuentra registrado");
        }
    }
}
