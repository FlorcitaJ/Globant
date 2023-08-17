/*
Se está realizando una calculadora grafica, y se requiere calcular algunas áreas y perímetros de unas figuras
geométricas. Las figuras son las siguientes:
Cuadrado
Rectángulo
Triangulo
Circulo
Hexágono
Pentágono
Rombo
El usuario debe elegir la figura geométrica, luego debe ingresar el/los dato/s de la figura geométrica elegida y le debe
mostrar por pantalla el área y el perímetro.
Aclaración: Si el usuario elige una figura, se debe crear un objeto de esa figura seleccionada, y realizar los cálculos
para luego mostrar en pantalla
 */
package Entidad;


public class Figura {
    private int qlados;
    private String tipo;
    private double area;
    private double perimetro;

    public Figura() {
    }

    public Figura(int qlados, String tipo, double area, double perimetro) {
        this.qlados = qlados;
        this.tipo = tipo;
        this.area = area;
        this.perimetro = perimetro;
    }

    public int getQlados() {
        return qlados;
    }

    public void setQlados(int qlados) {
        this.qlados = qlados;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public String toString() {
        return "Figura{" + "qlados=" + qlados + ", tipo=" + tipo + ", area=" + area + ", perimetro=" + perimetro + '}';
    }
   
}
