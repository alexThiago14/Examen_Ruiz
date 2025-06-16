package examenB1;

public class Curso_Certificado {
    private String nombre;
    private int id_estudiante;
    private String duracion;


    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public int getId_estudiante(){
        return id_estudiante;
    }
    public void setId_estudiante( int id_estudiante){
        this.id_estudiante=id_estudiante;
    }

    public String getDuracion(){
        return duracion;
    }
    public void setDuracion(String duracion){
        this.duracion=duracion;
    }


    //Constructores
    public Curso_Certificado(String nombre, int id_estudiante, String duracion){
        this.nombre=nombre;
        this.id_estudiante=id_estudiante;
        this.duracion=duracion;
    }

    //Metodos
    public String calularPrecioFinal(){
            return "Precio final: ";
        }
    }

    public String mostrarResumen(){
        if(()){
            return ("\n" + toString());
        }
        return "Datos del estudiante: ";
    }

