package ejercicio1serviciospoo;

import Entidades.CuentaBancaria;
import Servicio.CuentaBancariaServicio;
import java.util.Scanner;

/*
 * Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes atributos:
 * numeroCuenta(entero), dniCliente(entero largo), saldoActual. Agregar constructor vacío, con
 * parámetros, getters y setters. Agregar la clase CuentaBancariaServicio en el paquete Servicios
 * que contenga: a) Método para crear cuenta pidiéndole los datos al usuario. b) Método
 * ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual. c)
 * Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual.
 * Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar
 * la cuenta en 0. d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar
 * que el usuario no saque más del 20%. e) Método consultarSaldo: permitirá consultar el saldo
 * disponible en la cuenta. f) Método consultarDatos: permitirá mostrar todos los datos de la
 * cuenta. 2
 *
 * @author alexi
 */
public class Ejercicio1ServiciosPOO {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CuentaBancariaServicio cbs = new CuentaBancariaServicio();
        CuentaBancaria cuenta1 = new CuentaBancaria();
        int opcion = 0;
        while (opcion != 7) {
            System.out.println("Seleccione una opción:");
            System.out.println("1: Crear cuenta");
            System.out.println("2: Ingresar");
            System.out.println("3: Retirar");
            System.out.println("4: Extracción rapida");
            System.out.println("5: Consultar saldo");
            System.out.println("6: Consultar datos");
            System.out.println("7: Salir");
            opcion = leer.nextInt();
            
            switch (opcion){
                case 1:
                    cbs.crearCuenta();
                    break;
                case 2:
                    System.out.println("Ingrese el monto a ingresar");
                    double montoIngreso=leer.nextDouble();
                    cbs.ingresarSaldo(cuenta1, montoIngreso);
                    break;
                case 3:
                    System.out.println("Ingrese el monto a retirar");
                    double montoRetiro=leer.nextDouble();
                    cbs.retirar(cuenta1, montoRetiro);
                    break;
                case 4:
                    cbs.extraccionRapida(cuenta1);
                    break;
                case 5:
                    cbs.consultarSaldo(cuenta1);
                    break;
                case 6:
                    cbs.consultarDatos(cuenta1);
                    break;
                case 7:
                    System.out.println("Gracias por utilizar nuestro servicio");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }

}
