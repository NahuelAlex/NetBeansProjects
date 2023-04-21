package ejercicio3poo;

import java.util.Scanner;

/**
 * Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. A continuación, se
 * deben crear los siguientes métodos: a) Método constructor con todos los atributos pasados por parámetro. b)
 * Método constructor sin los atributos pasados por parámetro. c) Métodos get y set. d) Método para
 * crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto. e)
 * Método sumar(): calcular la suma de los números y devolver el resultado al main. f) Método restar():
 * calcular la resta de los números y devolver el resultado al main g) Método multiplicar(): primero valida
 * que no se haga una multiplicación por cero, si fuera a multiplicar por cero, el método devuelve 0 y se le
 * informa al usuario el error. Si no, se hace la multiplicación y se devuelve el resultado al main h) Método
 * dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, el
 * método devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se hace la división
 * y se devuelve el resultado al main.
 *
 * @author alexi
 */
public class Operacion {

    private double numero1;
    private double numero2;

    public Operacion() {
    }

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        this.numero1 = leer.nextDouble();
        System.out.println("Ingrese el segundo numero");
        this.numero2 = leer.nextDouble();
    }

    public void sumar() {
        double suma = numero1 + numero2;
        System.out.println("La suma de los numeros ingresados es. " + suma);
    }

    public void restar() {
        double resta = numero1 - numero2;
        System.out.println("La resta de los numeros ingresados es: " + resta);
    }

    public void multiplicar() {
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("Estas tratando de multiplicar por 0");
        } else {
            double multiplicar = numero1 * numero2;
            System.out.println("La multiplicacion de los numeros ingresados es: " + multiplicar);
        }

    }

    public void dividir() {
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("Estas tratando de dividir por 0 no seas imbecil!!!");
        } else {
            double divicion = numero1 / numero2;
            System.out.println("La divición de los numeros ingresados es: " + divicion);
        }

    }
}
