
package Persistence;

import Entity.Book;
import java.util.Collection;

public class BookDao extends Dao<Book>{

    @Override
    public void delete(Book book) {
        super.delete(book); 
    }

    @Override
    public void save(Book book) {
        super.save(book); 
    }

    @Override
    public void modify(Book book) {
        super.modify(book); 
    }
    
    public Book findByIsbn(Long isbn) {
        conect();
        Book book = em.find(Book.class, isbn);
        disconect();
        return book;
    }
    
    public Book findByTitle(String title){
       conect();
       Book book=(Book) em.createQuery
       ("select b from Book b where b.title like :title").setParameter("title", title).getSingleResult();
       disconect();
       return book;
    }
    
    public Collection<Book> findByAuthorName(String authorName){
        conect();
        Collection<Book> books=em.createQuery
        ("select b from Book b join b.author a where a.name like :name").setParameter
        ("name", authorName).getResultList();
        disconect();
        return books;
    }
    
    public Collection<Book> findByEditorialName(String editorialName){
        conect();
        Collection<Book> books= em.createQuery
        ("select b from Book b join b.editorial e where e.name like :name").setParameter
        ("name", editorialName).getResultList();
        disconect();
        return books;
    }
    
    public void discharge(Long isbn){
        conect();
        Book book=findByIsbn(isbn);
        book.setDischarge(false);
        modify(book);
        disconect();
    }
}
