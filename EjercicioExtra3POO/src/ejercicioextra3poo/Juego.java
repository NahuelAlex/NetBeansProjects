package ejercicioextra3poo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alexi
 */
public class Juego {

    private int jugador1Ganadas;
    private int jugador2Ganadas;

    public Juego() {
        jugador1Ganadas = 0;
        jugador2Ganadas = 0;
    }

    public void iniciarJuego() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAdivinar = random.nextInt(100) + 1;
        int intentos = 10;
        int intentoActual = 0;
        //int numeroElegido;
        boolean acierto = false;
        boolean salida1 = true;

        //System.out.println("Jugador 1, elige un número entre 1 y 100:");
        //numeroElegido = scanner.nextInt();
        do {
            while (!acierto && salida1 && intentoActual < intentos) {
                intentoActual++;
                System.out.println("Jugador 1, adivina el número (" + intentoActual + "/" + intentos + " intentos):");
                int numeroAdivinado = scanner.nextInt();

                if (numeroAdivinado == numeroAdivinar) {
                    acierto = true;
                    System.out.println("¡Adivinaste el número en " + intentoActual + " intentos!");
                    jugador1Ganadas++;
                    break;
                } else if (numeroAdivinado < numeroAdivinar) {
                    System.out.println("El número es más alto.");
                } else {
                    System.out.println("El número es más bajo.");
                }
                System.out.println("Jugador 2, adivina el número (" + intentoActual + "/" + intentos + " intentos):");
                int numeroAdivinado1 = scanner.nextInt();
                if (numeroAdivinado1 == numeroAdivinar) {
                    acierto = true;
                    System.out.println("¡Adivinaste el número en " + intentoActual + " intentos!");
                    jugador2Ganadas++;
                    break;
                } else if (numeroAdivinado1 < numeroAdivinar) {
                    System.out.println("El número es más alto.");
                } else {
                    System.out.println("El número es más bajo.");
                }
            }
            if (!acierto) {
                System.out.println("Se acabaron los intentos. El número era " + numeroAdivinar + ".");
            }
            System.out.println("Puntaje ");
            System.out.println("-----------------------------------");
            System.out.println("jugador 1 " + jugador1Ganadas);
            System.out.println("jugador 2 " + jugador2Ganadas);
            System.out.println("-----------------------------------");
            System.out.println("Desea volver a jugar s/n");
            String respuesta = scanner.next();
            if (respuesta.equalsIgnoreCase("n")) {
                salida1 = true;
            } else {
                salida1 = false;
            }

        } while (salida1 != true);
    }

    public int getJugador1Ganadas() {
        return jugador1Ganadas;
    }

    public void setJugador1Ganadas(int jugador1Ganadas) {
        this.jugador1Ganadas = jugador1Ganadas;
    }

    public int getJugador2Ganadas() {
        return jugador2Ganadas;
    }

    public void setJugador2Ganadas(int jugador2Ganadas) {
        this.jugador2Ganadas = jugador2Ganadas;
    }
}
