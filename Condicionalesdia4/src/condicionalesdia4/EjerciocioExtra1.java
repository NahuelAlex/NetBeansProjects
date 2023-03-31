package condicionalesdia4;

import java.util.Scanner;

/**
 *Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.
 * @author alexi
 */
public class EjerciocioExtra1 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de minutos que desea convertir");
        int min;
        min = leer.nextInt();
        int horas = min/60;
        int dias = horas/24;
        horas=horas/24;
        System.out.println("Los "+min+" minutos ingresados equivalen a " + dias+" dias"+ " y "+horas+" horas." );
    }
    
    
}
