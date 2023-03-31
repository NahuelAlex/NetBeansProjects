
import java.util.Scanner;
/**
 *Crea una aplicación que le pida dos números al usuario y este pueda
elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
una función para cada operación matemática y deben devolver sus
resultados para imprimirlos en el main.
 * @author alexi
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        int a, b, calcular,resulatdo;
        a = leer.nextInt();
        b = leer.nextInt();
        System.out.println("1 sumar:");
        System.out.println("2 restar:");
        System.out.println("3 Multiolicar:");
        System.out.println("4 dividir:");
        System.out.println("Elija una opcion");
        calcular = leer.nextInt();
        
        switch (calcular) {
        
            case 1:
                int resultadoSuma = suma(a, b);
                System.out.println("el resultado de la suma es: " + suma(a,b));
                break;
            case 2:
                int resultadoResta = resta(a, b);
                System.out.println("El resultado de la resta es:" + resta(a,b));
                break;
            case 3:
                int resulta = multiplica(a, b);
                System.out.println("El resultado de la multiplicacion es: "+ multiplica(a,b));
                break;
            case 4:
                int result = divide(a, b);
                System.out.println("El resultado de la divicion es: "+ divide(a,b));
                break;
        }
    }
    public static int suma (int a, int b) {
        int c = a + b;
        return c;
    }
    public static int resta (int a, int b) {
        int c = a - b;
        return c;
}
    public static int multiplica (int a, int b) {
        int c = a * b;
        return c;
}
    public static int divide (int a, int b) {
        int c = a / b;
        return c;
    }
    
}
