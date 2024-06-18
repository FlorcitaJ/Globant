/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la
cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes métodos
con los parámetros que sean necesarios:
 */
package Entidad;

import java.util.Arrays;

public class Ahorcado {
    private String[] palabra;
    private int cantidadDeLetrasEncontradas;
    private int cantidadDeJugadasMaxima;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int cantidadDeLetrasEncontradas, int cantidadDeJugadasMaxima) {
        this.palabra = palabra;
        this.cantidadDeLetrasEncontradas = cantidadDeLetrasEncontradas;
        this.cantidadDeJugadasMaxima = cantidadDeJugadasMaxima;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getCantidadDeLetrasEncontradas() {
        return cantidadDeLetrasEncontradas;
    }

    public void setCantidadDeLetrasEncontradas(int cantidadDeLetrasEncontradas) {
        this.cantidadDeLetrasEncontradas = cantidadDeLetrasEncontradas;
    }

    public int getCantidadDeJugadasMaxima() {
        return cantidadDeJugadasMaxima;
    }

    public void setCantidadDeJugadasMaxima(int cantidadDeJugadasMaxima) {
        this.cantidadDeJugadasMaxima = cantidadDeJugadasMaxima;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + Arrays.toString(palabra) + ", cantidadDeLetrasEncontradas=" + cantidadDeLetrasEncontradas + ", cantidadDeJugadasMaxima=" + cantidadDeJugadasMaxima + '}';
    }
    
    
}
