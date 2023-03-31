package condicionalesdia4;

import java.util.Scanner;

/**
 *Realizar un programa que simule el funcionamiento de un dispositivo
RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
cadenas deben llegar con un formato fijo: tienen que ser de un máximo
de 5 caracteres de largo, el primer carácter tiene que ser X y el último
tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
FDE), y toda secuencia distinta de FDE, que no respete el formato se
considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de
lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
deberá investigar cómo se utilizan las siguientes funciones de Java
Substring(), Length(), equals().
 * @author alexi
 */
public class Ejercicio7 {

    public static void main(String[] args) {
  Scanner leer=new Scanner(System.in);
        int contCorrecta = 0, contIncorrecta = 0, largo;
        String frase, pri, ult;
        boolean correcto = false;
        
        while (true) {
            System.out.println("Ingrese una frase");
            frase = leer.nextLine();
            largo = frase.length();
            pri = frase.substring(0, 1);
            ult = frase.substring(largo-1,largo);         
            if (frase.length()<=5 && pri.equals("x")&&ult.equals("o")){  
                contCorrecta = contCorrecta+1;
            }else if (frase.equals("&&&&&")) {
                break;
            }else if (frase.length()>5){
                    contIncorrecta=contIncorrecta+1;
            }else {
                contIncorrecta=contIncorrecta+1;
        } 
        } 
        System.out.println("La cantidad de correctas es: "+contCorrecta+" y la cantidad de incorrectas es: "+contIncorrecta);
        }

}