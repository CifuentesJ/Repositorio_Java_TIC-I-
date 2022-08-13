package paquReto3Moodle;

public class Tripulante extends UsuarioMoodle{
    private double[] calificaciones;
    private boolean[] entregas;


    public Tripulante(String nombreCompleto,String documentoIdentidad,String password,String correo, String descripcion, int n){
        super(nombreCompleto, documentoIdentidad, password, correo, descripcion);
        this.calificaciones = new double[n];
        this.entregas = new boolean[n];
        for (int i=0; i<n; i++){
            this.calificaciones[i] = 0;
            this.entregas[i] = false;
        }
    }


    public double[] getCalificaciones(){
        return this.calificaciones;
    }
    public void setCalificaciones(double[] calificaciones){
        this.calificaciones = calificaciones;
    }
    public boolean[] getEntregas(){
        return this.entregas;
    }
    public void setEntregas(boolean[] entregas){
        this.entregas = entregas;
    }


    public void resolverReto(int retoAEntregar){
        retoAEntregar -= 1;
        this.entregas[retoAEntregar] = true;
    }






}
