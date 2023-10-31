/*
Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
package ej4;

import Entidad.Circulo;
import Entidad.Rectangulo;

public class Ej4 {

    public static void main(String[] args) {
        Circulo c=new Circulo(1.5d);
        Rectangulo r=new Rectangulo(6d, 2.5d);
        
        System.out.println("El area del "+c+" es: "+c.calcularArea()+", y su perimetro es: "+c.calcularPerimetro());
        System.out.println("El area del "+r+" es: "+r.calcularArea()+", y su perimetro es: "+r.calcularPerimetro());
    }
    
}
