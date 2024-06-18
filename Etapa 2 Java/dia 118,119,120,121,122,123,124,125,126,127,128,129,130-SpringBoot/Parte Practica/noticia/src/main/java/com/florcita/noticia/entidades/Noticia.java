
package com.florcita.noticia.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Noticia {
    @Id
    @GeneratedValue(generator = "uuid")
    private String id;
    private String titulo;
    private String cuerpo;

    
}
