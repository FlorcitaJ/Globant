
package ej1.libreria;

import Service.AuthorService;
import Service.BookService;
import Service.EditorialService;
import java.util.Scanner;

public class Menu {
  
    public void ejecutarMenu() throws Exception{
        BookService bs=new BookService();
        EditorialService es=new EditorialService();
        AuthorService as=new AuthorService();
        Scanner scan=new Scanner(System.in);
        int op;
        int op2;
        try {
            do {
                System.out.println("-------------------------------------------------");
                System.out.println("What do you want to do?");
                System.out.println("Menu");
                System.out.println("1-Create and Save");
                System.out.println("2-Find");
                System.out.println("3-Modify");
                System.out.println("4-Delete");
                System.out.println("5-Exit");
                op = scan.nextInt();
                switch (op) {
                    case 1:
                        System.out.println("-------------------------------------------------");
                        System.out.println("What do you want to crate and save?");
                        System.out.println("1-Author");
                        System.out.println("2-Editorial");
                        System.out.println("3-Book");
                        op2 = scan.nextInt();
                        switch (op2) {
                            case 1:
                                as.createAuthor();
                                break;
                            case 2:
                                es.createEditorial();
                                break;
                            case 3:
                                bs.createBook();
                                break;
                            default:
                                System.out.println("Invalid option, please enter a valid option");
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("-------------------------------------------------");
                        System.out.println("What do you want to find?");
                        System.out.println("1-Author");
                        System.out.println("2-Editorial");
                        System.out.println("3-Book");
                        op2 = scan.nextInt();
                        switch (op2) {
                            case 1:
                                System.out.println("-------------------------------------------------");
                                System.out.println("You want to find it by:");
                                System.out.println("1-Name");
                                System.out.println("2-Id");
                                op2 = scan.nextInt();
                                switch (op2) {
                                    case 1:
                                        as.findByName();
                                        break;
                                    case 2:
                                        as.findById();
                                        break;
                                    default:
                                        System.out.println("Invalid option, please enter a valid option");
                                        break;
                                }
                                break;
                            case 2:
                                System.out.println("-------------------------------------------------");
                                System.out.println("You want to find it by:");
                                System.out.println("1-Name");
                                System.out.println("2-Id");
                                op2 = scan.nextInt();
                                switch (op2) {
                                    case 1:
                                        es.findByName();
                                        break;
                                    case 2:
                                        es.findById();
                                        break;
                                    default:
                                        System.out.println("Invalid option, please enter a valid option");
                                        break;
                                }
                                break;
                            case 3:
                                System.out.println("-------------------------------------------------");
                                System.out.println("You want to find it by:");
                                System.out.println("1-Isbn");
                                System.out.println("2-Title");
                                System.out.println("3-Author Name");
                                System.out.println("4-Editorial Name");
                                op2 = scan.nextInt();
                                switch (op2) {
                                    case 1:
                                        bs.findByIsbn();
                                        break;
                                    case 2:
                                        bs.findByTitle();
                                        break;
                                    case 3:
                                        bs.findByAuthorName();
                                        break;
                                    case 4:
                                        bs.findByEditorialName();
                                        break;
                                    default:
                                        System.out.println("Invalid option, please enter a valid option");
                                        break;
                                }
                                break;
                            default:
                                System.out.println("Invalid option, please enter a valid option");
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("-------------------------------------------------");
                        System.out.println("What do you want to Modify?");
                        System.out.println("1-Author");
                        System.out.println("2-Editorial");
                        System.out.println("3-Book");
                        op2 = scan.nextInt();
                        switch (op2) {
                            case 1:
                                as.modify();
                                break;
                            case 2:
                                es.modify();
                                break;
                            case 3:
                                bs.modify();
                                break;
                            default:
                                System.out.println("Invalid option, please enter a valid option");
                                break;
                        }
                        break;
                    case 4:
                        System.out.println("-------------------------------------------------");
                        System.out.println("What do you want to Delete?");
                        System.out.println("1-Author");
                        System.out.println("2-Editorial");
                        System.out.println("3-Book");
                        op2 = scan.nextInt();
                        switch (op2) {
                            case 1:
                                as.discharge();
                                break;
                            case 2:
                                es.discharge();
                                break;
                            case 3:
                                bs.discharge();
                                break;
                            default:
                                System.out.println("Invalid option, please enter a valid option");
                                break;
                        }
                        break;
                    case 5:
                        System.out.println("-------------------------------------------------");
                        System.out.println("Good Bye");
                        break;
                    default:
                        System.out.println("Invalid option, please enter a valid option");
                        break;
                }
            } while (op != 5);
        } catch (Exception e) {
            throw e;
        }
        
    }
}
