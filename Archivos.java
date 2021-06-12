import java.io.*;
import java.util.ArrayList;

public class Archivos {
    
    public static ArrayList<String> leerTxt(String ruta){

        ArrayList<String> texto = new ArrayList<>();

        try {
            BufferedReader bf = new BufferedReader(new FileReader(ruta));
            String linea;
            while ((linea = bf.readLine()) != null){
                texto.add(linea);
            }
            bf.close();
        }catch(Exception e){
            System.err.println("No se encontro el archivo");
        }

        return texto;    
    }

}
