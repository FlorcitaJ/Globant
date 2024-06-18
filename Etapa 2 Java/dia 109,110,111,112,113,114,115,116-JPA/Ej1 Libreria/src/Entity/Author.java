
package Entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Autor",schema="Libreria")
public class Author implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="Nombre")
    private String name;
    @Column(name="Alta")
    private boolean discharge;

    public Author() {
    }

    public Author(String name, boolean discharge) {
        this.name = name;
        this.discharge = discharge;
    }
    
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDischarge() {
        return discharge;
    }

    public void setDischarge(boolean discharge) {
        this.discharge = discharge;
    }

    @Override
    public String toString() {
        return "Author{" + "id=" + id + ", name=" + name + ", discharge=" + discharge + '}';
    }

    
}
