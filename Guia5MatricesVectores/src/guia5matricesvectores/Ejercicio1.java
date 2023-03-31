
package guia5matricesvectores;


/**
 *Realizar un algoritmo que llene un vector con los 100 primeros números
enteros y los muestre por pantalla en orden descendente.
 * @author alexi
 */
public class Ejercicio1 {

    public static void main(String[] args) {
             //creamos el vector
        int [] vector = new int[100];
        // llenamos el vector
        for (int i = 0; i < vector.length; i++) {
            vector[i]=i+1;
        }
        //mostrarlo en orden descendente
        for (int i =(vector.length-1) ; i >=0 ; i--) {
            System.out.println(vector[i]+" Posicion de vector "+i);
            
        }
        
    }
    
}
