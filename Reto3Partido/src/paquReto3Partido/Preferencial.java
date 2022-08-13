package paquReto3Partido;

public class Preferencial extends Asistente{
    private boolean participaSorteo = false;


    public Preferencial(String idTiquete, String nombreCompleto, String direccionResidencia){
        super(idTiquete, nombreCompleto, direccionResidencia);
    }


    public boolean isParticipaSorteo(){
        return this.participaSorteo;
    }
    public void setParticipaSorteo(boolean participaSorteo){
        this.participaSorteo = participaSorteo;
    }


    public void participarSorteo(){
        if (isParticipaSorteo() == true){
            setParticipaSorteo(false);
        }else{
            setParticipaSorteo(true);
        }
    }
}
