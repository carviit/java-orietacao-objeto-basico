import java.util.Scanner;

public class Banco {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
 
        Conta novaConta = new Conta(2344, 12);

        Conta segundaConta = new Conta(2345, 545);

        Conta terceiraConta = new Conta(4758, 456);

        Cliente novoCliente = new Cliente();

        novoCliente.setNome("Carlos Vitor");

        //novaConta.setNumero(23444);

        //novaConta.setAgencia(12);

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

        System.out.println("NÚMERO DE CONTAS = " + Conta.getTotal());

        input.close(); 
     }
     
 }