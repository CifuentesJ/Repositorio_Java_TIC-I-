package paquRetoPeaje;

public class Peaje {
    private String[] filaCoches, cochesFlyPass;
    private int cantidadCochesAtendidos = 1, cocheEnAtencion = 0;
    private Boolean estadoPeaje = true;


    public Peaje(String[] filaCoches){
        this.filaCoches = filaCoches;
        this.cochesFlyPass = new String[filaCoches.length];
        for (int i=0; i<filaCoches.length; i++){
            cochesFlyPass[i]=" ";
        }
    }


    public String[] getFilaCoches(){
        return this.filaCoches;
    }
    public String[] getCochesFlyPass(){
        return this.cochesFlyPass;
    }
    public int getCantidadCochesAtendidos(){
        return this.cantidadCochesAtendidos;
    }
    public int getCocheEnAtencion(){
        return this.cocheEnAtencion;
    }
    public Boolean isEstadoPeaje(){
        return this.estadoPeaje;
    }

    public void setFilaCoches(String[] filaCoches){
        this.filaCoches = filaCoches;
    }
    public void setCochesFlyPass(String[] cochesFlyPass){
        this.cochesFlyPass = cochesFlyPass;
    }
    public void setCantidadCochesAtendidos(int cantidadCochesAtendidos){
        this.cantidadCochesAtendidos = cantidadCochesAtendidos;
    }
    public void setCocheEnAtencion(int cocheEnAtencion){
        this.cocheEnAtencion = cocheEnAtencion;
    }
    public void setEstadoPeaje(Boolean estadoPeaje){
        this.estadoPeaje = estadoPeaje;
    }
    



    public void proximoCoche(){
        if (this.estadoPeaje == true){
            cocheEnAtencion++;
            cantidadCochesAtendidos++;
        }
    }
    /*public void agregarCocheFlyPass(){
        String cocheABuscar = filaCoches[cocheEnAtencion];
        for(String coche: cochesFlyPass){
            if (coche.equals(cocheABuscar)){
                break;
            } 
            if(" ".equals(coche)){
                coche = cocheABuscar;
            }
        }
    }*/
    public void agregarCocheFlyPass(){
        String cocheABuscar = filaCoches[cocheEnAtencion];
        for(int i=0; i<filaCoches.length; i++){
            if(cocheABuscar.equals(cochesFlyPass[i])){
                break;
            }
            if(" ".equals(cochesFlyPass[i])){
                cochesFlyPass[i] = cocheABuscar;
                break;
            }
        }
    }
    public void cambiarEstadoPeaje(){
        if (this.estadoPeaje == true){
            this.estadoPeaje = false;
        } else{
            this.estadoPeaje = true;
        }
    }


}
