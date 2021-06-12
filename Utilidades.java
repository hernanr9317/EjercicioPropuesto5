import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Utilidades {
  
    public static void convertirTxtEmpleados (ArrayList<String> texto, ArrayList<Empleado> sueldos){  

        

        for (int i=0; i<texto.size();i++){
            String aux= texto.get(i);
            String [] separacion = aux.split(",");
            
            
            String nombre= separacion[0];
            String apellido= separacion[1];
            LocalDate nacimiento = LocalDate.parse(separacion[2], Empleado.formatoArg);
            BigDecimal sueldo= new BigDecimal(separacion[3]);

            sueldos.add(new Empleado(nombre, apellido, nacimiento, sueldo));
        }

    }

    public static void darApellidoLetra(ArrayList<Empleado> empleados, char letra){

        
        for (int i=0;i<empleados.size();i++){
           Empleado emp=  empleados.get(i);
           String apellido = emp.getApellido();
           if(apellido.charAt(0) == Character.toUpperCase(letra) ){
               System.out.println(emp);
           }
            
        }
    }

    public static Empleado darMayorEdad(ArrayList<Empleado> empleados){
        Empleado empleado= Collections.max(empleados, Comparator.comparing(s -> s.calcularEdad()));
        return empleado;
    }

    public static Empleado darMenorEdad(ArrayList<Empleado> empleados){
        Empleado empleado= Collections.min(empleados, Comparator.comparing(s -> s.calcularEdad()));
        return empleado;
    }

    public static Empleado mayorSueldo(ArrayList<Empleado> empleados){
        Empleado empleado= Collections.max(empleados, Comparator.comparing(s -> s.sueldo));
        return empleado;
    }

    public static Empleado menorSueldo(ArrayList<Empleado> empleados){
        Empleado empleado= Collections.min(empleados, Comparator.comparing(s -> s.sueldo));
        return empleado;
    }

    public static void ordenarAlfabeticamenteApellido(ArrayList<Empleado> empleados){
        Collections.sort(empleados, new Comparator<Empleado>(){
            public int compare(Empleado emp1, Empleado emp2){
                return emp1.getApellido().compareTo(emp2.getApellido());
            }
        });
    }

    public static void ordenarAlfabeticamenteNombre(ArrayList<Empleado> empleados){
        Collections.sort(empleados, new Comparator<Empleado>(){
            public int compare(Empleado emp1, Empleado emp2){
                return emp1.getNombre().compareTo(emp2.getNombre());
            }
        });
    }

}
