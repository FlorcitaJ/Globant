/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
 */
package Entidad;

public class DivisionNumero {
    private Integer num1;
    private Integer num2;

    public DivisionNumero() {
    }

    public DivisionNumero(Integer num1, Integer num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Integer getNum1() {
        return num1;
    }

    public void setNum1(Integer num1) {
        this.num1 = num1;
    }

    public Integer getNum2() {
        return num2;
    }

    public void setNum2(Integer num2) {
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "DivisionNumero{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }
    
    public void crearDivision(Integer num1, Integer num2){
        this.num1=num1;
        this.num2=num2;
    }
    
    public double division(){
        double division=0;
        try {
             division=num1/num2;
             System.out.println(division);
        } catch (Exception e) {
            System.out.println("No se puede dividir por cero");
        }
        return division;
    }
}
