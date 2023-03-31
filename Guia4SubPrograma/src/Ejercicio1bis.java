
import java.util.Scanner;


/**
 *Crea una aplicación que le pida dos números al usuario y este pueda
elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
una función para cada operación matemática y deben devolver sus
resultados para imprimirlos en el main.
 * @author alexi
 */
public class Ejercicio1bis {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        int a, b, calcular,resultado;
        a = leer.nextInt();
        b = leer.nextInt();
        System.out.println("Elija una opcion:\n1 Sumar:\n2 restar:\n3 multiplicar:\n4 Dividir: " );
        calcular = leer.nextInt();       
        
       switch (calcular) {
           
           case 1:
               System.out.println("El resultado de la suma es: " + suma(a,b));
               break;
           case 2:
               System.out.println("El resultado de la resta es:" + resta(a,b));
               break;
           case 3:
               System.out.println("El resultado de la multiplicacion es:" + multiplicar(a,b));
               break;
           case 4:
               System.out.println("El resultado de la divicion es:" + dividir(a,b));
               break;
       }
    }
     public static int suma (int a, int b) {
        int c = a + b;
        return c;
        
     }
     public static int resta(int a,int b){
         int c = a-b;
         return c;
     }
     public static int multiplicar(int a,int b){
         int c = a*b;
         return c;
     }
     public static int dividir(int a, int b){
         int c = a/b;
         return c;
     }
}