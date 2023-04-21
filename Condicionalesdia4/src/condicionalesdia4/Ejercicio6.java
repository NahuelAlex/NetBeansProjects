package condicionalesdia4;

import java.util.Scanner;

/**
 *Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.
 * @author alexi
 */
public class Ejercicio6 {

    public static void main(String[] args) {
       int option, num1, num2;
        String resp;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el primer numero a calcular:");
        num1=leer.nextInt();
        System.out.println("Ingrese el segundo numero a calcular:");
        num2=leer.nextInt();
        resp="N";
                
        do {
        System.out.println("-------------------");
        System.out.println("MENU");
        System.out.println("-------------------");
        System.out.println("1- SUMAR");
        System.out.println("2- RESTAR");
        System.out.println("3-MULTIPLICAR");
        System.out.println("4-DIVIDIR");
        System.out.println("5-SALIR");
        System.out.println();
        System.out.println("INGRESE UNA OPCION");
        option=leer.nextInt();

        switch (option){
          case 1:
              System.out.println("La suma de los numeros es: "+(num1+num2));
              break;
          case 2:
              System.out.println("La resta de los numeros es: "+ (num1-num2));
              break;
          case 3:
              System.out.println("La multiplicacion de los numeros es: "+ (num1*num2));
              break;
          case 4:
              System.out.println("La division de los numeros es: "+(num1/num2));
              break;
          case 5:
              System.out.println("Esta seguro de salir? presione(S/N)");
              resp=leer.next();
              resp = resp.toUpperCase();
              if (resp.equals("S")){
                  System.out.println("SALIR...");
                }  
            }
        }
        while ((resp.equals("N")) || option !=5);
    }
    
}
