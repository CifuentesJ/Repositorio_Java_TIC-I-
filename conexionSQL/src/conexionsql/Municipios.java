package conexionsql;

public class Municipios {
    private String codigo;
    private String nombre;
    private String departamento;

    public Municipios() {
    }
    public Municipios(String codigo, String nombre, String departamento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.departamento = departamento;
    }

    
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    
    public String mostrar() {
        return "<html><body>Código= " + codigo + "<br>Nombre= " + nombre + "<br>Departamento= " + departamento + "<body><html>";
    }

    @Override
    public String toString(){
        return nombre+", "+departamento;
    }
    


}
