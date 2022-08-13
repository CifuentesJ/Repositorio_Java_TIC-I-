package paquReto3Partido;

import java.util.Random;

public class VIP extends Asistente{
    private boolean[] pantallas = new boolean[]{false, false, false};
    private String credencialesPrevia = "";

    public VIP(String idTiquete, String nombreCompleto, String direccionResidencia){
        super(idTiquete, nombreCompleto, direccionResidencia);
    }

    public boolean[] getPantallas(){
        return this.pantallas;
    }
    public String getCredencialesPrevia(){
        return this.credencialesPrevia;
    }
    public void setPantallas(boolean[] pantallas){
        this.pantallas = pantallas;
    }
    public void setCredencialesPrevia(String credencialesPrevia){
        this.credencialesPrevia = credencialesPrevia;
    }

    public void generarCredencialesPrevia(){
        if (this.credencialesPrevia.isEmpty() == true){
            Random x = new Random();
            int alea = x.nextInt(100000);
            setCredencialesPrevia(String.valueOf(alea));
        }
    }
    public void asignarPantalla(int pantalla){
        pantalla -= 1;
        if(pantalla>-1 && pantalla<3){
            if(this.pantallas[pantalla] == true){
                this.pantallas[pantalla] = false;
            }else{
                this.pantallas[pantalla] = true;
            }
        }
    }

}
