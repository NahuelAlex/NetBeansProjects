package servicio;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author alexi En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
 */
public class PersonaServicio {

    /*
    Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un
 * booleano. 
     */
    public static boolean esMayorDeEdad(Persona persona) {
        int edad = persona.getEdad();
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    /*
crearPersona(): el método crear persona, le pide los valores de los atributos
 * al usuario y después se le asignan a sus respectivos atributos para llenar el objeto Persona.
 * Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se
 * deberá mostrar un mensaje
     */
    public static Persona crearPersona() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        String nombre = leer.nextLine();
        System.out.println("Edad");
        int edad = leer.nextInt();
        System.out.println("Peso");
        double peso = leer.nextDouble();
        System.out.println("Altura");
        double altura = leer.nextDouble();
        System.out.println("Ingrese el sexo de la persona, H / M/ O: ");
        char sexo = leer.next().toUpperCase().charAt(0);

        while (sexo != 'H' && sexo != 'M' && sexo != 'O') {
            System.out.println("Incorrecto, vuelva a ingresar el sexo");
            sexo = leer.next().toUpperCase().charAt(0);
        }
        return new Persona(nombre, sexo, edad, peso, altura);
    }

    /*
    Método calcularIMC(): calculara si la persona está en su peso
 * ideal (peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
 * significa que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
 * fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona está en su
 * peso ideal y la función devuelve un 0. Finalmente, si el resultado de la fórmula es un valor
 * mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1
     */
    public static int calcularIMC(Persona persona) {
        double imc = persona.getPeso() / Math.pow(persona.getAltura(), 2);
        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        }else{
            return 1;
        }
    }

   }
