/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
 */
package ej2;

import Entidad.Palo;
import java.util.ArrayList;

public class Ej2 {

    public static void main(String[] args) {
        Palo p=new Palo();
        ArrayList<String>palos=new ArrayList();
        palos.add("Oro");
        palos.add("Espada");
        palos.add("Basto");
        palos.add("Copa");
        p.setPalos(palos);
        
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(p.getPalos().get(i));
            }
        } catch (Exception e) {
            System.out.println("El último elemento fue el anterior, ya no hay mas elementos en la lista");
        }
    }
    
}
