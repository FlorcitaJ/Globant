
package Persistence;

import Entity.Editorial;

public class EditorialDao extends Dao<Editorial>{

    @Override
    public void delete(Editorial editorial) {
        super.delete(editorial); 
    }

    @Override
    public void save(Editorial editorial) {
        super.save(editorial); 
    }

    @Override
    public void modify(Editorial editorial) {
        super.modify(editorial); 
    }
    
    public Editorial findById(Integer id) {
        conect();
        Editorial editorial = em.find(Editorial.class, id);
        disconect();
        return editorial;
    }
    
    public Editorial findByName(String name){
        conect();
        Editorial editorial = (Editorial) em.createQuery
        ("select e from Editorial e where e.name like :name").setParameter("name", name).getSingleResult();
        disconect();
        return editorial;
    }
    
    public void discharge(Integer id) {
        conect();
        Editorial editorial = findById(id);
        editorial.setDischarge(false);
        modify(editorial);
        disconect();
    }
}
