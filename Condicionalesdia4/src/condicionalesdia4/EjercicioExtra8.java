package condicionalesdia4;

import java.util.Scanner;

/**
 *8. Escriba un programa que lea números enteros. Si el número es múltiplo
de cinco debe detener la lectura y mostrar la cantidad de números
leídos, la cantidad de números pares y la cantidad de números impares.
Al igual que en el ejercicio anterior los números negativos no deben
sumarse. Nota: recordar el uso de la sentencia break.
 * @author alexi
 */
public class EjercicioExtra8 {

   
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      int num, par=0, impar=0;
      int i=0;
      do {
          System.out.println("Ingrese un numero");
          num=leer.nextInt();
          if (num % 2 == 0){
              par++;
              i++;
          }else{
              impar++;
              i++;
          }
      }while(num % 5 != 0);
        System.out.println("La cantidad de numero pares es: " + par);
        System.out.println("La cantidad de numero impares es: " + impar);
        System.out.println("La cantidad de numero ingresados es: " + i);
    }
    
}
