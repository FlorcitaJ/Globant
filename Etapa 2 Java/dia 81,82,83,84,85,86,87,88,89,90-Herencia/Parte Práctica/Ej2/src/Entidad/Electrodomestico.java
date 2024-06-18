/*
Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.

• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:
 */
package Entidad;

import java.util.Scanner;

public class Electrodomestico {
    protected Double precio;
    protected String color;
    protected String consumoEnergetico;
    protected Double peso;
    protected Scanner leer=new Scanner(System.in);

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, String consumoEnergetico, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    
    private void comprobarConsumoEnergetico(String letra){
        String[]letras={"A","B","C","D","E","F"};
        for (String let : letras) {
            if(let.equalsIgnoreCase(letra)){
                this.consumoEnergetico=letra;
                break;
            }else{
                this.consumoEnergetico="F";
            }
        }
    }
    
    private void comprobarColor(String color){
        String[] colores={"Blanco","Negro","Rojo","Azul","Gris"};
        for (String col : colores) {
            if(col.equalsIgnoreCase(color)){
                this.color=color;
                break;
            }else{
                this.color="Blanco";
            }
        }
    }
    
    public void crearElectrodomestico(){
        this.precio=1000d;
        System.out.println("Ingrese el color del electrodomestico");
        String color=leer.nextLine();
        comprobarColor(color);
        System.out.println("Ingrese el consumo energético del electrodomestico(De la A a la F)");
        String letra=leer.nextLine();
        comprobarConsumoEnergetico(letra);
        System.out.println("Ingrese el peso del electrodomestico");
        this.peso=leer.nextDouble();
    }
    
    public Double precioFinal(String consumo,Double peso){
        consumo=consumo.toUpperCase();
        Double precioFinal=this.precio;
        switch(consumo){
            case "A":
                if(peso>0 && peso<20){
                    precioFinal+=1100d;
                }else if(peso>19 && peso<50){
                    precioFinal+=1500d;
                }else if(peso>49 && peso<80){
                    precioFinal+=1800d;
                }else{
                    precioFinal+=2000d;
                }
                break;
            case "B":
                if(peso>0 && peso<20){
                    precioFinal+=900d;
                }else if(peso>19 && peso<50){
                    precioFinal+=1300d;
                }else if(peso>49 && peso<80){
                    precioFinal+=1600d;
                }else{
                    precioFinal+=1800d;
                }
                break;
            case "C":
                if(peso>0 && peso<20){
                    precioFinal+=700d;
                }else if(peso>19 && peso<50){
                    precioFinal+=1100d;
                }else if(peso>49 && peso<80){
                    precioFinal+=1400d;
                }else{
                    precioFinal+=1600d;
                }
                break;
            case "D":
                if(peso>0 && peso<20){
                    precioFinal+=600d;
                }else if(peso>19 && peso<50){
                    precioFinal+=1000d;
                }else if(peso>49 && peso<80){
                    precioFinal+=1300d;
                }else{
                    precioFinal+=1500d;
                }
                break;
            case "E":
                if(peso>0 && peso<20){
                    precioFinal+=400d;
                }else if(peso>19 && peso<50){
                    precioFinal+=800d;
                }else if(peso>49 && peso<80){
                    precioFinal+=1100d;
                }else{
                    precioFinal+=1300d;
                }
                break;
            case "F":
                if(peso>0 && peso<20){
                    precioFinal+=200d;
                }else if(peso>19 && peso<50){
                    precioFinal+=600d;
                }else if(peso>49 && peso<80){
                    precioFinal+=900d;
                }else{
                    precioFinal+=1100d;
                }
                break;
        }
        return precioFinal;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso;
    }
    
    
}
