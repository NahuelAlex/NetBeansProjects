package Servicio;

import Entidades.ParDeNumeros;

/**
 * c) Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor
 * número. Previamente se deben redondear ambos valores. d)
 *
 * @author alexi
 */
public class ParDeNumerosService {

    /*Método mostrarValores que muestra cuáles son los dos números guardados.*/
    public void mostrarValores(ParDeNumeros pdn) {
        System.out.println(pdn.getNumero1() + " y " + pdn.getNumero2());
    }

    /*Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor*/
    public double devolverMayor(ParDeNumeros pdn) {
        double numero1 = pdn.getNumero1();
        double numero2 = pdn.getNumero2();
        if (numero1 > numero2) {
            return numero1;
        } else {
            return numero2;
        }
    }

    /*Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor
 * número. Previamente se deben redondear ambos valores*/
    public double calcularPotencia(ParDeNumeros pdn) {
        double mayor = devolverMayor(pdn);
        double menor = 0;
        if (mayor == pdn.getNumero1()) {
            menor = devolverMayor(pdn);
        } else {
            menor = pdn.getNumero2();
        }
        mayor = Math.round(mayor);
        menor = Math.round(menor);
        return Math.pow(menor, menor);
    }

    /*Método calculaRaiz, para calcular la
 * raíz cuadrada del menor de los dos valores. Antes de calcular la raíz cuadrada se debe obtener el
 * valor absoluto del número.*/
    public double calcularRaiz(ParDeNumeros pdn) {
        double mayor = devolverMayor(pdn);
        double menor = 0;
        if (mayor == pdn.getNumero1()) {
            menor = devolverMayor(pdn);
        } else {
            menor = pdn.getNumero2();
        }

        menor = Math.abs(menor);
        return Math.sqrt(menor);
    }
}
