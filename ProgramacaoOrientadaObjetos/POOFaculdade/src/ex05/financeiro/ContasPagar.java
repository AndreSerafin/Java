package ex05.financeiro;

import ex02.Contato;

public class ContasPagar {

    private String descricao;
    private double valor;
    private int qtdd;

    public ContasPagar() {

    }

    public ContasPagar(String descricao, double valor, int qtdd) {
        this.descricao = descricao;
        this.valor = valor;
        this.qtdd = qtdd;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public int getQtdd() {
        return qtdd;
    }

    public String toString() {
        return descricao + "\n"
                + "Valor: " + valor + "\n"
                + "Qtdd: " + qtdd;
    }
}
