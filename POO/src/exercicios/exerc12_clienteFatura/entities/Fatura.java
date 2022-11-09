package exercicios.exerc12_clienteFatura.entities;

public class Fatura {

    private int idFatura;
    private Cliente cliente;
    private double quantia;

    public Fatura(int idFatura, Cliente cliente, double quantia) {
        this.idFatura = idFatura;
        this.cliente = cliente;
        this.quantia = quantia;
    }

    public int getIdFatura() {
        return idFatura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getQuantia() {
        return quantia;
    }

    public double valorComDesconto() {
        return quantia - (quantia * (cliente.getDesconto() / 100.0));
    }

    public String toString() {
        return "\nId da Fatura: " + idFatura
                + "\nValor da Fatura: " + quantia
                + "\n" + cliente.toString()
                + "\nValor com Desconto:" + valorComDesconto();
    }
}
