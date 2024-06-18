/*
Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero
debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
Métodos:
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.

 */
package Servicio;

import Entidad.Jugador;
import java.util.ArrayList;
import java.util.Scanner;

public class JugadorService {
    Scanner leer=new Scanner(System.in);
    Jugador j;
    ArrayList<Jugador>jugadores=new ArrayList();
    
    public Jugador crearJugador(){
        System.out.println("Ingrese la cantidad de participantes (máximo 6 jugadores)");
        int cantidad=leer.nextInt();
        leer.nextLine();
        while (cantidad>6 || cantidad<1) {            
            System.out.println("Cantidad de participantes inválida, ingrese una cantidad válida (entre 1 y 6)");
            cantidad=leer.nextInt();
            leer.nextLine();
        }
        for (int i = 0; i < cantidad; i++) {
            j=new Jugador();
            j.setId(i+1);
            System.out.println("Ingrese el nombre del participante "+(i+1));
            j.setNombre("Jugador "+(i+1)+" "+leer.nextLine());
            jugadores.add(j);
            j.setJugadores(jugadores);
        }
        return j;
    }
    
    public boolean disparo(RevolverService rs){
        boolean respuesta=false;
        if(rs.mojar()){
            j.setMojado(true);
            respuesta=true;
        }else{
            rs.siguienteChorro();
        }
        return respuesta;
    }
}
