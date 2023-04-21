
package ejercicio1poo;

import java.util.Scanner;

/**
 *Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, y un constructor con todos los
atributos pasados por parámetro y un constructor vacío. Crear un
método para cargar un libro pidiendo los datos al usuario y luego
informar mediante otro método el número de ISBN, el título, el autor del
libro y el número de páginas.
 * @author alexi
 */
public class Libro {
   public String ISBN;
   public String Titulo;
   public String Autor;
   public int NumeroPaginas;

    public Libro() {
    }

    public Libro(String ISBN, String Titulo, String Autor, int NumeroPaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumeroPaginas = NumeroPaginas;
    }
   public void cargarLibro () {
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese ISBN, Titulo, Autor, NumeroPaginas");
       ISBN = leer.nextLine();
       Titulo = leer.nextLine();
       Autor = leer.nextLine();
       NumeroPaginas = leer.nextInt(); 
   } 
   public void mostrar(){
       System.out.println("El ISBN ES: " + ISBN);
       System.out.println("Titulo: " + Titulo);
       System.out.println("Autor: " + Autor);
       System.out.println("Numero de paginas: " + NumeroPaginas);
   }
}
 