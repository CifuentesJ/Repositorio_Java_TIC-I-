package paquReto3Partido;

import java.util.Random;

public class Asistente {
    protected String idTiquete, nombreCompleto, direccionResidencia, credenciales;


    public Asistente(String idTiquete, String nombreCompleto, String direccionResidencia){
        this.idTiquete = idTiquete;
        this.nombreCompleto = nombreCompleto;
        this.direccionResidencia = direccionResidencia;
        this.credenciales = "";
    }
    
    public String getIdTiquete(){
        return this.idTiquete;
    }
    public String getNombreCompleto(){
        return this.nombreCompleto;
    }
    public String getDireccionResidencia(){
        return this.direccionResidencia;
    }
    public String getCredenciales(){
        return this.credenciales;

    }
    public void setIdTiquete(String idTiquete){
        this.idTiquete = idTiquete;
    }
    public void setNombreComleto(String nombreCompleto){
        this.nombreCompleto = nombreCompleto;
    }
    public void setDireccionResidencia(String direccionResidencia){
        this.direccionResidencia = direccionResidencia;
    }
    public void setCredenciales(String credenciales){
        this.credenciales = credenciales;
    }
    
    
    public void generarCredenciales(){
        if (this.credenciales.isEmpty()){
            Random alea = new Random();
            int x = alea.nextInt(100000);
            String credencial = String.valueOf(x);
            this.credenciales = credencial;
        }
    }
}
