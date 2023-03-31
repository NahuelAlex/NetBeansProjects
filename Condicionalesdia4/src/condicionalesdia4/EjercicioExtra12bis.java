/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionalesdia4;

/**
 *
 * @author alexi
 */
public class EjercicioExtra12bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
        for (int i = 0; i <= 999; i++) {
            String counter = String.format("%03d", i);
            if (counter.contains("3")) {
                counter = counter.replace("3", "E");
            }
            System.out.println(counter);
        }
    }
    
}
