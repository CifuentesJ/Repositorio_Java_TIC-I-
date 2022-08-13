package paquete;
public class Prin {
    public static void main(String[] args) throws Exception {
        
        Vehiculo2 mio = new Vehiculo2("LAJ934", "Chevrolet", "2007");
        System.out.println(mio.mostrarDatos());
        System.out.println();

        Vehiculo2 dep = new VehiculoDeportivo("DFT573", "Renault", "2012", 1600);
        System.out.println(dep.mostrarDatos());
        System.out.println();

        Vehiculo2 fur = new VehiculoFurgoneta("FCX590", "Nissan", "2010", 2000);
        System.out.println(fur.mostrarDatos());
    }
}
