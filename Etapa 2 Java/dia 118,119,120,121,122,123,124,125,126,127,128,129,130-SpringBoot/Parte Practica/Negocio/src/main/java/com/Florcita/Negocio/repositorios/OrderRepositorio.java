/*Crea un repositorio para la entidad Cliente que permita realizar operaciones CRUD
(Create, Read, Update, Delete) en la base de datos.
5) Crea un repositorio para la entidad Order que permita realizar operaciones CRUD.
6) Crea un repositorio para la entidad Product que permita realizar operaciones CRUD.*/
package com.Florcita.Negocio.repositorios;

import com.Florcita.Negocio.entidades.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepositorio extends JpaRepository<Order, String> {
    
}
