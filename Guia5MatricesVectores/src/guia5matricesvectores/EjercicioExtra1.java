package guia5matricesvectores;

import java.util.Scanner;

/**
 *Realizar un algoritmo que calcule la suma de todos los elementos de un
vector de tamaño N, con los valores ingresados por el usuario
 * @author alexi
 */
public class EjercicioExtra1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int tam = leer.nextInt();
        int vector [] = new int[tam];
        //cargamos el vector
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese un numero");
            vector [i] = leer.nextInt();   
        }
        
    }
    
}
