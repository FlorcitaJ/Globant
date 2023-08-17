/*
 Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
 */
package Servicio;

import Entidad.Puntos;
import java.util.Scanner;

public class PuntosService {
    Scanner leer=new Scanner(System.in);
    Puntos p=new Puntos();
    
    public Puntos crearPuntos(){
        System.out.println("Ingrese las coordenadas de x e y del punto 1");
        p.setX1(leer.nextInt());
        p.setY1(leer.nextInt());
        System.out.println("Ingrese las coordenadas de x e y del punto 2");
        p.setX2(leer.nextInt());
        p.setY2(leer.nextInt());
        return p;
    }
    
    public double calcularDistancia(){
        double distancia=Math.sqrt((Math.pow((p.getX2()-p.getX1()), 2))+(Math.pow((p.getY2()-p.getY1()), 2)));
        return distancia;    
    }
}
