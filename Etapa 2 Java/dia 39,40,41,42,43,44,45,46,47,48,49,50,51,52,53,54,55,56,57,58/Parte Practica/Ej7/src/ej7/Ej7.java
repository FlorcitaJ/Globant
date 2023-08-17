/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
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
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas

cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
 */
package ej7;

import Servicio.PersonaService;
import java.util.concurrent.atomic.AtomicInteger;

public class Ej7 {

    
    public static void main(String[] args) {
        AtomicInteger contadorb = new AtomicInteger(0);
        AtomicInteger contadorid = new AtomicInteger(0);
        AtomicInteger contadors = new AtomicInteger(0);
        
        AtomicInteger contadorv = new AtomicInteger(0);
        AtomicInteger contadorf = new AtomicInteger(0);

        PersonaService ps1 = new PersonaService();
        PersonaService ps2 = new PersonaService();
        PersonaService ps3 = new PersonaService();
        PersonaService ps4 = new PersonaService();
        
        ps1.crearPersona();
        ps2.crearPersona();
        ps3.crearPersona();
        ps4.crearPersona();
        System.out.println("------------------------------------------------------------");
        System.out.println("Calculando IMC(-1 por debajo, 0 peso ideal, 1 sobrepeso");
        System.out.println(ps1.calcularIMC());
        System.out.println(ps2.calcularIMC());
        System.out.println(ps3.calcularIMC());
        System.out.println(ps4.calcularIMC());
        System.out.println("------------------------------------------------------------");
        System.out.println("Es mayor de edad?");
        System.out.println(ps1.esMayorDeEdad());
        System.out.println(ps2.esMayorDeEdad());
        System.out.println(ps3.esMayorDeEdad());
        System.out.println(ps4.esMayorDeEdad());
         System.out.println("------------------------------------------------------------");
        contadorImc(ps1,contadorb,contadorid,contadors);
        contadorImc(ps2,contadorb,contadorid,contadors);
        contadorImc(ps3,contadorb,contadorid,contadors);
        contadorImc(ps4,contadorb,contadorid,contadors);
        
        contadorMayor(ps1,contadorv,contadorf);
        contadorMayor(ps2,contadorv,contadorf);
        contadorMayor(ps3,contadorv,contadorf);
        contadorMayor(ps4,contadorv,contadorf);
        
        System.out.println("Hay "+contadorb+" personas por debajo de su peso ideal, "+contadorid+" personas en su peso ideal y "+contadors+" personas con sobrepeso");
        System.out.println("Hay "+contadorv+" personas mayores de edad y "+contadorf+"personas menores de edad");
    }
    
    public static void contadorImc(PersonaService ps, AtomicInteger contadorb, AtomicInteger contadorid, AtomicInteger contadors) {

        int caso = ps.calcularIMC();
        int contb=contadorb.get();
        int contid=contadorid.get();
        int conts=contadors.get();
        switch (caso) {
            case -1:
                contb+=1;
                contadorb.set(contb);
                break;
            case 0:
                contid+=1;
                contadorid.set(contid);
                break;
            case 1:
                conts+=1;
                contadors.set(conts);
                break;
        }
    }
    public static void contadorMayor(PersonaService ps, AtomicInteger contadorv, AtomicInteger contadorf) {
        int contV=contadorv.get();
        int contF=contadorf.get();

       if(ps.esMayorDeEdad()){
           contV+=1;
           contadorv.set(contV);
       }else{
           contF+=1;
           contadorf.set(contF);
       }
    }
    
}
