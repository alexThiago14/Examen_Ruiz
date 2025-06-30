package ficheros.clases;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Escritura {

    private FileWriter fichero=null;
    private PrintWriter pw = null;

    /*public void escribirFicheros(String info, String ruta){
        try(FileWriter fichero = new FileWriter(ruta, true);
            PrintWriter pw = new PrintWriter(fichero)){

            pw.println(info);
            System.out.println("Archivo creado exitosamente");
        }catch (IOException e){
            System.err.println("Error al subir el archivo: "+e.getMessage());
        }
    }*/

    //Metodo generico para escribir en Bloque
    public <T> void escribirLista(String ruta, ArrayList<T> lista) {
        try (FileWriter fw = new FileWriter(ruta, true);
             PrintWriter pw = new PrintWriter(fw)) {

            for (T item : lista) {
                pw.println(item); // Usa toString() de cada objeto
            }
            System.out.println("Lista escrita exitosamente.");

        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
