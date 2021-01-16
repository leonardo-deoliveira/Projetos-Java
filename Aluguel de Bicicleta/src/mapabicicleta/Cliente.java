package mapabicicleta;

/**
 *
 * @author Leonardo
 */

import java.util.Scanner;

public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;
    private int codigo;
    
    
    
   public Cliente() {
    }
    
    public Cliente(String nome, String cpf, int codigo, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.codigo = codigo;
        this.telefone = telefone;
    }
    
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
      public void addCliente(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome do Cliente:");
        this.setNome(scan.next());
        System.out.println("Digite o CPF:");
        this.setCpf(scan.next());
        System.out.println("Digite o telefone do Cliente:");
        this.setTelefone(scan.next());
        System.out.println("Digite o codigo do Cliente:");
        this.setCodigo(scan.nextInt());
        System.out.println("Cadastro realizado com sucesso!");
        System.out.println();
    }
      
    public void listarCliente(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());    
        System.out.println("Telefone: " + this.getTelefone());
        System.out.println("Codigo: " + this.getCodigo());
        System.out.println("------------");
    }
    
}

