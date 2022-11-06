public class Conta {
    
    double saldo;
    int agencia;
    int numero;
    String nomeTitular;

    public void deposito(double valor){

        this.saldo += valor;

    }

    public void saque(double valor){

        this.saldo -= valor;
        
    }

}
