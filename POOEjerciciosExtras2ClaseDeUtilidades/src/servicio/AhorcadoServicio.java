/*
 *Metodo crearJuego(): le pide la palabra al usuario y cantidad de
jugadas máxima. Con la palabra del usuario, pone la longitud de la
palabra, como la longitud del vector. Después ingresa la palabra en el
vector, letra por letra, quedando cada letra de la palabra en un índice
del vector. Y también, guarda la cantidad de jugadas máximas y el
valor que ingresó el usuario.
 */
package servicio;

import entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author alexi
 */
public class AhorcadoServicio {

    Scanner leer = new Scanner(System.in);

    //iniciar el juego
    public Ahorcado crearJuego() {
        System.out.println("Ingrese una palabra para empezar el ahorcado: ");
        String palabra = leer.nextLine();
        int longuitud = palabra.length();
        char[] letras = new char[longuitud];
        for (int i = 0; i < longuitud; i++) {
            letras[i] = palabra.charAt(i);
        }

        System.out.println("en cuantos intentos desae resolver el ahorcado: ");
        int jugadaMaxima = leer.nextInt();
        Ahorcado a1 = new Ahorcado(letras, 0, jugadaMaxima);
        return a1;
    }

    /*Método longitud(): muestra la longitud de la palabra que se debe
encontrar. Nota: buscar como se usa el vector.length.*/
    public void longitud(Ahorcado a1) {
        System.out.println("La palabra a adivinar tiene " + a1.getPalabra().length + " letras");
    }
    /*Método buscar(letra): este método recibe una letra dada por el
usuario y busca si la letra ingresada es parte de la palabra o no.
También informará si la letra estaba o no.*/
    public void buscar(Ahorcado a1){
        char letra = leer.nextLine();
    }
}
