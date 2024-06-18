
package Persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class Dao<T> {
    protected final EntityManagerFactory emf= Persistence.createEntityManagerFactory("LibreriaPU");
    protected EntityManager em= emf.createEntityManager();
    
    protected void conect(){
        if(!em.isOpen()){
            em=emf.createEntityManager();
        }
    }
    
    protected void disconect(){
        if(em.isOpen()){
            em.close();
        }
    }
    
    protected void save(T object){
        conect();
        em.getTransaction().begin();
        em.persist(object);
        em.getTransaction().commit();
        disconect();
    }
    
    protected void modify(T object){
        conect();
        em.getTransaction().begin();
        em.merge(object);
        em.getTransaction().commit();
        disconect();
    }
    
    protected void delete(T object){
        conect();
        em.getTransaction().begin();
        em.remove(object);
        em.getTransaction().commit();
        disconect();
    }
}
