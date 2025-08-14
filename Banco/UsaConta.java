package Banco;

public class UsaConta{

    public static void main(String[] args){

        Conta c1 = new Conta(0001, 0);
        c1.credito(30);


        System.out.println("\n==========================================");

        System.out.println("\nConta: " + c1.get_numero() +"\nSaldo" + c1.get_saldo());


    }
}