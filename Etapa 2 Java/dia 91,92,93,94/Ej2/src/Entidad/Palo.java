/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
 */
package Entidad;

import java.util.ArrayList;

public class Palo {
    ArrayList<String>palos;

    public Palo() {
    }

    public Palo(ArrayList<String> palos) {
        this.palos = palos;
    }

    public ArrayList<String> getPalos() {
        return palos;
    }

    public void setPalos(ArrayList<String> palos) {
        this.palos = palos;
    }
   
}
