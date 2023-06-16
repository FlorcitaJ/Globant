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
package Servicio;

import Entidad.Figura;
import java.util.Scanner;


public class FiguraService {
    Scanner leer=new Scanner(System.in);
    public Figura crearFigura(){
        Figura f=new Figura();
        System.out.println("Ingrese el tipo de figura");
        f.setTipo(leer.next());
        System.out.println("Ingrese la cantidad de lados de la figura");
        f.setQlados(leer.nextInt());
        return f;  
    }
    public void calculoPerimetroyArea(Figura f){
        String tipo=f.getTipo();
        double perimetro=0;
        double area=0;
        switch(tipo){
            case "cuadrado":
                System.out.println("Ingrese el tamaño del lado");
                double lado=leer.nextDouble();
                perimetro=lado*4;
                area=lado*lado;
                break;
            case "rectangulo":
                System.out.println("Ingrese el tamaño de la base");
                double base=leer.nextDouble(); 
                System.out.println("Ingrese el tamaño de la altura");
                double altura=leer.nextDouble();
                perimetro=base*2+altura*2;
                area=base*altura;
                break;
            case "triangulo":
                System.out.println("Ingrese el tamaño del lado");
                lado=leer.nextDouble();
                System.out.println("Ingrese el tamaño del lado 2");
                double lado2=leer.nextDouble();
                System.out.println("Ingrese el tamaño de la base");
                base=leer.nextDouble(); 
                System.out.println("Ingrese el tamaño de la altura");
                altura=leer.nextDouble();
                perimetro=lado+lado2+base;
                area=(base*altura)/2;
                break;
            case "circulo":
                System.out.println("Ingrese el tamaño del radio");
                double radio=leer.nextDouble();
                perimetro=(double)(Math.PI*2*radio);
                area=(double)(Math.PI*(radio*radio));
                break;
            case "hexagono":
                System.out.println("Ingrese el tamaño de los lados");
                lado=leer.nextDouble();
                lado2=leer.nextDouble();
                double lado3=leer.nextDouble();
                double lado4=leer.nextDouble();
                double lado5=leer.nextDouble();
                double lado6=leer.nextDouble();
                System.out.println("Ingrese el tamaño de la apotema");
                double apotema=leer.nextDouble();
                perimetro=lado+lado2+lado3+lado4+lado5+lado6;
                area=(perimetro*apotema)/2;
                break;
            case "pentagono":
                System.out.println("Ingrese el tamaño de los lados");
                lado=leer.nextDouble();
                lado2=leer.nextDouble();
                lado3=leer.nextDouble();
                lado4=leer.nextDouble();
                lado5=leer.nextDouble();
                System.out.println("Ingrese el tamaño de la apotema");
                apotema=leer.nextDouble();
                perimetro=lado+lado2+lado3+lado4+lado5;
                area=(perimetro*apotema)/2;
                break;        
            case "rombo":
                System.out.println("Ingrese el tamaño de los lados");
                lado=leer.nextDouble();
                lado2=leer.nextDouble();
                lado3=leer.nextDouble();
                lado4=leer.nextDouble();
                System.out.println("Ingrese el tamaño de las diagonales");
                double diagonal=leer.nextDouble();
                double diagonal2=leer.nextDouble();
                perimetro=lado+lado2+lado3+lado4;
                area=diagonal*diagonal2;
                break;        
    }
        f.setPerimetro(perimetro);
        f.setArea(area);
    }
}
