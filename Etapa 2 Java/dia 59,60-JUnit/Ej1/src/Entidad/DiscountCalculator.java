/*
Calculadora de Descuentos:
Crea una clase DiscountCalculator que calcule el descuento aplicado a un producto.
Escribe pruebas unitarias para verificar que el cálculo del descuento se realiza correctamente
para diferentes escenarios (por ejemplo, descuento del 10%, descuento máximo, sin descuento, etc.).
 */
package Entidad;

import Servicio.DiscountCalculatorService;

public class DiscountCalculator {
    private double precio;
    private double porcentajeDescuento;

    public DiscountCalculator() {
    }

    public DiscountCalculator(double precio, double porcentajeDescuento) {
        this.precio = precio;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public String toString() {
        return "DiscountCalculator{" + "precio=" + precio + ", porcentajeDescuento=" + porcentajeDescuento + '}';
    }
        
}
