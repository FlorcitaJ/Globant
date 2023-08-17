/*
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package ej2;

import Entidad.Equipo;
import Entidad.Jugador;
import java.util.ArrayList;

public class Ej2 {

    public static void main(String[] args) {
        Jugador j1=new Jugador("Pablo", "Veggeti", "Delantero", 10);
        Jugador j2=new Jugador("Cutti", "Romero", "Defensor", 4);
        
        ArrayList<Jugador> jugadores=new ArrayList();
        
        jugadores.add(j1);
        jugadores.add(j2);
        
        Equipo equipo=new Equipo();
        equipo.setJugadores(jugadores);
        
        equipo.getJugadores().forEach(jugador->{
            System.out.println(jugador);
        });
    }
    
}
