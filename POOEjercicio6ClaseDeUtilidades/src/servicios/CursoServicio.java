package servicios;

import entidades.Curso;
import java.util.Scanner;

/**
 * f) Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en una semana
 * por curso. Para ello, se deben multiplicar la cantidad de horas por día, el precio por hora, la
 * cantidad de alumnos y la cantidad de días a la semana que se repite el encuentro.
 *
 * @author alexi
 */
public class CursoServicio {

    Scanner leer = new Scanner(System.in);

    /*Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos que asisten a
 * las clases. Nosotros nos encargaremos de almacenar esta información en un arreglo e iterar con un
 * bucle, solicitando en cada repetición que se ingrese el nombre de cada alumno.*/
    public void cargarAlumnos(Curso c1) {
        String arreglo[] = new String[c1.getAlumnos().length];
        for (int i = 0; i < c1.getAlumnos().length; i++) {
            System.out.println("Ingrese el nombre del alumno: ");
            arreglo[i] = leer.next();
        }
        c1.setAlumnos(arreglo);
    }

    /*Método crearCurso(): el método crear curso, le pide los valores de los atributos al usuario y 
    después se le asignan a sus respectivos atributos para llenar el objeto Curso. En este método 
    invocamos al método cargarAlumnos() para asignarle valor al atributo alumnos */
    public void crearCurso(Curso c1) {
        System.out.println("Ingrese el nombre del curso: ");
        c1.setNombreCurso(leer.nextLine());
        System.out.println("Ingrese el turno: ");
        c1.setTurno(leer.nextLine());
        System.out.println("Ingrese la cantidad de horas por dia: ");
        c1.setCantidadHorasPorDia(leer.nextDouble());
        System.out.println("ingrese cantidad de dias por semana: ");
        c1.setCantidadDiasPorSemana(leer.nextDouble());
        System.out.println("Ingrese el valor por hora: ");
        c1.setPrecioPorHora(leer.nextDouble());
        cargarAlumnos(c1);
    }
    /*Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en una semana
    por curso. Para ello, se deben multiplicar la cantidad de horas por día, el precio por hora, la
 * cantidad de alumnos y la cantidad de días a la semana que se repite el encuentro*/
    
    public void calcularGananciaSemanal(Curso c1){
        double ganancia = c1.getPrecioPorHora()*c1.getCantidadHorasPorDia()*c1.getAlumnos().length*c1.getCantidadDiasPorSemana();
        System.out.println("Las ganancias totales son: "+ganancia+" $");       
    }  
}
