import java.util.Scanner;

public class Banco {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        Menu tela = new Menu();

        Cliente primeiroCliente = new Cliente();

        Conta primeiraConta = new Conta();

        int opc = 0;

        System.out.print("\nDigite seu nome: ");
        primeiroCliente.nome = input.nextLine();

        System.out.print("\nDigite seu CPF (XXX.ZZZ.YYY-UU): ");
        primeiroCliente.cpf = input.nextLine();

        System.out.print("\nDigite sua profissão: ");
        primeiroCliente.profissao = input.nextLine();


        System.out.print("\n----- CONTA CRIADA COM SUCESSO ---- \n");

        System.out.println("\n Nome: " + primeiroCliente.titular.nome);
        System.out.println(" Profissão: " + primeiraConta.titular.profissao);
        System.out.println(" CPF: " + primeiraConta.titular.cpf);   

        System.out.println("\n-----------------------------");

        /*while(opc!=4){

        System.out.println("\nDigite a operação que deseja realizar\n");

        System.out.println("1 - SAQUE");
        System.out.println("2 - DEPÓSITO");
        System.out.println("3 - TRANSFERÊNCIA");
        System.out.println("4 - FIM");

        System.out.print("\n\nOPÇÃO : ");
        opc = input.nextInt();

        tela.menu(opc);

        }

        System.out.println("--\n Operação FINALIZADA --");

        System.out.println("Nome: " + primeiraConta.titular.nome);
        System.out.println("SALDO = R$ " + primeiraConta.saldo);

        System.out.println("--------------------------------");

        input.close(); */

     }
     
 }
