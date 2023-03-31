/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionalesdia4;

import java.util.Scanner;

/**
 *
 * @author alexi
 */
public class EjercicioExtra5bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la clase de socio A, B o C):");
        String clase = leer.next();
        clase=clase.toUpperCase();
        System.out.println("Ingrese el costo del tratamiento");
        double costo = leer.nextDouble();
        double descuento = 0;
        switch (clase) {
       case "A": 
       descuento = 0.5;
       break;
       case "B":
       descuento = 0.35;
       break;
       case "C":
       descuento = 0;
       break;
       default:
       System.out.println("La clase de socio es invalida");
       
   }
         double costoConDescuento;
      costoConDescuento =  costo -(costo * descuento) ;
       System.out.println("El importe a pagar es :" + costoConDescuento);
    }
    
}
