package condicionalesdia4;

import java.util.Scanner;

/**
 *Realice un programa para que el usuario adivine el resultado de una
multiplicación entre dos números generados aleatoriamente entre 0 y 10.
El programa debe indicar al usuario si su respuesta es o no correcta. En
caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 * @author alexi
 */
public class EjercicioExtra10 {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      int num1 = (int) (Math.random()*10)+1;
      int num2 = (int) (Math.random()*10)+1;
      int resultado = num1 * num2;
      int respuesta;
      boolean adivinado = false;

while (!adivinado) {
    System.out.println("Ingrese el resultado de la multiplicación entre " + num1 + " y " + num2 + ": ");
    respuesta = leer.nextInt();
    
    if (respuesta == resultado) {
        System.out.println("¡Muy bien! Has adivinado el resultado.");
        adivinado = true;
    } else {
        System.out.println("Lo siento, tu respuesta es incorrecta. Intenta de nuevo.");
    }
}
}
}