package condicionalesdia4;

import java.util.Scanner;

/**
 * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el cuadrado tiene 4
 * elementos por lado se deberá dibujar lo siguiente:
 *
 * @author alexi
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la base del rectangulo");
        int base = leer.nextInt();
        System.out.println("Ingrese la altura del rectangulo");
        int altura = leer.nextInt();
        // primera fila
        for (int columna = 1; columna <= base; columna++) {
            System.out.print("*");
        }
        System.out.println(" ");
        // filas intermedias
        for (int fila = 1; fila <= altura - 2; fila++) {
            System.out.print("*");
            ;
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
