/*
 Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
máximas, el valor que ingresó el usuario y encontradas en 0.
 Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
 Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
 Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
 Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
 Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.

Un ejemplo de salida puede ser así:

Ingrese una letra:
a
Longitud de la palabra: 6
Mensaje: La letra pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 4
----------------------------------------------
Ingrese una letra:
z
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 3
---------------------------------------------
Ingrese una letra:
b
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 2
----------------------------------------------
Ingrese una letra:
u
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 1
----------------------------------------------
Ingrese una letra:

q
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Mensaje: Lo sentimos, no hay más oportunidades
 */
package Servicio;

import Entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

public class AhorcadoService {
    Scanner leer=new Scanner(System.in);
    Ahorcado a=new Ahorcado();
    
    public Ahorcado crearJuego(){
        System.out.println("Ingrese la palabra a encontrar");
        String pala=leer.nextLine();
        System.out.println("Ingrese la cantidad de jugadas máximas");
        a.setCantidadDeJugadasMaxima(leer.nextInt());
        leer.nextLine();
        a.setCantidadDeLetrasEncontradas(0);
        int n=pala.length();
        String[]palabra=new String[n];
        for (int i = 0; i < n; i++) {
            palabra[i]=pala.substring(i, i+1);
        }
        a.setPalabra(palabra);
        return a;
    }
    
    public void mostrarLongitud(){
        System.out.println("Longitud de la palabra: "+a.getPalabra().length);
    }
    
    public void buscar(String letra){
        String[]palabra=a.getPalabra();
        boolean esta=false;
        for (String letraPalabra : palabra) {
            if(letraPalabra.equalsIgnoreCase(letra)){
                esta=true;
            }
        }
        if(esta){
            System.out.println("La letra se encuentra en la palabra");
        }else{
            System.out.println("La letra no se encuentra en la palabra");
        }
    }
    
    public void encontradas(String letra){
        int encontradas=a.getCantidadDeLetrasEncontradas();
        int cantidadDeJugadasMaximas=a.getCantidadDeJugadasMaxima();
        boolean estaba=false;
        String[]palabra=a.getPalabra();
        for (int i = 0; i < a.getPalabra().length; i++) {
            if (letra.equalsIgnoreCase(palabra[i])){
                encontradas+=1;
                estaba=true;
            }
        }
        if(estaba==false){
                cantidadDeJugadasMaximas-=1;
                a.setCantidadDeJugadasMaxima(cantidadDeJugadasMaximas);
            }
        a.setCantidadDeLetrasEncontradas(encontradas);
        int faltantes=palabra.length-encontradas;
        System.out.println("Cantidad de letras(encontradas,faltantes): "+encontradas+","+faltantes);
    }
    
    public void intentos(){
       int intentos=a.getCantidadDeJugadasMaxima();
       if(intentos>0){
           System.out.println("Número de intentos disponibles: "+intentos);
       }else{
           System.out.println("Mensaje: Lo sentimos, ya no quedan intentos disponibles");
       }
    }
    
    public void juego(){
        crearJuego();
        System.out.println("\n");
        System.out.println("\n");
        mostrarLongitud();
        int intentos=a.getCantidadDeJugadasMaxima();
        int encontradas=a.getCantidadDeLetrasEncontradas();
        int longitud=a.getPalabra().length;
        while (intentos>0 && encontradas<longitud) {
            System.out.println("Ingrese una letra");
            String letra=leer.nextLine();
            buscar(letra);
            encontradas(letra);
            intentos();
            intentos=a.getCantidadDeJugadasMaxima();
            encontradas=a.getCantidadDeLetrasEncontradas();
        }
        if(encontradas==longitud){
            System.out.println("Ganaste, la palabra era: "+Arrays.toString(a.getPalabra()));
        }else{
            System.out.println("No adivinaste, la palabra era: "+Arrays.toString(a.getPalabra()));
        }
    }
}
