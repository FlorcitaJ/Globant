/*
Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.

Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
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
