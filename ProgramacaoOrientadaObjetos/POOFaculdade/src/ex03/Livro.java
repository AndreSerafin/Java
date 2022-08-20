package ex03;

public class Livro {

    private String titulo;
    private String autor;

    public Livro() {

    }

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String toString() {
        return "Titulo: " + titulo + "\n"
                + "Autor: " + autor;
    }
}