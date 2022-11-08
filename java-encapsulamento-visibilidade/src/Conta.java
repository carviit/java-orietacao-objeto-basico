public class Conta {
    
    private int numero;
    private int agencia;
    private double saldo;
    private Cliente titular;
        
    public void deposito(double valor){

        if(valor > 0){     

            this.saldo += valor;

        } else{

            System.out.println("\nValor inválido");
        }
    }

    public void saque(double valor){

        if((this.saldo >= valor) && (valor > 0)){
 
            this.saldo -= valor;

        }else{

            System.out.println("\nVocẽ não possui R$ " + valor + " em sua conta bancária");

            System.out.println("\nSaldo = R$ " + this.saldo);

        }
    }

    public double getSaldo(){

        return this.saldo;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getAgencia() {
        return agencia;
    }



}   
