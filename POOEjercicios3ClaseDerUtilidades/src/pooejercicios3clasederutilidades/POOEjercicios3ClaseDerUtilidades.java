/*
 * . 
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B,
mostrar A y B.
 */
package pooejercicios3clasederutilidades;

import servicio.ArregloService;

/**
 *
 * @author alexi
 */
public class POOEjercicios3ClaseDerUtilidades {

    /**
     * @param args the command line arguments Crear en el Main dos arreglos. El arreglo A de 50
     * números reales y el arreglo B de 20 números reales
     */
    public static void main(String[] args) {
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];
        ArregloService.inicializarA(arregloA);
        System.out.println("Arreglo A: ");
        ArregloService.mostrar(arregloA);
        ArregloService.ordenar(arregloA);
        System.out.println("Arreglo A ordenado de mayor a menor");
        ArregloService.mostrar(arregloA);
        ArregloService.inicializarB(arregloA, arregloB);
        System.out.println("Arreglo B: ");
        ArregloService.mostrar(arregloB);
    }

}
