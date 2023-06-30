/*
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.

 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

public class PersonaService {
    Persona p=new Persona();
    Scanner leer=new Scanner(System.in);
    public Persona crearPersona(){
        System.out.println("Ingrese el nombre");
        p.setNombre(leer.next());
        System.out.println("Ingrese la edad");
        p.setEdad(leer.nextInt());
        System.out.println("Ingrese el sexo(H hombre,M mujer,O otro");
        String sexo=leer.next();
        while (!sexo.equalsIgnoreCase("H")&&!sexo.equalsIgnoreCase("M")&&!sexo.equalsIgnoreCase("O")) {
            System.out.println("La información ingresada no es válida, intente nuevamente");
            sexo=leer.next();
        }
        p.setSexo(sexo);
        System.out.println("Ingrese el peso");
        p.setPeso(leer.nextDouble());
        System.out.println("Ingrese la altura");
        p.setAltura(leer.nextDouble());
        return p;
    }
    
    public int calcularIMC(){
        double peso=p.getPeso();
        double altura=p.getAltura();
        int resultado;
        double imc=peso/(double)(Math.pow(altura, 2));
        if(imc<20){
            resultado=-1;
        }else if(imc<26){
            resultado=0;
        }else{
            resultado=1;
        }
        p.setImc(resultado);
        return resultado;
    }
    
    public boolean esMayorDeEdad(){
        int edad=p.getEdad();
        boolean resultado=false;
        if(edad>18){
            resultado=true;
        }
        p.setMayor(resultado);
        return resultado;
    }
}
