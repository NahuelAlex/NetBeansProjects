import java.util.Scanner;

/**
 *
 * @author alexi
 */
public class Ejercicio11Guia {

/**Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto,
 * y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se reemplaza por el carácter
 * que se indica en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios.
    aeiou@#$%*
Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación correspondiente. 
* Utilice la estructura “según” para la transformación. 
Por ejemplo, si el usuario ingresa:  Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String fraseNueva = sc.nextLine();
        cambiarLetra(fraseNueva);
    }
    public static void cambiarLetra(String frase){
        String fraseCambiada = "";
        for (int i = 0; i < frase.length(); i++) {
         switch (frase.substring(i, i+1).toLowerCase()) {
            case "a":
                fraseCambiada += "@";
                break;
            case "e":
                fraseCambiada += "#";
                break;
            case "i":
                fraseCambiada += "$";        
                break;
            case "o":
                fraseCambiada += "%";        
                break;
            case "u":
                fraseCambiada += "*";         
                break;
            default:
                fraseCambiada += frase.substring(i, i+1);
        }
    }
        System.out.println(fraseCambiada);
       
    }
    
}
