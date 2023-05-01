/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio6clasedeutilidades;

import entidades.Curso;
import servicios.CursoServicio;

/**
 *
 * @author alexi
 */
public class POOEjercicio6ClaseDeUtilidades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Curso c1 = new Curso();
        CursoServicio cs = new CursoServicio();
        cs.crearCurso(c1);
        cs.calcularGananciaSemanal(c1);
    }
    
}
