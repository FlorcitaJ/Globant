/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author flopy
 */
public class Lavadora extends Electrodomestico {
    private Double carga;

    public Lavadora() {
    }

    public Lavadora(Double carga, Double precio, String color, String consumoEnergetico, Double peso) {
        super(precio,color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Double getCarga() {
        return carga;
    }

    public void setCarga(Double carga) {
        this.carga = carga;
    }
    
    public void crearLavadora(){
        System.out.println("Datos de la lavadora:");
        super.crearElectrodomestico();
        System.out.println("Ingrese la capacidad de carga");
        this.carga=leer.nextDouble();
    }

    @Override
    public Double precioFinal(String consumo, Double peso) {
        Double precioFinal;
        precioFinal=super.precioFinal(consumo, peso);
        if(this.carga>30){
            precioFinal+=500;
        }
        System.out.println("El precio final es:$"+precioFinal);
        return precioFinal;
    }

    @Override
    public String toString() {
        return super.toString()+", carga= "+carga+"}";
    }
    
}
