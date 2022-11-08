import java.util.Scanner;

public class CriaConta {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Conta primeiraConta = new Conta();

        Conta segundaConta = new Conta();

        int opc;
        double valor;

        System.out.print("Digite o seu nome: ");
        primeiraConta.nomeTitular = input.nextLine();

        System.out.print("\n" + "Digite o número da conta bancária: ");
        primeiraConta.numero = input.nextInt();

        System.out.print("\n" + "Digite o número da sua agência: ");
        primeiraConta.agencia = input.nextInt();

        System.out.print("\n" + "Digite o saldo da sua conta bancária: ");
        primeiraConta.saldo = input.nextDouble();

        System.out.println("\nDigite a operação que deseja realizar\n");

        System.out.println("1 - SAQUE");
        System.out.println("2 - DEPÓSITO");
        System.out.println("3 - TRANSFERÊNCIA");

        System.out.print("\n\nOPÇÃO : ");
        
        opc = input.nextInt();

        switch(opc){

            case 1:
                System.out.print("\nDigite o valor para sacar: ");
                valor =  input.nextDouble();

                primeiraConta.saque(valor);

                break;

            case 2:
                System.out.print("\nDigite o valor para depositar: ");
                valor =  input.nextDouble();

                primeiraConta.deposito(valor);

                break;

            case 3:
                System.out.print("\nDigite o valor para transferência: ");
                valor =  input.nextDouble();

                primeiraConta.transfere(valor, segundaConta);
                System.out.println("\nSaldo da SEGUNDA CONTA = R$ " + segundaConta.saldo);
                System.out.println("Saldo da PRIMEIRA CONTA = R$ " + primeiraConta.saldo);

        input.close();
        
        }   
    }

}
