/*
Luego, las operaciones que se podrán realizar son las siguientes:
 Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
 Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
 Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
 Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
posibles soluciones.
 Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
Es en el caso en que se tenga una única solución posible.
 Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.

Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
delante de -b
 */
package Servicio;

import Entidad.Raices;
import java.util.Arrays;
import java.util.Scanner;

public class RaicesService {
    Scanner leer=new Scanner(System.in);
    Raices r=new Raices();
    
    public Raices crearRaices(){
        System.out.println("Ingrese el valor de a");
        r.setA(leer.nextInt());
        System.out.println("Ingrese el valor de b");
        r.setB(leer.nextInt());
        System.out.println("Ingrese el valor de c");
        r.setC(leer.nextInt());
        
        return r;
    }
    
    public double getDiscriminante(){
        double discriminante=Math.pow(r.getB(), 2)-4*r.getA()*r.getC();
        r.setDiscriminante(discriminante);
        return discriminante;
    }
    
    public boolean tieneRaices(){
        boolean rta=false;
        if(r.getDiscriminante()>=0){
            rta=true;
        }
        return rta;
    }
    
    public boolean tieneRaiz(){
        boolean rta=false;
        if (r.getDiscriminante()==0) {
            rta=true;
        }
        return rta;
    }
    
    public double[] obtenerRaices(){
        double[] soluciones = new double[2];
        if(tieneRaices()){
        double sol1=(-r.getB()+Math.sqrt(r.getDiscriminante()))/(2*r.getA());
        double sol2=(-r.getB()-Math.sqrt(r.getDiscriminante()))/(2*r.getA());
        soluciones[0]=sol1;
        soluciones[1]=sol2;
        }
        return soluciones;
    }
    
    public double obtenerRaiz(){
        double sol=0;
        if(tieneRaiz()){
            sol=(-r.getB()+Math.sqrt(r.getDiscriminante()))/(2*r.getA());
        }
        return sol;
    }
    
    public void calcular(){
        if(tieneRaices()){
            System.out.println("Soluciones: "+Arrays.toString(obtenerRaices()));
        }else if(tieneRaiz()){
            System.out.println("Solución: "+obtenerRaiz());
        }else{
            System.out.println("La ecuación no tiene solución en el plano de los reales");
        }
    }
}
