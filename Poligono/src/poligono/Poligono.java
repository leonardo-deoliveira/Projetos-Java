package poligono;

public abstract class Poligono {
    private int quantidadeLados;
     
    public void setQuantidadeLados(int quantidadeLados){
        this.quantidadeLados = quantidadeLados;
       
    }
    
    public int getQuantidadeLados(){
        return this.quantidadeLados;
    }
    
       
    public abstract double calculaArea();
}
