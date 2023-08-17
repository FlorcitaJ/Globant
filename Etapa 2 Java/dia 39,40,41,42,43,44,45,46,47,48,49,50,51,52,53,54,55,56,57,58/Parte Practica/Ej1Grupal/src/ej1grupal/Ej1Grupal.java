/*
Crear una clase "Vehículo" con atributos como "marca"
"modelo"
"año" y "tipo" (En tipo, vamos a indicar si es un
automóvil, una motocicleta, o una bicicleta). El vehículo debe tener los métodos de moverse y frenar:
Referencias:
-
Una vez realizado el programa, crear 3 vehículos diferentes (entre todos elegir que tipo de vehículo es), y mostrar por
pantalla cuanto avanzan si se mueve durante 5 segundos, durante 10 segundos y durante 1 minuto. Luego mostrar que
vehículo logró llegar más lejos luego de frenar, tras avanzar durante 5 minutos, y cual fue la cantidad de metros que
avanzó
 */
package ej1grupal;

import Entidad.Vehiculo;
import Servicio.VehiculoService;

public class Ej1Grupal {

   
    public static void main(String[] args) {
        VehiculoService vs=new VehiculoService();
        Vehiculo v=vs.crearVehiculo();
        System.out.println("----------------------");
        Vehiculo v1=vs.crearVehiculo();
        System.out.println("----------------------");
        Vehiculo v2=vs.crearVehiculo();
        System.out.println("----------------------");
        System.out.println(vs.moverse(v));
        System.out.println("----------------------");
        System.out.println(vs.moverse(v1));
        System.out.println("----------------------");
        System.out.println(vs.moverse(v2));
        System.out.println("----------------------");
        System.out.println(vs.moverse(v));
        System.out.println("----------------------");
        System.out.println(vs.frenar(v));
        System.out.println("----------------------");
        System.out.println(vs.moverse(v1));
        System.out.println("----------------------");
        System.out.println(vs.frenar(v1));
        System.out.println("----------------------");
        System.out.println(vs.moverse(v2));
        System.out.println("----------------------");
        System.out.println(vs.frenar(v2));
        System.out.println("----------------------");
        vs.comparar(v, v1, v2);
        
        
    }
    
}
