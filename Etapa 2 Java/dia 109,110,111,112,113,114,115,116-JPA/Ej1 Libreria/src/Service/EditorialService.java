
package Service;

import Entity.Editorial;
import Persistence.EditorialDao;
import java.util.Scanner;

public class EditorialService {
    private EditorialDao dao;

    public EditorialService() {
        this.dao=new EditorialDao();
    }
    
    Scanner scan=new Scanner(System.in);
    
    public void createEditorial() throws Exception{
        System.out.println("Please enter the name of the Editorial");
        String name=scan.nextLine();
        try {
            if(name==null||name.trim().isEmpty()){
                throw new Exception("You must enter a name");
            }
            Editorial editorial=new Editorial();
            editorial.setName(name);
            editorial.setDischarge(true);
            dao.save(editorial);
            System.out.println("Editorial added successfully");
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Editorial findById() throws Exception{
        System.out.println("Enter the editorial's id");
        int id=scan.nextInt();
        try {
            if(id<0){
                throw new Exception("You must enter a valid id");
            }
            Editorial editorial=dao.findById(id);
            System.out.println(editorial.getId()+"-"+editorial.getName());
            return editorial;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Editorial findByName() throws Exception{
        System.out.println("Enter the name of the editorial you want to find");
        String name=scan.nextLine();
        try {
            if(name==null||name.trim().isEmpty()){
                throw new Exception("You must enter a name");
            }
            Editorial editorial=dao.findByName(name);
            System.out.println(editorial.getId()+"-"+editorial.getName());
            return editorial;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void discharge() throws Exception {
        String ans;
        Integer id;
        do {
            System.out.println("Please enter the id of the editorial you want to delete");
            id = scan.nextInt();
            try {
                if (id < 0) {
                    throw new Exception("You must enter a valid id");
                }
                Editorial editorial = dao.findById(id);
                System.out.println("Are you sure you want to delete this editorial?(y/n)");
                System.out.println(id + "-" + editorial.getName());
                ans = scan.nextLine();
            } catch (Exception e) {
                throw e;
            }
        } while (ans.equalsIgnoreCase("n"));
        dao.discharge(id);
        System.out.println("Editorial successfully deleted");
    }
    
    public void modify() throws Exception{
        System.out.println("Enter editorial id");
        int id=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the new name of the editorial");
        String name=scan.nextLine();
        try {
            if(id<0){
                throw new Exception("You must enter a valid id");
            }
            if(name==null||name.trim().isEmpty()){
                throw new Exception("You must enter a name");
            }
            Editorial editorial=dao.findById(id);
            editorial.setName(name);
            dao.modify(editorial);
            System.out.println("Editorial modified successfully");
        } catch (Exception e) {
            throw e;
        }
    }
    
}
