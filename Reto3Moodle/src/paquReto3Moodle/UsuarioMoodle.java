package paquReto3Moodle;

public class UsuarioMoodle {
    private String nombreCompleto, documentoIdentidad, password, correo, descripcion;

    public UsuarioMoodle(String nombreCompleto,String documentoIdentidad,String password,String correo, String descripcion) {
        this.nombreCompleto = nombreCompleto;
        this.descripcion = descripcion;
        this.documentoIdentidad = documentoIdentidad;
        this.password = password;
        this.correo = correo;
        this.descripcion = descripcion;
    }
    
    public String getNombreCompleto(){
        return this.nombreCompleto;
    }
    public String getDocumentoIdentidad(){
        return this.documentoIdentidad;
    }
    public String getPassword(){
        return this.password;
    }
    public String getCorreo(){
        return this.correo;
    }
    public String getDescripcion(){
        return this.descripcion;
    }

    public void setNombreCompleto(String nombreCompleto){
        this.nombreCompleto = nombreCompleto;
    }
    public void setDocumentoIdentidad(String documentoIdentidad){
        this.documentoIdentidad = documentoIdentidad;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setCorreo(String correo){
        this.correo = correo;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }


    public void editarPerfil(String nombreCompleto,String documentoIdentidad,String password,String correo, String descripcion) {
        this.nombreCompleto = nombreCompleto;
        this.descripcion = descripcion;
        this.documentoIdentidad = documentoIdentidad;
        this.password = password;
        this.correo = correo;
        this.descripcion = descripcion;
    }



}
