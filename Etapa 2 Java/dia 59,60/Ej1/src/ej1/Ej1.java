/*
Calculadora de Descuentos:
Crea una clase DiscountCalculator que calcule el descuento aplicado a un producto.
Escribe pruebas unitarias para verificar que el cálculo del descuento se realiza correctamente
para diferentes escenarios (por ejemplo, descuento del 10%, descuento máximo, sin descuento, etc.).
 */
package ej1;

import Entidad.DiscountCalculator;
import Servicio.DiscountCalculatorService;

public class Ej1 {

    public static void main(String[] args) {
    DiscountCalculatorService dss=new DiscountCalculatorService();
    DiscountCalculator ds=dss.crearDescuento();
    
    dss.calcularDescuento(ds);
        System.out.println("El precio final con descuento del "+ds.getPorcentajeDescuento()+"%,es $"+dss.precioConDescuento(ds));
    }
    
}
