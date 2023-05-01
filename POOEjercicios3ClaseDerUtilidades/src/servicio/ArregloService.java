/*
 * Crear la clase ArregloService, en el
paquete servicio, con los siguientes métodos:
1) Método inicializarA recibe un arreglo por parámetro y lo inicializa con
números aleatorios.
2) Método mostrar recibe un arreglo por parámetro y lo muestra por
pantalla.
3) Método ordenar recibe un arreglo por parámetro y lo ordena de
mayor a menor.
4) Método inicializarB copia los primeros 10 números del arreglo A en el
arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
 */
package servicio;

import java.util.Arrays;

/**
 *
 * @author alexi
 */
public class ArregloService {

    public static void inicializarA(double[] arregloA) {
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = Math.random();
        }
    }

    public static void mostrar(double[] arreglo) {
        for (double num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void ordenar(double[] arregloA) {
        Arrays.sort(arregloA);

        for (int i = 0; i < arregloA.length / 2; i++) {
            double temp = arregloA[i];
            arregloA[i] = arregloA[arregloA.length - i - 1];
            arregloA[arregloA.length - i - 1] = temp;
        }
    }

    /*Método inicializarB copia los primeros 10 números del arreglo A en el
arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.*/
    public static void inicializarB(double[] arregloA, double[] arregloB) {
        for (int i = 0; i < 10; i++) {
            arregloB[i] = arregloA[i];
        }
        Arrays.fill(arregloB, 10, 20, 0.5);
    }
}
