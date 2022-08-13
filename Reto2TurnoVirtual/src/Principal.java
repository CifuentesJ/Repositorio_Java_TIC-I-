public class Principal {
    public static void main(String[] args){
        String[] cola = {"A0", "A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9", "A10", "A11"};

        TurnoVirtual ejemplo = new TurnoVirtual(cola);

        ejemplo.atenderProximoTurno();
        ejemplo.atenderProximoTurno();
        ejemplo.atenderProximoTurno();
        ejemplo.atenderProximoTurno();

        ejemplo.agregarTurnoPerdido();
        ejemplo.atenderProximoTurno();
        ejemplo.agregarTurnoPerdido();
        ejemplo.atenderProximoTurno();
        ejemplo.agregarTurnoPerdido();

        ejemplo.cambiarEstadoTurno();
        ejemplo.atenderProximoTurno();
        ejemplo.cambiarEstadoTurno();


        for (int i=0; i<ejemplo.getTurnos().length; i++){
            System.out.print(ejemplo.getTurnos()[i]+" ");
        }
        System.out.println();
        for (int i=0; i<ejemplo.getTurnos().length; i++){
            System.out.print(ejemplo.getTurnosPerdidos()[i]+" ");
        }
        System.out.println();
        System.out.println(ejemplo.isEstadoTurnoVirtual());
        System.out.println(ejemplo.getTurnoEnAtencion());
        System.out.println(ejemplo.getCantidadTurnosAtendidos());


    }
}
