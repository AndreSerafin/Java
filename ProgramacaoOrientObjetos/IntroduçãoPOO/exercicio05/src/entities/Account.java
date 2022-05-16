package entities;

public class Account {

    private int numeroDaConta;
    private String nomeTitular;
    private double depositoInicial;

    private double saldo;

    public Account(int numeroDaConta, String nomeTitular, double depositoInicial) {
        this.numeroDaConta = numeroDaConta;
        this.nomeTitular = nomeTitular;
        this.depositoInicial = depositoInicial;
        saldo = depositoInicial;
    }

    public Account(int numeroDaConta, String nomeTitular) {
        this.numeroDaConta = numeroDaConta;
        this.nomeTitular = nomeTitular;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getDepositoInicial() {
        return depositoInicial;
    }

    public void setDepositoInicial(double depositoInicial) {
        this.depositoInicial = depositoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double deposito){

        saldo += deposito;
    }

    public void saque(double saque) {
        if(saldo > 0) {
            saldo -= saque;
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    public String toString() {
        return "Conta: "
                + numeroDaConta
                + ", "
                + "Titular: "
                + nomeTitular
                + ", "
                + "Saldo: "
                + saldo;
    }
}
