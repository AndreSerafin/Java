package entities;

public class Conta {

    private String nome;
    private int numeroDaConta;
    private double saldo;

    public Conta(String nome, int numeroDaConta, double saldo) {
        this.nome = nome;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    public void cadastroConta(String nome, int numeroDaConta, double saldo) {


        this.nome = nome;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }


}
