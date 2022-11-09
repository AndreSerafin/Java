package exercicios.exerc05_cadastroBancario.entities;

public class Account {

    private int numeroDaConta;
    private String nomeTitular;
    private final static int TAXA = 5;
    private double saldo;

    public Account(int numeroDaConta, String nomeTitular, double depositoInicial) {
        this.numeroDaConta = numeroDaConta;
        this.nomeTitular = nomeTitular;
        deposito(depositoInicial);
    }

    public Account(int numeroDaConta, String nomeTitular) {
        this.numeroDaConta = numeroDaConta;
        this.nomeTitular = nomeTitular;
    }

    public int getNumeroDaConta() { return numeroDaConta; }

    public String getNomeTitular() { return nomeTitular; }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double quantia){

        saldo += quantia;
    }

    public void saque(double quantia) {

        saldo -= quantia + TAXA;

        /*if(saldo > 0) {
        *
        *   if(saque < saldo) {
        *       saldo -= saque;
        *        saldo -= TAXA;
        *    }else{
        *        System.out.println("\nQuantidade digitada maior do que o saldo disponível");
        *    }
        *}else{
        *    System.out.println("\nSaldo insuficiente");
        }*/
    }

    public String toString() {
        return "Conta: "
                + getNumeroDaConta()
                + ", "
                + "Titular: "
                + getNomeTitular()
                + ", "
                + "Saldo: R$ "
                + String.format("%.2f", getSaldo());
    }
}
