/*
Crear una clase "Vehículo" con atributos como "marca"
"modelo"
"año" y "tipo" (En tipo, vamos a indicar si es un
automóvil, una motocicleta, o una bicicleta). El vehículo debe tener los métodos de moverse y frenar:
Referencias:

-Moverse: Es la cantidad de metros que avanzará por segundo.
Frenar: Dejará de avanzar y se frenará 2 metros más adelante. En el caso de la bicicleta, se frenará y no avanzará
más metros

Un automóvil avanza 3 metros por segundo.
Una motocicleta avanza 2 metros por segundo.
Una bicicleta avanza 1 metro por segundo

Una vez realizado el programa, crear 3 vehículos diferentes (entre todos elegir que tipo de vehículo es), y mostrar por
pantalla cuanto avanzan si se mueve durante 5 segundos, durante 10 segundos y durante 1 minuto. Luego mostrar que
vehículo logró llegar más lejos luego de frenar, tras avanzar durante 5 minutos, y cual fue la cantidad de metros que
avanzó
 */
package Servicio;

import Entidad.Vehiculo;
import java.util.Scanner;


public class VehiculoService {
    Scanner leer=new Scanner(System.in);
    public Vehiculo crearVehiculo(){
        Vehiculo v=new Vehiculo();
        System.out.println("Ingrese la marca del vehículo");
        v.setMarca(leer.next());
        System.out.println("Ingrese el modelo del vehículo");
        v.setModelo(leer.next());
        System.out.println("Ingrese el año del vehículo");
        v.setAnio(leer.nextInt());
        /*do { */           
            System.out.println("Ingrese el tipo del vehículo");
            v.setTipo(leer.next());
        /*} while (!(v.getTipo()).equalsIgnoreCase("Auto")||!(v.getTipo()).equalsIgnoreCase("Moto")||!(v.getTipo()).equalsIgnoreCase("Bici") );*/
        return v;
    }
    
    public double moverse(Vehiculo v) {
        String tipo = v.getTipo();
        double metros = 0;
        System.out.println("Ingrese el tiempo de movimiento en segundo");
        int tiempo = leer.nextInt();
        switch (tipo) {
            case "Auto":
                metros = 3 * tiempo;
                break;
            case "Moto":
                metros = 2 * tiempo;
                break;
            case "Bici":
                metros = tiempo;
                break;
        }
        v.setDistancia(v.getDistancia()+metros);
        return metros;
    }
    
    public double frenar(Vehiculo v){
        String tipo=v.getTipo();
        double distancia=v.getDistancia();
        if(tipo.equalsIgnoreCase("Auto")||tipo.equalsIgnoreCase("Moto")){
            distancia+=2;
        }
        v.setDistancia(distancia);
        return distancia;
    }
    
    public void comparar(Vehiculo v,Vehiculo v1,Vehiculo v2){
        double aux=v.getDistancia();
        if (aux<v1.getDistancia()){
            aux=v1.getDistancia();
            if(aux<v2.getDistancia()){
                System.out.println("El "+v2.toString()+" es el que recorrio la mayor distancia");
            }else{
                System.out.println("El "+v1.toString()+" es el que recorrio la mayor distancia");
            }
        }else{
            System.out.println("El "+v.toString()+" es el que recorrio la mayor distancia");
        }
    }
}
