package mapabicicleta;

/**
 *
 * @author Leonardo
 */
import java.util.Scanner;
public class Bicicleta {
    private int codigoBicicleta;
    private String cor;
    private String tipo;
    private int marcha;
    private double valorAluguel;
        
    public void setCodigoBicicleta(int codigoBicicleta) {
        this.codigoBicicleta = codigoBicicleta;
    }
    
    public int getCodigoBicicleta() {
        return codigoBicicleta;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public String getCor() {
        return cor;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }
    
    public int getMarcha() {
        return marcha;
    }
    
    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }
    
    public double getValorAluguel() {
        return valorAluguel;
    }
    
    public void addBicicleta(){
        Scanner add = new Scanner(System.in);
        System.out.println("Digite o Código da Bicicleta:");
        this.setCodigoBicicleta(add.nextInt());
        System.out.println("Digite a cor:");
        this.setCor(add.next());
        System.out.println("Digite o tipo de Bicicleta:");
        this.setTipo(add.next());
        System.out.println("Digite a quantidade de Marcha:");
        this.setMarcha(add.nextInt());
        System.out.println("Digite o valor do Aluguel:");
        this.setValorAluguel(Double.parseDouble(add.next()));
        System.out.println("Cadastro realizado com sucesso!");
        System.out.println();
    }
    
    public void listarBicicleta(){
        System.out.println("Codigo: " + this.getCodigoBicicleta());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Tipo: " + this.getTipo());    
        System.out.println("Marchas: " + this.getMarcha());
        System.out.println("Valor do Aluguel: R$" + this.getValorAluguel());
        System.out.println("------------");
    }
    
    
}

