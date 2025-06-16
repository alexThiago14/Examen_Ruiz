package examenB1;

public class Evaluacion {
    private int id;
    private String fecha;
    private int id_matricula;
    private double calificacion;

    public int getId(){
        return id;
    }
    public void setFecha(String fecha){
        this.fecha=fecha;
    }

    public int getMatricula(){
        return id_matricula;
    }
    public void setMatricula(int id_matricula){
        this.id_matricula=id_matricula;
    }

    public double getCalificacion(){
        return calificacion;
    }
    public void setCalificacion(double calificacion){
        this.calificacion=calificacion;
    }



    //Constructores
    public Evaluacion(int id, String fecha, int id_matricula, double calificacion){
        this.id=id;
        this.fecha=fecha;
        this.id_matricula=id_matricula;
        this.calificacion=calificacion;
    }

    //Metodos
    public String getTesultados(){
        return "Resultados: ";
    }
    @Override
    public String toString() {
        return "Resultados: " +
                ", id_evaluacion='" + id + '\'' +
                ", fecha='" + fecha + '\'' +
                ", id_matricula=" + id_matricula +
                ", calificacion='" + calificacion + '\'';
    }
}

