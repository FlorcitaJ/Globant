/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Libro",schema="Libreria")
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long isbn;
    @Column(name="Titulo")
    private String title;
    @Column(name="Año")
    private Integer year;
    @Column(name="Ejemplares")
    private Integer copies;
    @Column(name="Ejemplares Prestados")
    private Integer borrowedCopies;
    @Column(name="Ejemplares restantes")
    private Integer remainingCopies;
    @Column(name="Alta")
    private boolean discharge;
    @JoinColumn(name="Autor")
    @OneToOne
    private Author author;
    @OneToOne
    @JoinColumn(name="Editorial")
    private Editorial editorial;

    public Book() {
    }

    public Book(String title, Integer year, Integer copies, Integer borrowedCopies, Integer remainingCopies, boolean discharge, Author author, Editorial editorial) {
        this.title = title;
        this.year = year;
        this.copies = copies;
        this.borrowedCopies = borrowedCopies;
        this.remainingCopies = remainingCopies;
        this.discharge = discharge;
        this.author = author;
        this.editorial = editorial;
    }
    
    public Long getisbn() {
        return isbn;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getCopies() {
        return copies;
    }

    public void setCopies(Integer copies) {
        this.copies = copies;
    }

    public Integer getBorrowedCopies() {
        return borrowedCopies;
    }

    public void setBorrowedCopies(Integer borrowedCopies) {
        this.borrowedCopies = borrowedCopies;
    }

    public Integer getRemainingCopies() {
        return remainingCopies;
    }

    public void setRemainingCopies(Integer remainingCopies) {
        this.remainingCopies = remainingCopies;
    }

    public boolean isDischarge() {
        return discharge;
    }

    public void setDischarge(boolean discharge) {
        this.discharge = discharge;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Isbn=" + isbn + ", Title=" + title + ", Year=" + year + ", Copies=" + copies + ", Borrowed Copies=" + borrowedCopies + ", Remaining Copies=" + remainingCopies;
    }
    
    
}
