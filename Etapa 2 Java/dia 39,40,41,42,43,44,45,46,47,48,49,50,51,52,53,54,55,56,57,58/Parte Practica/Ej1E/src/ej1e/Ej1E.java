/*
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
además definir los métodos getters y setters correspondientes.
 */
package ej1e;

import Servicio.CancionService;


public class Ej1E {

    
    public static void main(String[] args) {
        CancionService cs=new CancionService();
        cs.crearCancion();
        cs.mostrarCancion();
    }
    
}
