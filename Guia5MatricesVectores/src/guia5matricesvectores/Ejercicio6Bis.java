
package guia5matricesvectores;
import java.util.Scanner;
/**
 *Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del
1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
idénticas. Crear un programa que permita introducir un cuadrado por
teclado y determine si este cuadrado es mágico o no. El programa
deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 * @author alexi
 */
public class Ejercicio6Bis {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Inicializamos la matriz
          int [][] cuadrado = new int [3][3] ;
          
        //Rellenamos con numeros aleatorios  
        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado.length; j++) {
                 cuadrado [i][j]=(int)(Math.random()*10);    
            } 
        }
        //mostramos por pantalla la matriz
        for (int i = 0; i < cuadrado.length; i++) {
            System.out.print(" ");
            System.out.println("");
            for (int j = 0; j < cuadrado.length; j++) {
                System.out.print(cuadrado[i][j]);
                System.out.print(" ");
            } 
            }
        System.out.println("");
        //suma fila
        for (int i = 0; i < cuadrado.length; i++) {
            int sumai=0;
            for (int j = 0; j < cuadrado.length; j++) {
                sumai=sumai +cuadrado[i][j]; 
            }
            System.out.println("La suma de la fila "+i+" es: "+sumai);
        }
        //suma columnas
        for (int j = 0; j < cuadrado.length; j++) {
          int sumaj=0;
            for (int i = 0; i < cuadrado.length; i++) {
                sumaj = sumaj+cuadrado[i][j];   
            }
            System.out.println("La suma de la columna "+j+" es: "+sumaj);
        }    
    //suma diagonal 1
    int sumadiagonal1=0;
            for (int i = 0; i < cuadrado.length; i++) {
                for (int j = 0; j < cuadrado.length; j++) {
                    if (i==j){
                        sumadiagonal1=sumadiagonal1+cuadrado[i][j];
                    }
                }
        }
            System.out.println("la suma de la diagonal primaria es: "+ sumadiagonal1);
        // suma de la sugunda diagonal
        int i = cuadrado.length - 1;
        int sumadiagonal2 = 0;
        for (int j = 0; j < cuadrado.length; j++) {
           sumadiagonal2 = sumadiagonal2 + cuadrado [i][j];
            i=i-1;
        }
        System.out.println("La suma de la diagonal 2 es: " + sumadiagonal2);
        
        if (sumaj=sumai && sumadiagonal1=sumadiagonal2){
            System.out.println("Es un cuadrado magico");   
        }else{
            System.out.println("No es un cuadrado magico");
        }
        }
    }
    

