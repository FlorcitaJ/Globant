
package Service;

import Entity.Author;
import Persistence.AuthorDao;
import java.util.Scanner;

public class AuthorService {
    private AuthorDao dao;

    public AuthorService() {
        this.dao = new AuthorDao();
    }
    
    Scanner scan=new Scanner(System.in);
    
    public void createAuthor() throws Exception{
        System.out.println("Please enter the name of the new author ");
        String name=scan.nextLine();
        try {
            if(name==null||name.trim().isEmpty()){
                throw new Exception("you must enter a name");
            }
            Author author=new Author();
            author.setName(name);
            author.setDischarge(true);
            dao.save(author);
            System.out.println("Author added successfully");
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Author findById() throws Exception{
        System.out.println("Please enter author id");
        Integer id=scan.nextInt();
        try {
            if(id<0){
                throw new Exception("You must enter a valid id");
            }
            Author author=dao.findById(id);
            System.out.println(author.getId()+"-"+author.getName());
            return author;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Author findByName() throws Exception{
        System.out.println("Please enter author name");
        String name=scan.nextLine();
        try {
            if(name==null||name.trim().isEmpty()){
                throw new Exception("You must enter a name");
            }
            Author author=dao.findByName(name);
            System.out.println(author.getId()+"-"+author.getName());
            return author;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void discharge() throws Exception{
        String ans;
        Integer id;
        do {
            System.out.println("Please enter author id");
            id = scan.nextInt();
            try {
                if (id < 0) {
                    throw new Exception("You must enter a valid id");
                }
                Author author = dao.findById(id);
                System.out.println("Are you sure you want to delete this author?(y/n)");
                System.out.println(id+ "-" + author.getName());
                ans = scan.nextLine();
            } catch (Exception e) {
                throw e;
            }
        } while (ans.equalsIgnoreCase("n"));
        dao.discharge(id);
        System.out.println("Author successfully deleted");
    }
    
    public void modify() throws Exception{
        System.out.println("Enter author id you want to modify");
        int id=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the new name of the author");
        String name=scan.nextLine();
        try {
            if(id<0){
                throw new Exception("You must enter a valid id");
            }
            if(name==null||name.trim().isEmpty()){
                throw new Exception("You must enter a name");
            }
            Author author=dao.findById(id);
            author.setName(name);
            dao.modify(author);
            System.out.println("Author modified succesfully");
        } catch (Exception e) {
            throw e;
        }
    }
}
