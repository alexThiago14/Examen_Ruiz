package examenB1;

public class Estudiante {
    private String nombre;
    private String apellido;
    private int edad;
    private String correo;
    private String curso;
    private String matricula;

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
    public String getMatricula(){
        return matricula;
    }
    public void setMatricula(String matricula){
        this.matricula=matricula;
    }

    //Constructores
    public Estudiante(String nombre, String apellido, int edad, String correo,
                      String curso, String matricula){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.correo=correo;
        this.curso=curso;
        this.matricula=matricula;
    }

    //Metodos
    public boolean validarEdad(){
        if(edad>13 && edad<60){
            return true;
        }else{
            return false;
        }
    }

    public String mostrarDatos(){
        if(validarEdad()){
            return ("\n" + toString());
        }
        return "Datos del estudiante: ";
    }
    @Override
    public String toString() {
        return "Datos del estudiante: " +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", correo='" + getCorreo() + '\'' +
                ", curso='" + curso + '\'' +
                ", matricula=" + matricula;
    }
}
