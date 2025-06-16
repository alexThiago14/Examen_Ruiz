package examenB1;

public class Docente {
    private String nombre;
    private String apellido;
    private int edad;
    private String correo;
    private String curso;

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getApellido(){
        return apellido;
    }
    public void setApellido( String apellido){
        this.apellido=apellido;
    }

    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public String getCorreo(){
        return correo;
    }
    public void setCorreo(String correo){
        this.correo=correo;
    }
    public String getCurso(){
        return curso;
    }
    public void setCurso(String curso){
        this.curso=curso;
    }

    //Constructores
    public Docente(String nombre, String apellido, int edad, String correo,
                      String curso){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.correo=correo;
        this.curso=curso;
    }

    //Metodos
    public String mostrarPerfil(){
        return "Datos del Docente: ";
    }
    @Override
    public String toString() {
        return "Datos del Docente: " +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", correo='" + getCorreo() + '\'' +
                ", curso='" + curso + '\'';
    }
}
