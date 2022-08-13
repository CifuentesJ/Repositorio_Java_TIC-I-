public class Ejecutable {

    public static void main(String[] args) {
       
        Persona p1=new Persona("Juan","Perez",45);
        System.out.println("Nombre: "+p1.getNombre());
        System.out.println("Edad: "+p1.getEdad());
        p1.setEdad(23);
        System.out.println("Edad: "+p1.getEdad());
        p1.esMayor();
        
        Estudiante est1=new Estudiante("Pedro","Rojas",15);
        est1.setCodigo(123);
        est1.setNotaFinal(4.8f);
        est1.mostrarDatos();
        est1.esMayor();
        
        Estudiante est2=new Estudiante();
        est2.mostrarDatos();
        est2.setNombre("Maria");
        est2.setApellido("Sanchez");
        est2.setEdad(20);
        est2.setCodigo(234);
        est2.setNotaFinal(3.2f);
        est2.mostrarDatos();
        est2.esMayor();
    }
    
}