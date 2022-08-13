public class TurnoVirtual{
    private String[] turnos, turnosPerdidos;
    private Boolean estadoTurnoVirtual = true;
    private int turnoEnAtencion = 0, cantidadTurnosAtendidos = 1;


    public TurnoVirtual(){
    }
    public TurnoVirtual(String[] turnos){
        this.turnos = turnos;
        turnosPerdidos = new String[turnos.length];
        for (int i=0; i<turnos.length; i++){
            turnosPerdidos[i] = " ";
        }
    }


    public String[] getTurnos(){
        return this.turnos;
    }
    public String[] getTurnosPerdidos(){
        return this.turnosPerdidos;
    }
    public Boolean isEstadoTurnoVirtual(){
        return this.estadoTurnoVirtual;
    }
    public int getTurnoEnAtencion(){
        return this.turnoEnAtencion;
    }
    public int getCantidadTurnosAtendidos(){
        return this.cantidadTurnosAtendidos;
    }


    public void setTurnos(String[] turnos){
        this.turnos = turnos;
    }
    public void setTurnosPerdidos(String[] turnosPerdidos){
        this.turnosPerdidos = turnosPerdidos;
    }
    public void setEstadoTurnoVirtual(Boolean estadoTurnoVirtual){
        this.estadoTurnoVirtual = estadoTurnoVirtual;
    }
    public void setTurnoEnAtencion(int turnoEnAtencion){
        this.turnoEnAtencion = turnoEnAtencion;
    }
    public void setCantidadTurnosAtendidos(int cantidadTurnosAtendidos){
        this.cantidadTurnosAtendidos = cantidadTurnosAtendidos;
    }


    public void atenderProximoTurno(){
        if (estadoTurnoVirtual == true){
            turnoEnAtencion++;
            cantidadTurnosAtendidos++;
        } 
    }
    public void agregarTurnoPerdido(){
        for (int i = 0; i < turnosPerdidos.length; i++) {
            if (" ".equals(turnosPerdidos[i])) {
                turnosPerdidos[i] = turnos[turnoEnAtencion];
                break;
            }
        }
    }
    public void cambiarEstadoTurno(){
        if (estadoTurnoVirtual == true){
            estadoTurnoVirtual = false;
        } else{
            estadoTurnoVirtual = true;
        }
    }

}