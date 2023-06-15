/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package ej4;

import Entidad.Rectangulo;
import Servicio.RectanguloService;


public class Ej4 {

    
    public static void main(String[] args) {
        RectanguloService rs=new RectanguloService();
        Rectangulo r1=rs.crearRectangulo();
        System.out.println("La superficie del rectángulo es: "+rs.calcularSuperficie(r1.getBase(), r1.getAltura()));
        System.out.println("El perímetro del rectángulo es: "+rs.calcularPerimetro(r1.getBase(), r1.getAltura()));
        System.out.println("Vamos a dibujar el rectángulo");
        rs.dibujarRectangulo(r1.getBase(), r1.getAltura());
    }
    
}
