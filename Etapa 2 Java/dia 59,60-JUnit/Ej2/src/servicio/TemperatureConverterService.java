/*
Crea una clase TemperatureConverter que convierta entre diferentes unidades de temperatura
(por ejemplo, Celsius, Fahrenheit, Kelvin).
Escribe pruebas unitarias para asegurarte de que la conversión entre las diferentes unidades
se realiza correctamente y produce los resultados esperados.
 */
package servicio;

import Entidad.TemperatureConverter;
import java.util.Scanner;

public class TemperatureConverterService {
    Scanner leer=new Scanner(System.in);
    TemperatureConverter tc=new TemperatureConverter();
    
    public TemperatureConverter crearTemperatura(){
        System.out.println("Ingrese los grados que quiere convertir");
        tc.setGrados(leer.nextDouble());
        return tc;
    }
    
    
}
