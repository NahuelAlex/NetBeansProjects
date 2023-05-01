package entidades;

import java.util.Calendar;

/**
 *
 * @author alexi
 */
public class Persona {

    private String name;
    Calendar fechaNacimiento;

    public Persona() {
    }

    public Persona(String name, Calendar fechaNacimiento) {
        this.name = name;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
}
