package condicionalesdia4;

import java.util.Scanner;

/**
 *
 * @author alexi
 */
public class EjercicioExtrabis {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números a ingresar");
        int n=leer.nextInt();
        double min=999,max=0;
        double promedio=0;
        int i=0;
        while (i<n) {
            System.out.println("Ingrese un número");
            double num=leer.nextDouble();
            if (min>=num) {
                min=num;
            }
            if (max<=num) {
                max=num;
            }
            promedio=promedio+num;
            i++;
        }
        System.out.println("El número más chico es: "+min);
        System.out.println("El número más grande es: "+max);
        System.out.println("El promedio es: "+promedio/n); 
    }
    
}
