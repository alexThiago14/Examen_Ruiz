package ficheros.test;

import ficheros.clases.Empleado;
import ficheros.clases.Escritura;
import ficheros.clases.Lectura;

import java.util.ArrayList;
import java.util.List;

public class TestEscritura {
    public static void main(String[] args) {
        Escritura escritura = new Escritura();

        // Texto a guardar
        //String texto = "Programacion Orientada a Objetos - EPN.";
        // Ruta donde guardar
        //String ruta = "mi_archivo.txt";

        // Llamar al método
        //escritura.escribirFicheros(texto, ruta);
        List<Empleado> empleados = new ArrayList<Empleado>();
        empleados.add(new Empleado("Jhonatan","Gerente",2000));
        empleados.add(new Empleado("Maria","Administrador",1000));
        empleados.add(new Empleado("Luis","Gerente",2000));
        empleados.add(new Empleado("Marco","Presidente",5000));
        empleados.add(new Empleado("Angie","Administrador",1000));
        empleados.add(new Empleado("Pedro","Gerente",2000));

        /*escritura.escribirFicheros("nombre,cargo,sueldo", "mi_archivo_2.txt");
        for(Empleado e: empleados){
            escritura.escribirFicheros(e.toString(),"mi_archivo_2.txt");
        }

    }*/
        //Metodo generico para escribir en Bloque
        // Convertir List a ArrayList (por si el método lo exige)
        ArrayList<Empleado> listaEmpleados = new ArrayList<>(empleados);

        // Llamar al método con ruta y lista
        escritura.escribirLista("mi_archivo_3.txt", listaEmpleados);

        // ✅ Leer el archivo que acabas de escribir
        Lectura lectura = new Lectura();
        System.out.println("\nContenido del archivo:");
        lectura.leerUnaFila("mi_archivo_3.txt");

        //Leer el archivo con explorador de archivos
        Lectura lectura1=new Lectura();
        lectura1.leerArchivo();


    }





}


