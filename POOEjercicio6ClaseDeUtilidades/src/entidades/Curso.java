package entidades;

/**
 * Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un programa para
 * organizar la información de cada curso. Para ello, crearemos una clase entidad llamada Curso,
 * cuyos atributos serán: nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno (mañana o
 * tarde), precioPorHora y alumnos. Donde alumnos es un arreglo de tipo String de dimensión 5
 * (cinco), donde se alojarán los nombres de cada alumno. A continuación, se implementarán los
 * siguientes métodos: Un constructor por defecto. b) Un constructor con todos los atributos como
 * parámetro. c) Métodos getters y setters de cada atributo.
 *
 * @author alexi
 */
public class Curso {

    private String nombreCurso;
    private String turno;
    private double cantidadHorasPorDia;
    private double cantidadDiasPorSemana;
    private double precioPorHora;
    private String[] alumnos = new String[5];

    public Curso() {
    }

    public Curso(String nombreCurso, String turno, double cantidadHorasPorDia, double cantidadDiasPorSemana, double precioPorHora) {
        this.nombreCurso = nombreCurso;
        this.turno = turno;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.precioPorHora = precioPorHora;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(double cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public double getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(double cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

}
