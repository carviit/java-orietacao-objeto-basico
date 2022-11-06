public class Conta {
    
    double saldo;
    int agencia;
    int numero;
    String nomeTitular;

    public void deposito(double valor){

        if(valor > 0){

            this.saldo += valor;

            System.out.println("\nVocê depositou R$ " + valor);

            System.out.println("\nSaldo = R$ " + this.saldo);

        } else{

            System.out.println("\nValor inválido");
        }
    }

    public boolean saque(double valor){

        if(this.saldo >= valor){

            this.saldo -= valor;

            System.out.println("\nVocê sacou R$ " + valor);

            System.out.println("\nSaldo = R$ " + this.saldo);

            return true;

        }else{

            System.out.println("\nVocẽ não possui R$ " + valor + " em sua conta bancária");

            System.out.println("\nSaldo = R$ " + this.saldo);

            return false;
        }
        

    }

}
