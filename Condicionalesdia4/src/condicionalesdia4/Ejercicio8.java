package condicionalesdia4;

import java.util.Scanner;

/**
 *Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:
 * @author alexi
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int i,j,n;
        System.out.println("Ingrese el tamaño del cuadrado");
        n = leer.nextInt();
        
        for (i = 1; i <= n; i++){
            System.out.print("*");
        }
        System.out.println("-");
        for (i = 1; i <= n - 2 ; i++){
            System.out.print("");
            for (j=1; j <= n - 2; j++){
             System.out.print(" ");
            }
            System.out.println("*");
        }
        System.out.print("");
       for (i = 1; i <= n; i++){
            System.out.print("*");
        }
        System.out.println(" ");
    }
    
}
