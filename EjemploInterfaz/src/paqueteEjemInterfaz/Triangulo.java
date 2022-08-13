public class Triangulo {
    private int ladoA, ladoB, ladoC;
    private String tipo, rutaImagen;

    public Triangulo(int ladoA, int ladoB, int ladoC){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }


    public int getLadoA(){
        return this.ladoA;
    }
    public int getLadoB(){
        return this.ladoB;
    }
    public int getLadoC(){
        return this.ladoC;
    }
    public String getTipo(){
        return this.tipo;
    }
    public String getRutaImagen(){
        return this.rutaImagen;
    }
    
    public void setLadoA(int ladoA){
        this.ladoA = ladoA;
    }
    public void setLadoB(int ladoB){
        this.ladoA = ladoB;
    }
    public void setLadoC(int ladoC){
        this.ladoA = ladoC;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setRutaImagen(String rutaImagen){
        this.rutaImagen= rutaImagen;
    }

    
    public void tipoTriangulo(){
        if (ladoA>0 && ladoB>0 && ladoC>0){
            if(ladoA==ladoB && ladoB==ladoC){
                tipo="Equilátero";
            } else if(ladoA!=ladoB && ladoA!=ladoC && ladoB!=ladoC){
                tipo="Escaleno";
            } else{
                tipo="Isósceles";
            }
        } else{
            tipo = "No es un triángulo";
        }
    }

}
