package Entidades;

/**
 * Realizar una clase llamada CuentaBancaria en el paquete Entidades.
 *
 */
public class CuentaBancaria {

    //con los siguientes atributos: numeroCuenta(entero), dniCliente(entero largo), saldoActual
    private String nombre;
    private String apellido;
    private int numeroCuenta;
    private double saldoActual;
    private long dniCliente;

    // Agregar constructor vacío
    public CuentaBancaria() {
    }

    //Constructor con parámetros
    public CuentaBancaria(String nombre, String apellido, int numeroCuenta, int saldoActual, long dniCliente) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroCuenta = numeroCuenta;
        this.saldoActual = saldoActual;
        this.dniCliente = dniCliente;
    }

    //Metodos getters y setters.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

}
