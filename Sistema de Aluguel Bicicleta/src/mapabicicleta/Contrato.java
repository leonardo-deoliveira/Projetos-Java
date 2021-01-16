package mapabicicleta;

/**
 *
 * @author Leonardo
 */
import static mapabicicleta.MapaBicicleta.b;
import static mapabicicleta.MapaBicicleta.c;
import static mapabicicleta.MapaBicicleta.contC;
import static mapabicicleta.MapaBicicleta.contB;

import java.util.Scanner;

public class Contrato {
    private int codContrato;
    private double valorContrato;
    private Bicicleta bicicleta = new Bicicleta();
    private Cliente cliente = new Cliente();
    
    public int getCodContrato(){
        return codContrato;
    }
    
    public void setCodContrato(int codContrato){
        this.codContrato = codContrato;
    }
    
    public double getValorContrato(){
        return valorContrato;
    }
    
    public void setValorContrato(double valorContrato){
        this.valorContrato = valorContrato;
    }
    
    public Cliente getCliente(){
        return cliente;
    }
    
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    
     public Bicicleta getBicicleta(){
        return bicicleta;
    }
    
    public void setBicicleta(Bicicleta bicicleta){
        this.bicicleta = bicicleta;
    }
    
    public void novoContrato(){
        Scanner cad = new Scanner(System.in);
        int codCliente, codBicicleta;
        System.out.println("---------------");
        System.out.println("Relação de Clientes");
        for (int i = 0;i < contC; i++){
            System.out.println("Indice: " + i);
            c[i].listarCliente();
            System.out.println();
            System.out.println("----------------------");
        }
        System.out.println("Escolha um Cliente(Indice)");
        codCliente = cad.nextInt();
        this.setCliente(c[codCliente]);
        cad.nextLine();
        
        System.out.println("---------------");
        System.out.println("Relação das Bicicletas");
        for (int i = 0;i < contB; i++){
            System.out.println("Indice: " + i);
            b[i].listarBicicleta();
            System.out.println();
        }
        System.out.println("Escolha uma Bicicleta(Indice)");
        codBicicleta = cad.nextInt();
        this.setBicicleta(b[codBicicleta]);
        cad.nextLine();
        
        System.out.println("---------------");
        System.out.println("Digite o código do Contrato:");
        this.setCodContrato(cad.nextInt());
        cad.nextLine();
        
        System.out.println("---------------");
        System.out.println("Digite o valor do Contrato:");
        this.setValorContrato(Double.parseDouble(cad.next()));
                
        System.out.println("Cadastro realizado com sucesso!");
        System.out.println();
    }
    
     public void listarContratos(){
        System.out.println("Codigo: " + this.getCodContrato());
        System.out.println("Nome: " + this.getCliente().getNome());    
        System.out.println("Bicicleta: " + this.getBicicleta().getTipo());
        System.out.println("Valor Contrato: R$" + this.getValorContrato());
        System.out.println("------------");
    }
}
