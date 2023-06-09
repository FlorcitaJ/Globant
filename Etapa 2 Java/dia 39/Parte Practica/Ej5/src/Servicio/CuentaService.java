/*
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package Servicio;

import Entidad.Cuenta;
import java.util.Scanner;

public class CuentaService {
    Scanner leer=new Scanner(System.in);
    public Cuenta crearCuenta(){
        Cuenta c=new Cuenta();
        System.out.println("Ingrese el número de cuenta");
        c.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese el DNI");
        c.setDNI(leer.nextLong());
        System.out.println("Ingrese su saldo actual");
        c.setSaldoActual(leer.nextInt());
        return c;
    }
    public double ingresar(Cuenta c){
        int saldoActual=c.getSaldoActual();
        System.out.println("¿Cuánto dinero desea ingresar?");
        double ingreso=leer.nextDouble();
        saldoActual+=ingreso;
        c.setSaldoActual(saldoActual);
        return saldoActual;
    }
    public double retirar(Cuenta c){
        int saldoActual=c.getSaldoActual();
        System.out.println("Ingrese el monto a retirar");
        double retiro=leer.nextDouble();
        if(retiro>saldoActual){
            System.out.println("El monto ingresado supera la cantidad disponible, se le hará entrega de $"+saldoActual);
            saldoActual=0;
        }else {
            saldoActual-=retiro;
        }
        c.setSaldoActual(saldoActual);
        return saldoActual;
    }
    public double extraccionRapida(Cuenta c){
        int saldoActual=c.getSaldoActual();
        double monto=saldoActual*20/100;
        System.out.println("Ingrese el monto que desea retirar");
        double retiro=leer.nextDouble();
        while (retiro>monto) {            
            System.out.println("El monto ingresado es mayor a lo permitido en la extraccion rápida. Ingrese un nuevo monto, monto máximo permitido :$"+monto);
            retiro=leer.nextDouble();
        }
        saldoActual-=retiro;
        c.setSaldoActual(saldoActual);
        return saldoActual;
        }
    public void consultarSaldo(Cuenta c){
        System.out.println("Su saldo disponible es de $"+c.getSaldoActual());
    }
    public void consultrDatos(Cuenta c){
        System.out.println(c.toString());
    }
}
    
