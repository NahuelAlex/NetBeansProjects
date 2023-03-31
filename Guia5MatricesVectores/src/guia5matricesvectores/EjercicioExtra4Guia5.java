
package guia5matricesvectores;

import java.util.Scanner;

/**
 *Los profesores del curso de programación de Egg necesitan llevar un
registro de las notas adquiridas por sus 10 alumnos para luego obtener
una cantidad de aprobados y desaprobados. Durante el período de
cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos
evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el
arreglo. Al final del programa los profesores necesitan obtener por
pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta
que solo aprueban los alumnos con promedio mayor o igual al 7 de sus
notas del curso.
 * @author alexi
 */
public class EjercicioExtra4Guia5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double [] promedios = new double [10];
        double [] [] notas = new double [10][4];
        int desaprobados = 0;
        int aprobados = 0;
        //cargamos las notas
        for (int i = 0; i < notas.length; i++) {
             System.out.println("Ingrese las notas del "+ (i+1)+ " alumno");
            for (int j = 0; j < 4; j++) {
                notas[i][j] = leer.nextDouble();
            }  
        }
        //calcular porcentajes
        for (int i = 0; i < notas.length; i++) {
                 double promedio = notas[i][0] * 0.1 + notas[i][1] * 0.15 + notas[i][2] * 0.25 + notas[i][3] * 0.5;
                promedios[i] = promedio;
            }
            for (int i = 0; i < promedios.length; i++) {
           if (promedios[i]>=7){
              aprobados++;
           }else {
               desaprobados++;
           }     
        }
             System.out.println("La cantidad de alumnos aprobados: "+aprobados+"\nLa cantidad de alumnos desaprobados es: " + desaprobados);
        }
    
    }
    

