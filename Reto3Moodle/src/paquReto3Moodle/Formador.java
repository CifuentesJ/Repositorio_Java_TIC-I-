package paquReto3Moodle;

public class Formador extends UsuarioMoodle{
    public String escalafon;


    public Formador( String escalafon, String nombreCompleto,String documentoIdentidad,String password,String correo, String descripcion){
        super(nombreCompleto, documentoIdentidad, password, correo, descripcion);
        this.escalafon = escalafon;
    }


    public String getEscalafon(){
        return this.escalafon;
    }

    public void setEscalafon(String escalafon){
        this.escalafon = escalafon;
    }


    public void calificar(Tripulante tripulanteACalificar, int k){
        boolean[] entregas = tripulanteACalificar.getEntregas();
        double[] calificaciones = tripulanteACalificar.getCalificaciones();
        k -= 1;
        if (entregas[k] == false){
            calificaciones[k] = 0;
        }else{
            calificaciones[k] = 5;
        }
        tripulanteACalificar.setCalificaciones(calificaciones);
        
    }


}
