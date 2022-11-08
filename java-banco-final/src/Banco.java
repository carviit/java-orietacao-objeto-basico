import java.util.Scanner;

public class Banco {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        Cliente primeiroCliente = new Cliente();

        int opc = 0;

        double valor;

        System.out.print("\nDigite seu nome: ");
        primeiroCliente.nome = input.nextLine();

        System.out.print("\nDigite seu CPF (XXX.ZZZ.YYY-UU): ");
        primeiroCliente.cpf = input.nextLine();

        System.out.print("\nDigite sua profissão: ");
        primeiroCliente.profissao = input.nextLine();

        Conta primeiraConta = new Conta();

        primeiraConta.titular = primeiroCliente;

        System.out.print("\n----- CONTA CRIADA COM SUCESSO ---- \n");

        System.out.println("\n Nome: " + primeiraConta.titular.nome);
        System.out.println(" Profissão: " + primeiraConta.titular.profissao);
        System.out.println(" CPF: " + primeiraConta.titular.cpf);   

        System.out.println("\n-----------------------------");

        do {

            System.out.println("\nDigite a operação que deseja realizar\n");
            System.out.println("1 - SAQUE");
            System.out.println("2 - DEPÓSITO");
            System.out.println("3 - FIM");
            System.out.print("\n\nOPÇÃO : ");
            opc = input.nextInt();

            if(opc == 1){

                System.out.print("\nDigite o valor para sacar: ");
                valor =  input.nextDouble();

                primeiraConta.saque(valor);

            } else if(opc == 2){

                System.out.print("\nDigite o valor para depositar: ");
                valor =  input.nextDouble();

                primeiraConta.deposito(valor);
                
            } 
            
        }while(opc!=3);

        System.out.println("\n-- Operação FINALIZADA --");
        System.out.println("Nome: " + primeiraConta.titular.nome);
        System.out.println("SALDO = R$ " + primeiraConta.saldo);
        System.out.println("--------------------------------");

        input.close(); 
     }
     
 }