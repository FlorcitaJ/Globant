/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:

a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package ej9;

import Servicio.MatematicaService;


public class Ej9 {

    public static void main(String[] args) {
        MatematicaService ms=new MatematicaService();
        ms.crearMatematica();
        ms.mostrarValores();
        System.out.println("El mayor número es: "+ms.devolverMayor());
        System.out.println("La potencia del mayor valor elevado al menor es: "+ms.calcularPotencia());
        System.out.println("La raíz cuadrada del menor valor es: "+ms.calcularRaiz());
    }
    
}
