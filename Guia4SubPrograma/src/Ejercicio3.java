
import java.util.Scanner;

/**
 *Crea una aplicación que a través de una función nos convierta una
cantidad de euros introducida por teclado a otra moneda, estas pueden
ser a dólares, yenes o libras. La función tendrá como parámetros, la
cantidad de euros y la moneda a convertir que será una cadena, este no
devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
i. * 0.86 libras es un 1 €
ii. * 1.28611 $ es un 1 €
iii. * 129.852 yenes es un 1 €
 * @author alexi
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        double cantidad;
        String moneda;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrasa que cantidad desea cambiar");
        cantidad=leer.nextFloat();
        System.out.println("Ingrasa que moneda desea cambiar\n-libra\n-dolar\n-yenes");
        moneda=leer.next();
        moneda=moneda.toLowerCase();
        Cambio(cantidad, moneda);
    }
    public static void Cambio(double cantidad, String moneda) {
        
        switch (moneda) {
            case "libra":
                System.out.println("Usted recibira "+(cantidad*0.86)+" libras");
                break;
            case "dolar":
                System.out.println("Usted recibira "+(cantidad* 1.28611)+" dolares");
                break;
            case "yenes":
                System.out.println("Usted recibira "+(cantidad* 129.852)+" yenes");
                break;
            default:
                System.out.println("No es una moneda de cambio");
    }
    
}
}