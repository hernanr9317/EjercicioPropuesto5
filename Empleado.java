import java.math.BigDecimal;
import java.time.*;
import java.time.format.DateTimeFormatter;



public class Empleado {

    public static DateTimeFormatter formatoArg = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    String nombre;
    String apellido;
    LocalDate nacimiento;
    BigDecimal sueldo;


    public Empleado(String nombre, String apellido, LocalDate nacimiento, BigDecimal sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.sueldo = sueldo;
    }
    

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", apellido='" + getApellido() + "'" +
            ", nacimiento='" + formatoArg.format(getNacimiento()) + "'" +
            ", sueldo='" + getSueldo() + "'" +
            "}"+"\n";
    }

    public int calcularEdad(){
        Period edad = Period.between(this.nacimiento, LocalDate.now());
        int años = edad.getYears();
        return años;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getNacimiento() {
        return this.nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public BigDecimal getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(BigDecimal sueldo) {
        this.sueldo = sueldo;
    }

}
