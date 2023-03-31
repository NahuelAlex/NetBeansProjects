
package guia5matricesvectores;

import java.util.Scanner;

/**
 *Realizar un algoritmo que llene un vector de tamaño N con valores
aleatorios y le pida al usuario un número a buscar en el vector. El
programa mostrará dónde se encuentra el numero y si se encuentra
repetido
 * @author alexi
 */
public class Ejercicio2 {

    public static void main(String[] args) {
              Scanner leer = new Scanner(System.in);        
        System.out.println("Ingrese la cantidad de numero a cargar");
        int N=leer.nextInt();
        
        //creamos el vector
        int [] vector = new int[N];
        // llenamos el vector
        for (int i = 0; i < vector.length; i++) {
            vector[i]= (int)(Math.random() * 10);
        }
        // buscar numero
        System.out.println("Ingrese un numero a buscar");
        int numB= leer.nextInt();
        int contador=0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i]==numB){
                contador++;
                System.out.println("El numero "+ numB+ " esta en la posicion "+i);
            }
            
        }
        if (contador>0){
                    System.out.println("El numero se encontro "+ contador+ " veces");

        }else{
            System.out.println("El numero "+ numB+ " no se encuentra en el vector");
        }
        
        
        //mostrarlo en orden descendente
        for (int i =(vector.length-1) ; i >=0 ; i--) {
            System.out.println(vector[i]+" Posicion de vector "+i);
            
        }
    }
    
}
