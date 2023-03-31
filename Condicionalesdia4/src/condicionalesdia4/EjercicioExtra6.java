package condicionalesdia4;

import java.util.Scanner;

/**
 *Leer la altura de N personas y determinar el promedio de estaturas que
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
general.
 * @author alexi
 */
public class EjercicioExtra6 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cantidad de personas");
        int cantidad=leer.nextInt();
        double total=0, totalPetisos=0;
        int cantidadPetisos=0;   
       for (int i = 1; i<=cantidad; i ++) {
           System.out.println("Ingrse la altura de la persona : " + i);
           double altura=leer.nextDouble();
           total = total + altura;
           if (altura<=1.60){
             totalPetisos=totalPetisos+altura;
             cantidadPetisos=cantidadPetisos+1;
           }
       }
        System.out.println("El promedio en general es de: " + total/cantidad);
        System.out.println("El promedio por debajo de 1.60 es de: " + totalPetisos/cantidadPetisos);
    }
    
}
