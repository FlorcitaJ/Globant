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
package Entidad;

public class Revolver {
    private int posicionActual;
    private int posicionDelAgua;

    public Revolver() {
    }

    public Revolver(int posicionActual, int posicionDelAgua) {
        this.posicionActual = posicionActual;
        this.posicionDelAgua = posicionDelAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionDelAgua() {
        return posicionDelAgua;
    }

    public void setPosicionDelAgua(int posicionDelAgua) {
        this.posicionDelAgua = posicionDelAgua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionDelAgua=" + posicionDelAgua + '}';
    }
    
    
}
