package ejercicio3serviciospoo;

import Entidades.Persona;
import servicio.PersonaServicio;

public class Ejercicio3ServiciosPOO {

    /**
     * ● Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los
     * métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
     * sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
     * mayor de edad. ● Por último, guardaremos los resultados de los métodos calcularIMC y
     * esMayorDeEdad en distintas variables(arrays), para después calcular un porcentaje de esas 4
     * personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima,
     * y también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores. Para
     * esto, podemos crear unos métodos adicionales.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PersonaServicio personaservicio = new PersonaServicio();
        Persona[] personas = new Persona[4];
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Ingrese los datos la persona " + (i + 1));
            personas[i] = PersonaServicio.crearPersona();

        }
        for (int i = 0; i < personas.length; i++) {
            Persona persona = personas[i];
            System.out.println("persona: " + (i + 1) + " Nombre: " + persona.getNombre() + " - " + " Edad: " + persona.getEdad() + " - " + " Peso: " + persona.getPeso() + " - " + " Altura: " + persona.getAltura() + " - " + "Sexo: " + persona.getSexo());

            int imc = PersonaServicio.calcularIMC(persona);
            if (imc == -1) {
                System.out.println("La persona esta por debajo de su peso ideal");
            } else if (imc == 0) {
                System.out.println("La persona esta en su peso ideal");
            } else {
                System.out.println("La persona tiene sobrepeso");
            }
           
            boolean mayorDeEdad = PersonaServicio.esMayorDeEdad(persona);
            if (mayorDeEdad) {
                System.out.println("Es mayor de edad");
            } else {
                System.out.println("No es mayor de edad");
            }
             System.out.println("------------------------------------------");
        }
        int[] imcResultados = new int[3];
        int[] mayorDeEdadResultados = new int[2];

        for (int i = 0; i < personas.length; i++) {
            Persona persona = personas[i];
            int imc = PersonaServicio.calcularIMC(persona);
            if (imc == -1) {
                imcResultados[0]++;
            } else if (imc == 0) {
                imcResultados[1]++;
            } else {
                imcResultados[2]++;
            }
            boolean mayorDeEdad = PersonaServicio.esMayorDeEdad(persona);
            if (mayorDeEdad) {
                mayorDeEdadResultados[0]++;
            } else {
                mayorDeEdadResultados[1]++;
            }
        }
        float porcentajeBajoPeso = imcResultados[0] * 100.0f / personas.length;
        float porcentajePesoIdeal = imcResultados[1] * 100.0f / personas.length;
        float porcentajeSobrePeso = imcResultados[2] * 100.0f / personas.length;
        float porcentajeMayor = mayorDeEdadResultados[0] * 100.0f / personas.length;
        float porcentajeMenor = mayorDeEdadResultados[0] * 100.0f / personas.length;

        System.out.println("Porcentaje de personas con bajo peso " + porcentajeBajoPeso);
        System.out.println("Porcentaje de personas con peso ideal " + porcentajePesoIdeal);
        System.out.println("Porcentaje de personas con sobrepeso " + porcentajeSobrePeso);
        System.out.println("Porcentaje de personas Mayores de edad " + porcentajeMayor);
        System.out.println("Porcentaje de personas menores de edad " + porcentajeMenor);
    }
}
