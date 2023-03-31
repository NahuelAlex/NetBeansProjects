package guia5matricesvectores;

import java.util.Scanner;

/**
 *Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros
de equipo y define su tipo de dato de tal manera que te permita alojar sus
nombres más adelante.
 * @author alexi
 */
public class Guia5MatricesVectores {

    public static void main(String[] args) {
   String equipo [] = new String[5];
           Scanner leer = new Scanner(System.in);        
        System.out.println("Ingrese la cantidad de alumnos");
        int cant= leer.nextInt();
      leer.nextLine();
        String [] Equipo= new String[cant];
        
        for (int i = 0; i < Equipo.length; i++) {
           
            System.out.println("Ingrese nombre del alumno " + (i+1));
             Equipo[i]=leer.nextLine();
        }
        for (String elemento: Equipo) {
            System.out.println(elemento);
            
        }
    }
    
}
