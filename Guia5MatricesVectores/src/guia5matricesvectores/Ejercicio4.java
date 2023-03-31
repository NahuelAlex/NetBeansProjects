package guia5matricesvectores;
/**
 *Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
A se denota por B y se obtiene cambiando sus filas por columnas (o
viceversa).
 * @author alexi
 */
public class Ejercicio4 {

    public static void main(String[] args) {
       int [] [] matriz = new int [4] [4];
       
       for (int i = 0; i < matriz.length; i++) {
           for (int j = 0; j < matriz.length; j++) {
               matriz [i] [j]= (int)(Math.random() * 10);
           }
           }
   
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(" ");
            System.out.println("");
           for (int j = 0; j < matriz.length; j++) {
               System.out.print(matriz [i] [j]);
               System.out.print(" ");
           }
           }
        System.out.println("");
        System.out.print("------------------------------------");
         for (int i = 0; i < matriz.length; i++) {
            System.out.print(" ");
            System.out.println("");
           for (int j = 0; j < matriz.length; j++) {
               System.out.print(matriz [j] [i]);
               System.out.print(" ");
           }
           }
        System.out.println("");
           }
    }
    

