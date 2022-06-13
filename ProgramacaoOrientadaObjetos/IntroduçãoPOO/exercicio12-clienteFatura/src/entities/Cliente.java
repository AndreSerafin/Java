package entities;

public class Cliente {

    private int id;
    private String nome;
    private int desconto;

    public Cliente (int id, String nome, int desconto) {
        this.id = id;
        this.nome = nome;
        this.desconto = desconto;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getDesconto() {
        return desconto;
    }

    public String toString() {
        return "Cliente: " + nome + "(" + id + ") " + desconto + "%";
    }
}
