
public class PrincipalVehiculos {
    public static void main(String[] args) throws Exception {
        
        Vehiculo carro1 = new Vehiculo();
        Vehiculo carro2 = new Vehiculo("LAJ934", "ROJO", "Chevrolet","Detenido",2005,0,1600);

        System.out.println(carro1.getCilindraje());

        carro2.arrancar();
        System.out.println("Estado del carro 2: "+carro2.getEstado());
        carro2.acelerar();
        System.out.println("Velocidad del carro 2: "+carro2.getVelocidad());
        carro2.acelerar();
        System.out.println("Velocidad del carro 2: "+carro2.getVelocidad());
        carro2.acelerar();
        carro2.acelerar();
        carro2.acelerar();
        carro2.acelerar();
        System.out.println("Velocidad del carro 2: "+carro2.getVelocidad());

        carro1.frenar();

        carro2.frenar();
        System.out.println("Velocidad del carro 2: "+carro2.getVelocidad());
        carro2.frenar();
        carro2.frenar();
        carro2.frenar();
        carro2.frenar();
        System.out.println("Estado del carro 2: "+carro2.getEstado());
        System.out.println("Velocidad del carro 2: "+carro2.getVelocidad());
        carro2.detener();
        System.out.println("Velocidad del carro 2: "+carro2.getVelocidad());
        System.out.println("Estado del carro 2: "+carro2.getEstado());
    }
}
