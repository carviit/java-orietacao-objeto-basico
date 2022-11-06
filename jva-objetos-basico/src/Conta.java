public class Conta {
    
    double saldo;
    int agencia;
    int numero;
    String nomeTitular;

    void deposito(double valor){

        saldo += valor;

    }

    void saque(double valor){

      saldo-=valor;

    }

}
