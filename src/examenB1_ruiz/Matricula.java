package examenB1;

public class Matricula {
    private int id;
    private String fecha;

    public int getId(){
        return id;
    }
    public void setFecha(String fecha){
        this.fecha=fecha;
    }

    //Constructores
    public Matricula(int id, String fecha){
        this.id=id;
        this.fecha=fecha;
    }

    //Metodos
    public boolean registrarEvaluacion(){
        if(id>1){
            return true;
        }else{
            return false;
        }
    }

    public String mostrarDetalle(){
        if(registrarEvaluacion()){
            return ("\n" + toString());
        }
        return "Detalle de la Matricula: ";
    }
    @Override
    public String toString() {
        return "Detalle de la Matricula: " +
                ", id='" + id + '\'' +
                ", fecha='" + fecha + '\'';
    }
}
