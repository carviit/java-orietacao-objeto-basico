public class Conta {
    
    private double saldo;
    Cliente titular;
        
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

    public double pegaSaldo(){

        return this.saldo;
    }

}   
