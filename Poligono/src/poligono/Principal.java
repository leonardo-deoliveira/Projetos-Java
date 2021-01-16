
package poligono;

public class Principal {
    public static void main(String[] args){
        Triangulo tri = new Triangulo();
        
        tri.definaArea();
        tri.imprimir();
        
        
        Retangulo ret = new Retangulo();
        
        ret.definaArea();
        ret.imprimir();
       
    }
}
