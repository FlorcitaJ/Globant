
package Persistence;

import Entity.Author;

public class AuthorDao extends Dao<Author>{

    @Override
    public void delete(Author author) {
        super.delete(author); 
    }

    @Override
    public void save(Author author){
        super.save(author); 
    }

    @Override
    public void modify(Author author) {
        super.modify(author); 
    }
    
    
    public Author findByName(String name){
        conect();
        Author author = (Author) em.createQuery
        ("Select a from Author a where a.name like :name").setParameter("name", name).getSingleResult();
        disconect();
        return author;
    }
    
    public void discharge(Integer id) {
        conect();
        Author author = findById(id);
        author.setDischarge(false);
        modify(author);
        disconect();
    }
    
    public Author findById(Integer id) {
        conect();
        Author author = em.find(Author.class, id);
        disconect();
        return author;
    }
}
