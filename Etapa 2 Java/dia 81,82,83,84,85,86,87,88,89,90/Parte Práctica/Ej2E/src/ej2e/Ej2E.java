/*
Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.
Estos métodos serán abstractos y los implementarán las siguientes clases:
• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.

16
Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
 */
package ej2e;

import Entidad.Edificio;
import Entidad.EdificioDeOficinas;
import Entidad.Polideportivo;
import java.util.ArrayList;

public class Ej2E {

    public static void main(String[] args) {
        ArrayList<Edificio>edificios=new ArrayList();
        Polideportivo p1=new Polideportivo(9d, 2.5d , 10.2d);
        Polideportivo p2=new Polideportivo(8d, 2.7d , 27.2d);
        EdificioDeOficinas e1=new EdificioDeOficinas(9d, 2.3d, 15d);
        EdificioDeOficinas e2=new EdificioDeOficinas(10d, 2.5d, 13.2d);
        
        p1.crearEdificio();
        p2.crearEdificio();
        e1.crearEdificio();
        e2.crearEdificio();
        
        edificios.add(p1);
        edificios.add(p2);
        edificios.add(e1);
        edificios.add(e2);
        
        for (Edificio edificio : edificios) {
            edificio.calcularSuperficie();
            edificio.calcularVolumen();
        }
        
        Integer techados = 0;
        Integer abiertos = 0;
        for (Edificio edificio : edificios) {
                        if (edificio instanceof Polideportivo) {
                Polideportivo obj = (Polideportivo) edificio;
                if (obj.getTipoDeInstalacion().equalsIgnoreCase("Techado")) {
                    techados += 1;
                } else {
                    abiertos += 1;
                }
            }
            if(edificio instanceof EdificioDeOficinas){
                EdificioDeOficinas obj=(EdificioDeOficinas)edificio;
                obj.contPersonas();
            }
        }
        System.out.println("De todos los polideportivos " + techados + " son techados y " + abiertos + " son abiertos");
    }
    
}
