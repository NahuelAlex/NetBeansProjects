package pooejercicios2clasedeutilidades;

import Entidades.ParDeNumeros;
import Servicio.ParDeNumerosService;

/**
 *
 * @author alexi
 */
public class POOEjercicios2ClaseDeUtilidades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ParDeNumeros pdn = new ParDeNumeros();
        ParDeNumerosService pns = new ParDeNumerosService();

        pns.mostrarValores(pdn);     
        System.out.println(pns.devolverMayor(pdn));
        System.out.println(pns.calcularPotencia(pdn));
        System.out.println(pns.calcularRaiz(pdn));
    }

}
