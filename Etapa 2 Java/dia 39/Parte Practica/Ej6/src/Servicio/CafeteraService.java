/*
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package Servicio;


import Entidad.Cafetera;
import java.util.Scanner;


public class CafeteraService {
    Scanner leer=new Scanner(System.in);
    Cafetera c=new Cafetera();
    public Cafetera crearCafetera(){
        System.out.println("Ingrese la capacidad máxima de la cafetera en Litros");
        c.setCapacidadMaxima(leer.nextInt());
        System.out.println("Ingrese la cantidad actual de café que posee la cafetera(en Litros)");
        c.setCantidadActual(leer.nextInt());
        return c;
    }
    
    public void llenarCafetera(){
      int cantidadActual;
      int capacidadMaxima=c.getCapacidadMaxima();
      cantidadActual=capacidadMaxima;
      c.setCantidadActual(cantidadActual);
    }
    
    public void servirTaza(){
        System.out.println("Ingrese el tamaño de la taza (en deciLitros)");
        int tamaño=leer.nextInt();
        int cantidadActual=c.getCantidadActual();
        if(cantidadActual<tamaño){
            System.out.println("La taza no está llena, solo se sirvieron"+cantidadActual);
            cantidadActual=0;
        }else{
            System.out.println("La taza está llena");
            cantidadActual-=tamaño;
        }
        c.setCantidadActual(cantidadActual);
    }
    
    public void vaciarCafetera(){
        int cantidadActual=0;
        c.setCantidadActual(cantidadActual);
    }
    
    public void agregarCafe(){
        System.out.println("Introduzca la cantidad de café que desea agregar");
        int cantidadCafe=leer.nextInt();
        int restante=c.getCapacidadMaxima()-c.getCantidadActual();
            
        while (cantidadCafe>restante) {
            System.out.println("La cantidad que desea agregar excede de la capacidad máxima, ingrese una cantidad menor a "+restante);
            cantidadCafe=leer.nextInt();
        }
        int cantidadActual=c.getCantidadActual();
        cantidadActual+=cantidadCafe;
        c.setCantidadActual(cantidadActual);
    }
}
