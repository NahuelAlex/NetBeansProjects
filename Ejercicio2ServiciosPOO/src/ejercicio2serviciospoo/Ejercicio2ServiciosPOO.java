package ejercicio2serviciospoo;

import entidades.Cafetera;
import java.util.Scanner;
import servicio.CafeteraServicio;

/**
 * Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con los atributos
 * capacidadMáxima (la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
 * cantidad actual de café que hay en la cafetera). Agregar constructor vacío y con parámetros así
 * como setters y getters. Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
 * a) Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. b)
 * Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la
 * taza y simula la acción de servir la taza con la capacidad indicada. Si la cantidad actual de
 * café “no alcanza” para llenar la taza, se sirve lo que quede. El método le informará al usuario
 * si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza. c) Método
 * vaciarCafetera(): pone la cantidad de café actual en cero. d) Método agregarCafe(int): se le pide
 * al usuario una cantidad de café, el método lo recibe y se añade a la cafetera la cantidad de café
 * indicada.
 *
 * @author alexi
 */
public class Ejercicio2ServiciosPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cafetera cafetera = new Cafetera(1000, 500);
        CafeteraServicio cafeServi = new CafeteraServicio();

        int opcion = 0;

        do {
            System.out.println("Seleccione una opcion:");
            System.out.println("1: llenar cafetera");
            System.out.println("2: Servir taza");
            System.out.println("3: Vaciar cafetera");
            System.out.println("4: Agregar cafe");
            System.out.println("5: Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    cafeServi.llenarCafetera(cafetera);
                    break;
                case 2:
                    System.out.println("Ingrese el tamaño de la taza");
                    int tamañoTaza = leer.nextInt();
                    cafeServi.servirTaza(cafetera, tamañoTaza);
                    break;
                case 3:
                    cafeServi.vaciarCafetera(cafetera);
                    break;
                case 4:
                    System.out.println("Cuanto cafe desea agregar");
                    int cantidadTotal = leer.nextInt();
                    cafeServi.agregarCafe(cafetera, cantidadTotal);
                    break;
                case 5:
                    System.out.println("Gracias por utilizar el servicio");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 6);
        {

        }
    }

}
