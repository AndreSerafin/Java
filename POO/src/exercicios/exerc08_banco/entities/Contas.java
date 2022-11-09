package exercicios.exerc08_banco.entities;

public class Contas {

    private String nome;
    private int numeroDaConta;
    private double saldo;

    public Contas(String nome, int numeroDaConta, double saldo) {
        this.nome = nome;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
