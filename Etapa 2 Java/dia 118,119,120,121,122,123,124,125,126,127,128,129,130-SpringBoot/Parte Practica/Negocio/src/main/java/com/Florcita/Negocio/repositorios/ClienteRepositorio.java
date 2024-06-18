/*Crea un repositorio para la entidad Cliente que permita realizar operaciones CRUD
(Create, Read, Update, Delete) en la base de datos.
5) Crea un repositorio para la entidad Order que permita realizar operaciones CRUD.
6) Crea un repositorio para la entidad Product que permita realizar operaciones CRUD.*/
package com.Florcita.Negocio.repositorios;

import com.Florcita.Negocio.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, String>{
    
    @Query("SELECT c FROM Cliente c WHERE c.email = :email")
    public Cliente buscarPorEmail(@Param("email") String email);
    
    @Query("SELECT c FROM Cliente c WHERE c.nombre = :nombre")
    public Cliente buscarPorNombre(@Param("nombre") String nombre);
    
    @Query("SELECT c FROM Cliente c WHERE c.telefono = :telefono")
    public Cliente buscarPorTelefono(@Param("telefono") String telefono);
}
