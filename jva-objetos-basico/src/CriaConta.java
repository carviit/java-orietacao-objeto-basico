public class CriaConta {
    public static void main(String[] args) {
        
        Conta primeiraConta = new Conta();

        primeiraConta.saldo = 200;

        primeiraConta.saldo += 250;

        Conta segundaConta = new Conta();  

        segundaConta.saldo = 50;

        System.out.println("Saldo Primeira Conta = $ " + primeiraConta.saldo);
        
        System.out.println("Saldo Segunda Conta = $ " + segundaConta.saldo);

        Conta terceiraConta = segundaConta;

        System.out.println(terceiraConta.saldo);
    

    }
}
