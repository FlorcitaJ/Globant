/*
Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
 */
package ej3;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Entidad.Televisor;
import java.util.ArrayList;

public class Ej3 {

    public static void main(String[] args) {
        ArrayList<Electrodomestico> listaElectrodomesticos = new ArrayList();

        Lavadora l1 = new Lavadora(35d, 1000d, "Blanco", "A", 70d);
        Lavadora l2 = new Lavadora(20d, 1000d, "Azul", "E", 95d);
        Televisor t1 = new Televisor(43.5f, true, 1000d, "Negro", "A", 15d);
        Televisor t2 = new Televisor(55.4f, false, 1000d, "Gris", "C", 10d);
        listaElectrodomesticos.add(l1);
        listaElectrodomesticos.add(l2);
        listaElectrodomesticos.add(t1);
        listaElectrodomesticos.add(t2);

        Double sumaLavadoras = 0d;
        Double sumaTelevisores = 0d;
        Double sumatotal = 0d;
        
        for (Electrodomestico electrodomestico : listaElectrodomesticos) {
            Double precio;
            
            if (electrodomestico instanceof Lavadora) {
                Lavadora object = (Lavadora) electrodomestico;
                System.out.print("Lavadora " + object.toString()+";");
                precio = object.precioFinal(object.getConsumoEnergetico(), object.getPeso());
                sumatotal += precio;
                sumaLavadoras += precio;
                continue;
            }
            if (electrodomestico instanceof Televisor) {
                Televisor object = (Televisor) electrodomestico;
                System.out.print("Televisor " + object.toString()+";");
                precio = object.precioFinal(object.getConsumoEnergetico(), object.getPeso());
                sumatotal += precio;
                sumaTelevisores += precio;
                
            }
            
        }
        System.out.println("La suma total de todos los electrodomesticos es:$" + sumatotal + " de los cuales $" + sumaLavadoras + " son de lavadoras y $" + sumaTelevisores + " son de televisores");
       

    }
    
}
