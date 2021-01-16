package poligono;

import java.util.Scanner;
public class Triangulo extends Poligono {
    private double altura;
    private double base;
    
    public Triangulo(){
        this.setQuantidadeLados(3);
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public double getAltura(){
        return this.altura;
    }
    
    public void setBase(double base){
        this.base = base;
    }
    
    public double getBase(){
        return this.base;
    }  
    
    @Override
    public double calculaArea(){
        double calculaArea = (this.getBase() * this.getAltura()) / 2;
        return calculaArea;
    }
   
    
    public void definaArea() {
       Scanner scan = new Scanner(System.in);
       System.out.println("Digite a Altura do Triangulo em Centímetro:");
       this.setAltura(scan.nextDouble());
       System.out.println("Digite a Base do Triangulo em Centímetro:");
       this.setBase(scan.nextDouble());
       System.out.println("---------------");
    }
    
    public void imprimir(){
        System.out.println("Isto é um Triângulo");
        System.out.println("A quantidade de lados é: " + this.getQuantidadeLados());
        System.out.println("Sua altura é: " + this.getAltura() + "cm e sua base é: " + this.getBase() + "cm");
        System.out.println("e sua area total é: " + this.calculaArea() + "cm²");
        System.out.println("---------------");
    }
    
}
