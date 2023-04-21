package ejercicio2poo;

import java.util.Scanner;

public class Circunferencia {

    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public void crearCircunferencia(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio");
        this.radio = leer.nextDouble();
    }
    public void area(){
       double area = Math.PI * Math.pow(radio,2);
        System.out.println("El area de la circunferencia es: " + area);
    }
    
    public void perimetro(){
        double perimetro = 2 * Math.PI * radio;
        System.out.println("El perimetro de la circunferencia es: " + perimetro);
    }
  
}
