/*
● 
2
● Método longitud(): muestra la longitud de la palabra que se debe
encontrar. Nota: buscar como se usa el vector.length.
● Método buscar(letra): este método recibe una letra dada por el
usuario y busca si la letra ingresada es parte de la palabra o no.
También informará si la letra estaba o no.
● Método encontradas(letra): que reciba una letra ingresada por el
usuario y muestre cuantas letras han sido encontradas y cuántas le
faltan. Este método además deberá devolver true si la letra estaba y
false si la letra no estaba, ya que, cada vez que se busque una letra
que no esté, se le restará uno a sus oportunidades.
● Método intentos(): para mostrar cuántas oportunidades le queda al
jugador.
● Método juego(): el método juego se encargará de llamar todos los
métodos previamente mencionados e informará cuando el usuario
descubra toda la palabra o se quede sin intentos. Este método se
llamará en el main.
Un ejemplo de salida puede ser así
 */
package pooejerciciosextras2clasedeutilidades;

import entidades.Ahorcado;
import servicio.AhorcadoServicio;

/**
 *
 * @author alexi
 */
public class POOEjerciciosExtras2ClaseDeUtilidades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AhorcadoServicio as = new AhorcadoServicio();
       // Ahorcado a1 = new Ahorcado();

    }

}
