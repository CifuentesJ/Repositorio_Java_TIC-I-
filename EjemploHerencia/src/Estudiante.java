public class Estudiante extends Persona{
    
    private int codigo;
    private float notaFinal;

    public Estudiante(int codigo, float notaFinal, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad); //Atributos que hereda de la superclase
        this.codigo = codigo;
        this.notaFinal = notaFinal;
    }

    public Estudiante(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    public Estudiante() {
    }
    
    
    public void mostrarDatos(){
        System.out.println("Nombre: "+this.getNombre()
                +"\nApellido: "+this.getApellido()
                +"\nEdad: "+this.getEdad()
                +"\nCodigo: "+this.codigo
                +"\nNota final: "+this.notaFinal
        );
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(float notaFinal) {
        this.notaFinal = notaFinal;
    }

    
}