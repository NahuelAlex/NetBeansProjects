package guia5matricesvectores;

import java.util.Scanner;

/**
 *Realizar un programa que llene una matriz de tamaño NxM con valores
aleatorios y muestre la suma de sus elementos.
 * @author alexi
 */
public class EjercicioExtra5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de filas y columnas");
        int N = leer.nextInt();
        int M = leer.nextInt();
        int [][] matriz = new int [N][M];
         int suma = 0;
        
        //llenamos matriz
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
               matriz [i][j]=(int)(Math.random()*10);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
              suma+=matriz[i][j]; 
            } 
        }
      for (int i = 0; i < matriz.length; i++) {
            System.out.print(" ");
            System.out.println("");
           for (int j = 0; j < matriz.length; j++) {
               System.out.print(matriz [j] [i]);
               System.out.print(" ");
            }
             System.out.println("");
        }
        System.out.println("La suma de sus elementos es: "+suma);
    }
    
}
