/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

public class Televisor extends Electrodomestico {
    private Float resolucion;
    private boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(Float resolucion, boolean sintonizadorTDT, Double precio, String color, String consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Float getResolucion() {
        return resolucion;
    }

    public void setResolucion(Float resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
    public void crearTelevisor(){
        System.out.println("Datos de la TV:");
        super.crearElectrodomestico();
        System.out.println("Ingrese la resolución de la TV");
        this.resolucion=leer.nextFloat();
        System.out.println("Cuenta con sintonizador TDT?(si/no)");
        String rta=leer.nextLine();
        while (!rta.equalsIgnoreCase("si")&& !rta.equalsIgnoreCase("no")) { 
            System.out.println("Respuesta inválida, ingrese una respuesta válida");
            rta=leer.nextLine();
        }
        this.sintonizadorTDT = rta.equalsIgnoreCase("si");
    }

    @Override
    public Double precioFinal(String consumo, Double peso) {
         Double precioFinal=super.precioFinal(consumo, peso);
         if(this.resolucion>40){
             precioFinal+=precioFinal*30/100;
         }
         if(this.sintonizadorTDT){
             precioFinal+=500;
         }
         System.out.println("El precio final es:$"+precioFinal);
         return precioFinal;
    }

    @Override
    public String toString() {
        return super.toString()+", resolucion= "+resolucion+", sintonizador TDT= "+sintonizadorTDT+"}"; 
    }
    
    
        
}
