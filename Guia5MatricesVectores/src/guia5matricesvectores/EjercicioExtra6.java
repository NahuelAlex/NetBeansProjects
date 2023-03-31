
package guia5matricesvectores;
import java.util.Scanner
/**
 *Construya un programa que lea 5 palabras de mínimo 3 y hasta 5
caracteres y, a medida que el usuario las va ingresando, construya una
“sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las
palabras se ubicarán todas en orden horizontal en una fila que será
seleccionada de manera aleatoria. Una vez concluida la ubicación de las
palabras, rellene los espacios no utilizados con un número aleatorio del 0
al 9. Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java substring(), Length() y Math.random().
 * @author alexi
 */
public class EjercicioExtra6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = new String[5];
        int[] position = new int[5];
        int row = (int) (Math.random() * 20);
        String[][] puzzle = new String[20][20];
        for (int i = 0; i < words.length; i++) {
            System.out.print("Ingrese la palabra " + (i+1) + ": ");
            words[i] = scanner.nextLine().toUpperCase();
            while (words[i].length() < 3 || words[i].length() > 5) {
                System.out.print("La palabra debe tener entre 3 y 5 caracteres. Ingrese de nuevo: ");
                words[i] = scanner.nextLine().toUpperCase();
            }
            position[i] = (int) (Math.random() * (20 - words[i].length() ));
            for (int j = 0; j < words[i].length(); j++) {
                puzzle[row][position[i]+j] = words[i].substring(j, j+1);
            }
        }
        for (int i = 0; i < puzzle.length; i++) {
            for (int j = 0; j < puzzle[i].length; j++) {
                if (puzzle[i][j] == null) {
                    puzzle[i][j] = String.valueOf((int) (Math.random() * 10));
                }
                System.out.print(puzzle[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
