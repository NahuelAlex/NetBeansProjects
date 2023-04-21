package Servicio;

import Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 * @author alexi Agregar la clase CuentaBancariaServicio en el paquete Servicios
 */
public class CuentaBancariaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //Método para crear cuenta pidiéndole los datos al usuario
    public CuentaBancaria crearCuenta() {

        CuentaBancaria c1 = new CuentaBancaria("","",0,10000,0);
        System.out.println("Ingrese su nombre ");
        c1.setNombre(leer.nextLine());
        System.out.println("Ingrese su apellido ");
        c1.setApellido(leer.nextLine());
        System.out.println("Ingrese su n° de DNI ");
        c1.setDniCliente(leer.nextLong());
        System.out.println("Ingrese numero cuenta ");
        c1.setNumeroCuenta(leer.nextInt());
        return c1;
    }

    /*
    Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual
     */
    public void ingresarSaldo(CuentaBancaria c1, double monto) {
        c1.setSaldoActual(c1.getSaldoActual()+monto);
        System.out.println("deposito realizado con exito "+c1.getSaldoActual()+"$");
    }

    /**
     * Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo
     * actual. Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible
     * hasta dejar la cuenta en 0
     *
     * @param c1
     * @param monto
     */
    public void retirar(CuentaBancaria c1, double monto) {
        if (c1.getSaldoActual() < monto) {
            monto = c1.getSaldoActual();
            c1.setSaldoActual(0.0);
            System.out.println("La cuenta no tiene suficiente saldo $" + monto + ".");
            System.out.println("Se ha retirado $" + monto + " de la cuenta bancaria.");
        } else {
            c1.setSaldoActual(c1.getSaldoActual() - monto);
            System.out.println("Se retiro la cantidad " + monto + " $");
                       
        }
    }

    /**
     * Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario
     * no saque más del 20%.
     *
     * @param c1
     */
    public void extraccionRapida(CuentaBancaria c1) {
        double saldoActual = c1.getSaldoActual();
        double extraccionMaxima = saldoActual * 0.2;
        System.out.println("Cuanto dinero desea retirar? importe maximo $ " + extraccionMaxima + ".");
        double cantidad = leer.nextDouble();
        c1.setSaldoActual(c1.getSaldoActual()-cantidad);
        if (cantidad > extraccionMaxima) {
            System.out.println("Elif  monto $ " + cantidad + " supera el limite " + extraccionMaxima + " $");
        }
    }
    /**
     * Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
     * @param c1
     */
    public void consultarSaldo(CuentaBancaria c1){
        System.out.println("El saldo disponible en su cuenta es $ "+c1.getSaldoActual()+".");
    }
    /**
     * consultarDatos: permitirá mostrar todos los datos de la cuenta.
     * @param c1
     */
    public void consultarDatos(CuentaBancaria c1){
        System.out.println("Numero de cuenta: " + c1.getNumeroCuenta());
        System.out.println("Su numero de dni: " + c1.getDniCliente());
        System.out.println("Su saldo actual: " + c1.getSaldoActual());
    }
}
