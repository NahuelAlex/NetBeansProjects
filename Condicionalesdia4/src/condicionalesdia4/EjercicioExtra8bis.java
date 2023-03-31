package condicionalesdia4;

import java.util.Scanner;

/**
 *
 * @author alexi
 */
public class EjercicioExtra8bis {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);

        int num, cont = 0, contPares = 0, contImpares = 0;

        while (true) {
            System.out.print("Ingrese un número: ");
            num = leer.nextInt();

            if (num < 0) {
                break;
            } else if (num % 5 == 0) {
                break;
            } else {
                cont++;
                if (num % 2 == 0) {
                    contPares++;
                } else {
                    contImpares++;
                }
            }
        }

        System.out.println("Cantidad de números leídos: " + cont);
        System.out.println("Cantidad de números pares: " + contPares);
        System.out.println("Cantidad de números impares: " + contImpares);
    }
    
}
