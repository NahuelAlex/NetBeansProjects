import java.util.Scanner;

/**
 *Crea una aplicación que nos pida un número por teclado y con una
función se lo pasamos por parámetro para que nos indique si es o no un
número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo,
17 si es primo.
 * @author alexi
 */
public class Ejercicio4 {

    public static void main(String[] args) {
           Scanner leer = new Scanner(System.in);
        System.out.println("ingresa un número");
        int num=leer.nextInt();
        if(primos(num)){
            System.out.println(num+" Es un número primo");
        }else{
             System.out.println(num+" No es un número primo");
        }
    }
    public static boolean primos (int num) {
        boolean primo=true;
        for (int i = 2; i < num; i++) {
           
            if(num%i==0){
                primo=false;
            }
        }
       return primo;
    }
    
}
