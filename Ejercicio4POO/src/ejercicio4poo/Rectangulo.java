package ejercicio4poo;

import java.util.Scanner;

/**
 *
 * @author alexi
 */
public class Rectangulo {

    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void crearRectangulo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo");
        this.base = leer.nextDouble();
        System.out.println("Ingrse la altura del rectangulo");
        this.altura = leer.nextDouble();
    }

    public void superficie() {
        double sup = base * altura;
        System.out.println("La superficie del rectangulo es: " + sup);
    }

    public void perimetro() {
        double per = (base + altura) * 2;
        System.out.println("El perimetro del rectangulo es: " + per);
    }

    public void dibujarRectangulo() {
        //primer fila
        for (int columna = 1; columna <= base; columna++) {
            System.out.print("*");
        }
        System.out.println(" ");
        // filas intermedias
        for (int fila = 1; fila <= altura - 2; fila++) {
            System.out.print("*");
            for (int columna = 1; columna <= base - 2; columna++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        //System.out.print("");
        for (int columna = 1; columna <= base; columna++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}
