/*
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.

• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package Servicio;

import Entidad.Juego;
import Entidad.Jugador;
import Entidad.Revolver;
import java.util.ArrayList;

public class JuegoService {
    Juego ju=new Juego();
    
    public Juego llenarJuego(Jugador j,Revolver r){
        ju.setJugadores(j.getJugadores());
        ju.setRevolver(r);
        return ju;
    }
    
    public void ronda(JugadorService js,RevolverService rs){
        ArrayList<Jugador>jugadores=ju.getJugadores();
        for (int i = 0; i < jugadores.size(); i++) {
            System.out.println("Turno del "+jugadores.get(i).getNombre());
            System.out.println(i);
            if(js.disparo(rs)){
               i=jugadores.size();
            }else if(i==jugadores.size()-1){
                i=-1;
            }
        }
    }
}
