import java.util.Scanner;

public class Banco {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        Conta novaConta = new Conta();

        Cliente novoCliente = new Cliente();

        novoCliente.setNome("Carlos Vitor");

        novaConta.setNumero(23444);

        novaConta.setAgencia(12);

        novaConta.deposito(100.50);

        novaConta.setTitular(novoCliente);

        novaConta.getTitular().setCpf("777.888.999-55");

        novaConta.getTitular().setProfissao("Caminhoneiro");

        System.out.println("SALDO = R$ " + novaConta.getSaldo());

        System.out.println("NOME = " + novaConta.getTitular().getNome());

        System.out.println("AGÊNCIA = " + novaConta.getAgencia());

        System.out.println("NÚMERO = " + novaConta.getNumero());

        System.out.println("CPF = " + novaConta.getTitular().getCpf());

        System.out.println("PROFISSÃO = " + novaConta.getTitular().getProfissao());

        input.close(); 
     }
     
 }