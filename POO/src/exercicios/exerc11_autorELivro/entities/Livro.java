package exercicios.exerc11_autorELivro.entities;

public class Livro {

    private String isbn;
    private String nome;
    private Autor autor;
    private double preco;
    private int quantidade;

    public Livro(String isbn, String nome, Autor autor,
                 double preco, int quantidade) {
        this.isbn = isbn;
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Livro(String isbn, String nome, Autor autor,
                 double preco) {
        this.isbn = isbn;
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String toString() {
        return "Isbn: " + isbn
                + "\nNome: " + nome
                + "\n" + autor.toString()
                + "\nPreço: " + String.format("%.2f", preco)
                + "\nQuantidade: " + quantidade;
    }
}
