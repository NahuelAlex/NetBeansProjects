package ejercicioextra1poo;

public class EjercicioExtra1POO {

    /**
     * Desarrollar una clase Cancion con los siguientes atributos: título y autor. Se deberá definir además
     * dos constructores: uno vacío que inicializa el título y el autor a cadenas vacías y otro que reciba
     * como parámetros el título y el autor de la canción. Se deberán además definir los métodos getters y
     * setters correspondientes.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cancion song = new Cancion();
        song.setTitulo("Muchachos");
        song.setAutor("La Escaloneta");
        System.out.println("Titulo: "+song.getTitulo() +" "+ "\nAutor: " + song.getAutor());
        
    }

}
