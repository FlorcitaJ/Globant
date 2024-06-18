/*
Vamos a crear una interfaz con un método abstracto. Luego desde el main intentaremos instanciar
un objeto a partir de la interfaz
 */
package ej2;

import Interfaz.HotelInterfaz;

/**
 *
 * @author flopy
 */
public class Ej2 {

   
    public static void main(String[] args) {
        HotelInterfaz h=new HotelInterfaz() {
            @Override
            public void cantidadDeEstrellas() {
                System.out.println("No tengo estrellas");
            }
        };
    }
    
}
