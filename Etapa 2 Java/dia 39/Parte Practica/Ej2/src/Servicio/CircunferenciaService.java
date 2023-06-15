/*
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package Servicio;

import Entidad.Circunferencia;
import java.util.Scanner;


public class CircunferenciaService {
    public Circunferencia crearCircunferencia(){
        Circunferencia c1=new Circunferencia();
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el radio");
        c1.setRadio(leer.nextDouble());
        return c1;  
    }
    public double area(double radio){
        double area=(Math.PI*(Math.pow(radio,2)));
        return area;
    }
    public double perimetro(double radio){
        double perimetro=2*radio*(Math.PI);
        return perimetro;
    }
}
