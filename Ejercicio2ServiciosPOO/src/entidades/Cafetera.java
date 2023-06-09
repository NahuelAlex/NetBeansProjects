package entidades;

/**
 * @author alexi Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con los
 * atributos capacidadMáxima (la cantidad máxima de café que puede contener la cafetera) y
 * cantidadActual (la cantidad actual de café que hay en la cafetera)
 */
public class Cafetera {

    private int capacidadMaxima=1000;
    private int cantidadActual;
//Agregar constructor vacío y con parámetros así como setters y getters

    public Cafetera() {
        this.capacidadMaxima=1000;//Valor por defecto
        this.cantidadActual=0;//valor por defecto
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + '}';
    }

}
