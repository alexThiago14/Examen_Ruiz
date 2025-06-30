package ficheros.clases;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Lectura {

    private File archivo=null;
    private FileReader fr = null;
    private BufferedReader br=null;

    public void leerUnaFila(String path){
        try{
            archivo=new File(path);
            fr=new FileReader(archivo);
            br=new BufferedReader(fr);

            //Lectura e Impresion
            String linea;
            while ((linea=br.readLine())!=null){
            System.out.println(linea);}

        }catch(Exception e) {e.printStackTrace();}
        try {
            fr.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    //LECTURA DE ARCHIVOS CON EXPLORADOR DE ARCHIVOS
    public void leerArchivo(){
        try{
            JFileChooser file=new JFileChooser();
            file.setCurrentDirectory(new File("C:/"));
            file.showOpenDialog(null);
            File nuevo=file.getSelectedFile();
            fr=new FileReader(nuevo);
            br=new BufferedReader(fr);

            String linea;

            while((linea=br.readLine())!=null){
                System.out.println(linea);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al tratar de leer el archivo");
            e.printStackTrace();
        }finally {
            try{
                fr.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
