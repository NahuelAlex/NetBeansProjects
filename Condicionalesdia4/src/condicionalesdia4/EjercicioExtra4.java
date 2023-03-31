package condicionalesdia4;

import java.util.Scanner;

public class EjercicioExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese un número entre 1 y 10");
         int numero = leer.nextInt();
         String numeroRomano = " ";
         switch (numero){
            case 1:
                System.out.println("El número 1 en romano es: I");
                break;
            case 2:
                System.out.println("El número 2 en romano es: II");
                break;
            case 3: 
                System.out.println("El número 3 en romano es: III");
                break;
            case 4:
                System.out.println("El número 4 en romano es: IV");
                break;
            case 5:
                System.out.println("El número 5 en romano es: V");
                break;
            case 6:
                System.out.println("El número 6 en romano es: VI");
                break;
            case 7:
                System.out.println("El número 7 en romano es: VII");
                break;
            case 8:
                System.out.println("El número 8 en romano es: VIII");
                break;
            case 9:
                System.out.println("El número 9 en romano es: IX");
                break;
            case 10:
                System.out.println("El número 10 en romano es: X");
                break;
                
            default:
                    System.out.println("El número esta fuera del rango " + "");
                    
         }
        
    }
}    
