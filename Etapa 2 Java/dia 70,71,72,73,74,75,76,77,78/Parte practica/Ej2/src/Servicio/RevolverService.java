/*
Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
 */
package Servicio;

import Entidad.Revolver;

public class RevolverService {
    Revolver r=new Revolver();
    
    public Revolver llenarRevolver(){
        r.setPosicionActual((int)(Math.random()*(6-1+1)+1));
        r.setPosicionDelAgua((int)(Math.random()*(6-1+1)+1));
        return r;
    }
    
    public boolean mojar(){
        boolean resultado=false;
        if(r.getPosicionDelAgua()==r.getPosicionActual()){
            resultado=true;
            System.out.println("Perdiste!!");
        }else{
            System.out.println("Zafaste!!");
        }
        return resultado;
    }
    
    public void siguienteChorro(){
        int posicion=r.getPosicionActual();
        if(posicion<6){
            posicion+=1;
        }else{
            posicion=1;
        }
        r.setPosicionActual(posicion);
    }
    
    public void mostrarInfo(){
        System.out.println(r.toString());
    }
}
