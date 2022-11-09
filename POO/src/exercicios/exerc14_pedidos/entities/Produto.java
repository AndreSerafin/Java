package exercicios.exerc14_pedidos.entities;

public class Produto {

    private String nome;
    private Double preco;

    Produto(){

    }

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

}
