public class Producto {
    
    private int codigo, inventario;
    private String nombre;
    private float precio;
    private String categoria;
    private boolean disponible;


    public Producto(){

    }
    public Producto(int codigo, String nombre, float precio, int inventario, String categoria, boolean disponible){
        this.codigo = codigo;
        this.inventario = inventario;
        this.nombre = nombre;
        this.precio = (float)precio;
        this.categoria = categoria;
        this.disponible = disponible;
    }


    public int getCodigo(){
        return this.codigo;
    }
    public int getInventario(){
        return this.inventario;
    }
    public String getNombre(){
        return this.nombre;
    }
    public float getPrecio(){
        return this.precio;
    }
    public String getCategoria(){
        return this.categoria;
    }
    public boolean isDisponible(){
        return this.disponible;
    }


    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public void setInventario(int inventario){
        this.inventario = inventario;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setPrecio(float precio){
        this.precio = precio;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }

    public String mostrarDatos(){
        String datos = "";
        datos = "Código: "+this.codigo+
                "\nNombre: "+this.nombre+
                "\nPrecio: "+this.precio+
                "\nInventario: "+this.inventario;

        return datos;
    }
}
