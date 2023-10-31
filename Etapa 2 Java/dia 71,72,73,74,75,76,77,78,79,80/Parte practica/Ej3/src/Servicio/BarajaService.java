/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 */
package Servicio;

import Entidad.Baraja;
import Entidad.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BarajaService {
    Scanner leer=new Scanner(System.in);
    Baraja b=new Baraja();
    ArrayList<Carta>baraja;
    ArrayList<Carta>baraja2;
    
    public Baraja crearBaraja(Carta c){
        baraja=new ArrayList(c.getCartas());
        baraja2=new ArrayList(c.getCartas());
        b.setBaraja(baraja);
        b.setBarajaDisponible(baraja2);
        b.setCartaActual(0);
        return b;        
    }
    
    public Baraja barajar(){
        System.out.println(baraja.toString());
        Collections.shuffle(baraja);
        b.setBaraja(baraja);
        System.out.println(baraja.toString());
        return b;
    }
    
    public void siguienteCarta(){
        int cartaActual=b.getCartaActual();
        if(cartaActual<baraja.size()){
            b.setCartaActual(cartaActual);
            System.out.println(baraja.get(cartaActual).toString());
            cartaActual+=1;
            b.setCartaActual(cartaActual);
        }else{
            System.out.println("No hay mas cartas");
        }
    }
    
    public void cartasDisponibles(){
        System.out.println("Quedan "+b.getBarajaDisponible().size()+" cartas disponibles");
    }
    
    public void darCartas(){
        System.out.println("Cuantas cartas desea?");
        int cantidad=leer.nextInt();
        if(cantidad<=b.getBarajaDisponible().size()){
            for (int i = 0; i < cantidad; i++) {
                System.out.println(b.getBarajaDisponible().get(0));
                b.getBarajaDisponible().remove(0);
            }
        }else{
            System.out.println("La cantidad de cartas que pide excede a la cantidad de cartas disponibles");
        }
    }
    
    public void cartasMonton(){
        if(b.getBarajaDisponible().size()!=40){
            ArrayList<Carta>cartasDisponibles=new ArrayList(b.getBarajaDisponible());
            ArrayList<Carta>monton=new ArrayList(b.getBaraja());
            for (Carta carta:cartasDisponibles) {
                monton.remove(carta);
            }
            monton.forEach(carta->{
                System.out.println(carta.toString());
            });
        }else{
            System.out.println("No se repartió ninguna carta");
        }
    }
    
    public void mostrarBaraja(){
        if (b.getBarajaDisponible().size() == 0) {
            System.out.println("No hay cartas disponibles");
        } else {
            for (int i = 0; i < b.getBarajaDisponible().size(); i++) {
                System.out.println(b.getBarajaDisponible().get(i).toString());
            }
        }
    }
    
    public void menu(){
        int op;   
        do {
            System.out.println("Opciones del menú:");
            System.out.println("1- Barajar");
            System.out.println("2- Siguiente Carta");
            System.out.println("3- Cantidad de cartas Disponibles");
            System.out.println("4- Dar cartas");
            System.out.println("5- Mostrar cartas descartadas");
            System.out.println("6- Mostrar cartas disponibles");
            System.out.println("7- Salir");
            System.out.println("Ingrese una opción:");
            op = leer.nextInt();
            while (op < 1 && op > 7) {
                System.out.println("Opción inválida, ingrese una opción válida");
                op = leer.nextInt();
            }
            switch (op) {
                case 1:
                    barajar();
                    System.out.println("----------------------------------------");
                    break;
                case 2:
                    siguienteCarta();
                    System.out.println("----------------------------------------");
                    break;
                case 3:
                    cartasDisponibles();
                    System.out.println("----------------------------------------");
                    break;
                case 4:
                    darCartas();
                    System.out.println("----------------------------------------");
                    break;
                case 5:
                    cartasMonton();
                    System.out.println("----------------------------------------");
                    break;
                case 6:
                    mostrarBaraja();
                    System.out.println("----------------------------------------");
                    break;
            }
        } while (op != 7);
    }
    
}
