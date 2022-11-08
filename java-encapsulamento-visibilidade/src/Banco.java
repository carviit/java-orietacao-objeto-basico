import java.util.Scanner;

public class Banco {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        Conta novaConta = new Conta();

        novaConta.deposito(100.50);

        System.out.println("SALDO = R$ " + novaConta.pega Saldo());

        input.close(); 
     }
     
 }