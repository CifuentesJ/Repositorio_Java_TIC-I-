package paquReto2RepMusica;

public class ReproductorMusica {
    private String[] canciones;
    private int[] cancionesFavoritas;
    private Boolean pausado = true;
    private int cancionReproduciendo = 0;


    public ReproductorMusica(String[] canciones){
        this.canciones = canciones;
        this.cancionesFavoritas = new int[canciones.length];
        for(int i=0; i<canciones.length; i++){
            cancionesFavoritas[i] = -1;
        }
    }


    public String[] getCanciones(){
        return this.canciones;
    }
    public int[] getCancionesFavoritas(){
        return this.cancionesFavoritas;
    }
    public int getCancionReproduciendo(){
        return this.cancionReproduciendo;
    }
    public Boolean isPausado(){
        return this.pausado;
    }

    public void setCanciones(String[] canciones){
        this.canciones = canciones;
    }
    public void setCancionesFavoritas(int[] cancionesFavoritas){
        this.cancionesFavoritas = cancionesFavoritas;
    }
    public void setCancionReproduciendo(int cancionReproduciendo){
        this.cancionReproduciendo = cancionReproduciendo;
    }
    public void setPausado(Boolean pausado){
        this.pausado = pausado;
    }


    public void proximaCancion(){
        cancionReproduciendo = (cancionReproduciendo + 1) % canciones.length;
        System.out.println((cancionReproduciendo+1) % canciones.length);
    }
    public void devolverCancion(){
        cancionReproduciendo = (cancionReproduciendo + canciones.length - 1) % canciones.length;
        System.out.println((cancionReproduciendo + canciones.length - 1) % canciones.length);
    }
    public void cambiarEstadoReproduccion(){
        if (pausado == true){
            pausado = false;
        }else{
            pausado = true;
        }
    }
    public void agregarCancionesFavoritas(){
        for(int i = 0; i < cancionesFavoritas.length; i++)
            /*En caso de que encuentre que cancionReproduciendo está en el banco de cancionesFavoritas
            no seguimos buscando espacio libre para agregarla, y salimos del método*/
            if(cancionesFavoritas[i] == cancionReproduciendo)
                break;
            //Pero si no la encontró, y además encuentra un espacio donde añadirlo, lo hace
            else if(cancionesFavoritas[i] == -1){
                cancionesFavoritas[i] = cancionReproduciendo;
                break;
            }                
    }

}
