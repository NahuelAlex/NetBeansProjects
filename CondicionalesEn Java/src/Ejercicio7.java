
import java.util.Scanner;

/**
 *
 * @author alexi
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int tipoMotor;
    Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese un tipo de motor:");
        tipoMotor=leer.nextInt();
        
        switch (tipoMotor){
                case 1:
                    System.out.println("La bomba es una bomba de agua");
                    break;
                case 2:
                    System.out.println("La bomba es e gasolina");
                    break;
                case 3:
                    System.out.println("la bomba es de hormigon");
                    break;
                case 4:
                    System.out.println("La bomba es de pasta alimenticia");
                 break;
                 
                default:
                         System.out.println("No existe un valor valido para el tipo de bomba");
        
        
        }
    }
    
}
