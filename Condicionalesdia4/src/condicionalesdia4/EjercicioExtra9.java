package condicionalesdia4;

import java.util.Scanner;

/**
 *Simular la división usando solamente restas. Dados dos números enteros
mayores que uno, realizar un algoritmo que calcule el cociente y el
residuo usando sólo restas. Método: Restar el dividendo del divisor hasta
obtener un resultado menor que el divisor, este resultado es el residuo, y
el número de restas realizadas es el cociente.
 * @author alexi
 */
public class EjercicioExtra9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dividendo,divisor,cociente=0;
        System.out.println("Ingrese el dividendo");
        dividendo=leer.nextInt();
        System.out.println("Ingrese el divisor");
        divisor=leer.nextInt();
         while (dividendo>=divisor){
             
            dividendo=dividendo-divisor;
            cociente++;
            
        }
         System.out.println("El cociente es: " + cociente);
         System.out.println("El resto es: " + dividendo); 
    }
    
}
