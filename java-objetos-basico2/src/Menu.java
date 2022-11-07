import java.util.Scanner;

public class Menu {

    Scanner input = new Scanner(System.in);

    Conta primeiraConta;

    double valor;
    
    public void menu(int opc){

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
        }

    }
    
}
