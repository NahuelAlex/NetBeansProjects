/*
 *Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual
deberá contener como atributos, un vector con la palabra a buscar, la
cantidad de letras encontradas y la cantidad jugadas máximas que
puede realizar el usuario. Definir los siguientes métodos en
AhorcadoService:
 */
package entidades;

/**
 *
 * @author alexi
 */
public class Ahorcado {
    private char[] palabra;
    private int letrasEncontradas;
    private int jugadasMaxima;

    public Ahorcado() {
    }

    public Ahorcado(char[] palabra, int letrasEncontradas, int jugadasMaxima) {
        this.palabra = palabra;
        this.letrasEncontradas = letrasEncontradas;
        this.jugadasMaxima = jugadasMaxima;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJugadasMaxima() {
        return jugadasMaxima;
    }

    public void setJugadasMaxima(int jugadasMaxima) {
        this.jugadasMaxima = jugadasMaxima;
    }
    
    
    
}
