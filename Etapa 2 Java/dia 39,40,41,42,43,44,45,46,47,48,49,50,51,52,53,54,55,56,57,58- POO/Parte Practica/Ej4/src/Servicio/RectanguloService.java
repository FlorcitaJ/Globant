/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package Servicio;


import Entidad.Rectangulo;
import java.util.Scanner;


public class RectanguloService {
    public Rectangulo crearRectangulo(){
        Rectangulo r1=new Rectangulo();
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la base del rectángulo");
        r1.setBase(leer.nextDouble());
        System.out.println("Ingrese la altura del rectángulo");
        r1.setAltura(leer.nextDouble());
        return r1;
    }
    
    public double calcularSuperficie(double base,double altura){
        double superficie=base*altura;
        return superficie;
    }
    
    public double calcularPerimetro(double base, double altura){
        double perimetro=(base+altura)*2;
        return perimetro;
    }
    
    /**
     *metodo para dibujar el rectangulo con asteriscos segun las dimensiones pasadas
     * @param base
     * @param altura
     */
    public void dibujarRectangulo(double base,double altura){
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if(i==0||j==0||i==altura-1||j==base-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }   
            }
            System.out.println("");
        }
    }
}
