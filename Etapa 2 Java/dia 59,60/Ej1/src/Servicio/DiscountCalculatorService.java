/*
Calculadora de Descuentos:
Crea una clase DiscountCalculator que calcule el descuento aplicado a un producto.
Escribe pruebas unitarias para verificar que el cálculo del descuento se realiza correctamente
para diferentes escenarios (por ejemplo, descuento del 10%, descuento máximo, sin descuento, etc.).
 */
package Servicio;

import Entidad.DiscountCalculator;
import java.util.Scanner;

public class DiscountCalculatorService {
    Scanner leer=new Scanner(System.in);
    DiscountCalculator ds=new DiscountCalculator();
    
    public DiscountCalculator crearDescuento(){
        System.out.println("Ingrese el precio del producto");
        ds.setPrecio(leer.nextDouble());
        System.out.println("Ingrese el porcentaje de descuento para este cliente");
        ds.setPorcentajeDescuento(leer.nextDouble());
        return ds;
    }
    
    public double calcularDescuento(DiscountCalculator ds){
        double descuento=(ds.getPrecio()*ds.getPorcentajeDescuento())/100;
        return descuento;
    }
    
    public double precioConDescuento(DiscountCalculator ds){
        double precioFinal=ds.getPrecio()-calcularDescuento(ds);
        return precioFinal;
        
    }
}
