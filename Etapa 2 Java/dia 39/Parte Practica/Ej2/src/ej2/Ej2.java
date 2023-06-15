/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package ej2;

import Entidad.Circunferencia;
import Servicio.CircunferenciaService;


public class Ej2 {

  
    public static void main(String[] args) {
      CircunferenciaService cs=new CircunferenciaService();
      Circunferencia c1=cs.crearCircunferencia();
        System.out.println("-----------------");
        System.out.println("El area es: "+cs.area(c1.getRadio()));
        System.out.println("El perimetro es:"+cs.perimetro(c1.getRadio()));
    }
}
