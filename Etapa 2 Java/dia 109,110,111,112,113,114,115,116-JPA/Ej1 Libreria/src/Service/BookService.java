
package Service;

import Entity.Author;
import Entity.Book;
import Entity.Editorial;
import Persistence.BookDao;
import java.util.Collection;
import java.util.Scanner;

public class BookService {
    private BookDao dao;

    public BookService() {
        this.dao=new BookDao();
    }
    
    Scanner scan=new Scanner(System.in);
    AuthorService as=new AuthorService();
    EditorialService es=new EditorialService();
    
    public void createBook() throws Exception{
        System.out.println("Please enter the book data below");
        System.out.println("Title");
        String title=scan.nextLine();
        System.out.println("Year");
        int year=scan.nextInt();
        System.out.println("Copies");
        int copies=scan.nextInt();
        scan.nextLine();
        try {
            Author author=as.findByName();
            Editorial editorial=es.findByName();
            if(title==null||title.trim().isEmpty()){
                throw new Exception("You must enter a title");
            }
            if(year<0||year>2023){
                throw new Exception("You must enter a valid year");
            }
            if(copies<0){
                throw new Exception("You must enter a valid copies quantity");
            }
            if(author==null){
                throw new Exception("You must enter an author name");
            }
            if(editorial==null){
                throw new Exception("You must enter an editorial name");
            }
            Book book=new Book();
            book.setTitle(title);
            book.setYear(year);
            book.setCopies(copies);
            book.setBorrowedCopies(0);
            book.setRemainingCopies(copies);
            book.setAuthor(author);
            book.setEditorial(editorial);
            book.setDischarge(true);
            dao.save(book);
            System.out.println("Book added successfully");
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void modify() throws Exception {
        System.out.println("Enter the book isbn you want to modify");
        Long isbn = scan.nextLong();
        int op;
        Book book;
        do {
            try {
                if (isbn < 0) {
                    throw new Exception("you must enter a valid isbn");
                }
                book = dao.findByIsbn(isbn);
                System.out.println("What do you want to modify?");
                System.out.println("1-Title");
                System.out.println("2-Year");
                System.out.println("3-Copies");
                System.out.println("4-Author name");
                System.out.println("5-Editorial name");
                System.out.println("6-I don't want tp modify nothing");
                op = scan.nextInt();
                switch (op) {
                    case 1:
                        System.out.println("Please enter the new title");
                        book.setTitle(scan.nextLine());
                        System.out.println("Title successfully modified");
                        System.out.println("---------------------------");
                        break;
                    case 2:
                        System.out.println("Please enter the new year");
                        book.setYear(scan.nextInt());
                        System.out.println("Year successfully modified");
                        System.out.println("---------------------------");
                        break;
                    case 3:
                        System.out.println("Please enter the new number of copies");
                        book.setCopies(scan.nextInt());
                        System.out.println("Number of copies successfully modified");
                        System.out.println("---------------------------");
                        break;
                    case 4:
                        Author author = as.findByName();
                        book.setAuthor(author);
                        System.out.println("Author successfully modified");
                        System.out.println("---------------------------");
                        break;
                    case 5:
                        Editorial editorial = es.findByName();
                        book.setEditorial(editorial);
                        System.out.println("Editorial successfully modified");
                        System.out.println("---------------------------");
                        break;
                    default:
                        System.out.println("Invalid option, please enter a valid option");
                }
            } catch (Exception e) {
                throw e;
            }
        } while (op != 6);
        dao.modify(book);
        System.out.println("Succesfully modification");
    }
    
    public void discharge() throws Exception {
        String ans;
        Long isbn;
        do {
            System.out.println("Please enter the isbn of the book you want to delete");
            isbn = scan.nextLong();
            try {
                if (isbn < 0) {
                    throw new Exception("You must enter a valid isbn");
                }
                Book book = dao.findByIsbn(isbn);
                System.out.println("Are you sure you want to delete this book?(y/n)");
                String editorialName = book.getEditorial().getName();
                String authorName = book.getAuthor().getName();
                System.out.println(book.toString());
                System.out.print(", Author= " + authorName + ", Editorial= " + editorialName);
                ans = scan.nextLine();
            } catch (Exception e) {
                throw e;
            }
        } while (ans.equalsIgnoreCase("n"));
        dao.discharge(isbn);
        System.out.println("Book successfully deleted");
    }
    
    public Book findByIsbn() throws Exception{
        System.out.println("Please enter book isbn you want to find");
        Long isbn=scan.nextLong();
        try {
            if(isbn<0){
                throw new Exception("You must enter a valid isbn");
            }
            Book book=dao.findByIsbn(isbn);
            String editorialName=book.getEditorial().getName();
            String authorName=book.getAuthor().getName();
            System.out.println(book.toString()+", Author= "+authorName+", Editorial= "+editorialName);
            return book;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Book findByTitle() throws Exception{
        System.out.println("Please enter the title of the book you want to find");
        String title=scan.nextLine();
        try {
            if(title==null||title.trim().isEmpty()){
                throw new Exception("You must enter a title");
            }
            Book book=dao.findByTitle(title);
            String editorialName=book.getEditorial().getName();
            String authorName=book.getAuthor().getName();
            System.out.println(book.toString()+", Author= "+authorName+", Editorial= "+editorialName);
            return book;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Collection<Book> findByAuthorName() throws Exception {
        System.out.println("Pease enter the author name");
        String authorName = scan.nextLine();
        try {
            if (authorName == null || authorName.trim().isEmpty()) {
                throw new Exception("You must enter an author name");
            }
            Collection<Book> books = dao.findByAuthorName(authorName);
            for (Book book : books) {
                String editorialName = book.getEditorial().getName();
                System.out.println(book.toString() + ", Author= " + authorName + ", Editorial= " + editorialName);
            }
            return books;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Collection<Book> findByEditorialName() throws Exception{
        System.out.println("Please enter the editorial name");
        String editorialName=scan.nextLine();
        try {
            if(editorialName==null||editorialName.trim().isEmpty()){
                throw new Exception("You must enter an editorial name");
            }
            Collection<Book>books=dao.findByEditorialName(editorialName);
            for (Book book : books) {
                String authorName = book.getAuthor().getName();
                System.out.println(book.toString() + ", Author= " + authorName + ", Editorial= " + editorialName);
            }
            return books;
        } catch (Exception e) {
            throw e;
        }
    }

    }
