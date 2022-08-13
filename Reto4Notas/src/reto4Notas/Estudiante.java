package reto4Notas;

public class Estudiante {
    private String nombreCompleto, documentoIdentidad;
    private double nota;
    private int grado, edad;

    
    public Estudiante(String nombreCompleto, String documentoIdentidad, double nota, int grado, int edad) {
        this.nombreCompleto = nombreCompleto;
        this.documentoIdentidad = documentoIdentidad;
        this.nota = nota;
        this.grado = grado;
        this.edad = edad;
    }


    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }
    public double getNota() {
        return nota;
    }
    public int getGrado() {
        return grado;
    }
    public int getEdad() {
        return edad;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }
    public void setGrado(int grado) {
        this.grado = grado;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    


}
