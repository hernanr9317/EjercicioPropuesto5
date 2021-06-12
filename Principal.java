import java.util.ArrayList;

public class Principal {
   
    
    public static void main(String[] args){

        
        ArrayList<String> sueldos = Archivos.leerTxt("D:\\Proyectos Java\\EjercicioPropuesto5\\Sueldos.txt");
        ArrayList<Empleado> listaconvertida = new ArrayList<>();

        Utilidades.convertirTxtEmpleados(sueldos, listaconvertida);


        System.out.println("Lista completa: ");
        System.out.println(listaconvertida);

        System.out.println("Busqueda por letra del apellido, ejemplo con letra 'c': ");
        Utilidades.darApellidoLetra(listaconvertida, 'c');


        System.out.println("El mas viejo es: "+Utilidades.darMayorEdad(listaconvertida));
        System.out.println("El mas joven es: "+Utilidades.darMenorEdad(listaconvertida));

        System.out.println("El que mas gana es: "+Utilidades.mayorSueldo(listaconvertida));
        System.out.println("El que menos gana es: "+Utilidades.menorSueldo(listaconvertida));

        Utilidades.ordenarAlfabeticamenteApellido(listaconvertida);
        System.out.println("Lista ordenanada por apellido: ");
        System.out.println(listaconvertida);

        Utilidades.ordenarAlfabeticamenteNombre(listaconvertida);
        System.out.println("Lista ordenanada por nombre: ");
        System.out.println(listaconvertida);


        
        
    }
}
