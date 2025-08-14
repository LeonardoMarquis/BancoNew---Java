package Banco;


public class Conta{
    private int numero;
    private double saldo;


    public Conta(int numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }



    public int get_numero(){
        return numero;
    }
    public double get_saldo(){
        return saldo;
    }

    public void credito(double valor){
        saldo += valor;
    }

    public void debito(double valor){
        saldo -= valor;
    }
}