package mapabicicleta;

/**
 *
 * @author Leonardo
 */

import java.util.Scanner;
public class MapaBicicleta {
    static Cliente c[] = new Cliente[10];
    static Bicicleta b[] = new Bicicleta[10];
    static Contrato ct[] = new Contrato[10];
    
    public static int contCt = 0;
    public static int contB = 0;
    public static int contC = 0;
    
    public static void listaCliente(){
        for(int i = 0; i < contC; i++){
            c[i].listarCliente();
            System.out.println("----------------------");
        }
    }
    
    public static void listaBicicleta(){
        for(int i = 0; i < contB; i++){
            b[i].listarBicicleta();
            System.out.println("----------------------");
        }
    }
    
     public static void listaContrato(){
        for(int i = 0; i < contCt; i++){
            ct[i].listarContratos();
            System.out.println("----------------------");
        }
    }
    
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int opcao = 1;
        while(opcao!=0){
        System.out.println("----------------");
        System.out.println("Sistema de Alguel de Bicicleta:");
        System.out.println("------------------------");
        System.out.println("1 – Cadastrar Bicicleta");
        System.out.println("2 - Listar Bicicleta");
        System.out.println("3 - Alterar dados de Bicicleta");
        System.out.println("4 – Cadastrar Cliente pessoa Física");
        System.out.println("5 - Listar de Cliente pessoa Física");
        System.out.println("6 - Alterar dados de Cliente pessoa Física");
        System.out.println("7 - Abrir Contrato");
        System.out.println("8 - Listar Contrato");
        System.out.println ("-------------------");
        System.out.println("| 0 - Sair |");
        System.out.print("Escolha uma opção: ");
        opcao = tec.nextInt();
        tec.nextLine();
        
        switch(opcao){
            case 1:
                b[contB] = new Bicicleta();
                b[contB].addBicicleta();
                contB++;
                break;
            case 2:
                listaBicicleta();
                break;
            case 3:
                System.out.println("Listando Bicicletas:");
                System.out.println("-------------------");
                
                for(int i = 0; i < contB; i++){
                    System.out.println("Indice: " + i);
                    b[i].listarBicicleta();              
                }
                
                System.out.println("-------------------");
                System.out.println("Digite o índice que deseja fazer a alteração:");
                
                Scanner scanner = new Scanner(System.in);
                int indice = scanner.nextInt();
                    
                if(indice > contB - 1) {
                        System.out.println("Opção inválida! \n");
                        break;
                }
                
                System.out.println("\nDigite o atributo da bicicleta que deseja fazer a alteração:");
                System.out.println("1- Código");
                System.out.println("2- Cor ");
                System.out.println("3- Tipo ");
                System.out.println("4- Marcha ");
                System.out.println("5- Valor do Aluguel ");
                int atributo = scanner.nextInt();
                
                        
                switch(atributo) {
                    case 1:
                    	System.out.println("\nDigite o novo código da bicicleta:");
                       	b[indice].setCodigoBicicleta(Integer.parseInt(scanner.next()));
                       	System.out.print("Item alterado com sucesso!\n");
                       	break;
                    case 2:
                       	System.out.println("\nDigite a nova cor da bicicleta:");
                       	b[indice].setCor(scanner.next());
                       	System.out.print("Item alterado com sucesso!\n");
                       	break;

                    case 3:
                       	System.out.println("\nDigite o novo tipo de bicicleta:");
                       	b[indice].setTipo(scanner.next());
                       	System.out.print("Item alterado com sucesso!\n");
                       	break;

                    case 4:
                       	System.out.println("\nDigite a nova quantidade de marchas da bicicleta:");
                       	b[indice].setMarcha(scanner.nextInt());
                       	System.out.print("Item alterado com sucesso!\n");
                       	break;

                    case 5:
                       	System.out.print("Digite o novo valor do aluguel: ");
                       	b[indice].setValorAluguel(Double.parseDouble(scanner.next()));
                       	System.out.print("Item alterado com sucesso!\n");
                       	break;

                    default: System.out.println("Opção inválida!\n");
                    }
                break;
            case 4:        
                c[contC] = new Cliente();
                c[contC].addCliente();
                contC++;
                break;
            case 5:
                listaCliente();
                break;
            case 6:
                System.out.println("Listando Clientes:");
                System.out.println("-------------------");
                
                for(int i = 0; i < contC; i++){
                    System.out.println("Indice: " + i);
                    c[i].listarCliente();              
                }
                
                System.out.println("-------------------");
                System.out.println("Digite o índice que deseja fazer a alteração:");
                
                Scanner scanner1 = new Scanner(System.in);
                int indice1 = scanner1.nextInt();
                    
                if(indice1 > contC - 1) {
                        System.out.println("Opção inválida! \n");
                        break;
                }
                
                System.out.println("\nDigite o dado do cliente que deseja alteração:");
                System.out.println("1- Nome");
                System.out.println("2- CPF ");
                System.out.println("3- Telefone");
                System.out.println("4- Codigo");
                int atributo1 = scanner1.nextInt();
                
                        
                switch(atributo1) {
                    case 1:
                    	System.out.println("Digite o nome:");
                       	c[indice1].setNome(scanner1.next());
                       	System.out.print("Item alterado com sucesso!\n");
                       	break;
                    case 2:
                       	System.out.println("Digite o CPF:");
                       	c[indice1].setCpf(scanner1.next());
                       	System.out.print("Item alterado com sucesso!\n");
                       	break;
                        
                    case 3:
                       	System.out.println("Digite o novo Telefone:");
                       	c[indice1].setTelefone(scanner1.next());
                       	System.out.print("Item alterado com sucesso!\n");
                       	break;       
                    
                    case 4:
                       	System.out.println("Digite o novo Codigo:");
                       	c[indice1].setCodigo(scanner1.nextInt());
                       	System.out.print("Item alterado com sucesso!\n");
                       	break;

                    default: System.out.println("Opção inválida!\n");
                    }
                break;
            case 7:        
                ct[contCt] = new Contrato();
                ct[contCt].novoContrato();
                contCt++;
                break;
            case 8:
                listaContrato();
                break;
            default:
            System.exit(0);
    
        }
    }
    
    }
}

