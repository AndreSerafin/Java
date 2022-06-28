package entities;

public class Quarto {

    private String nome;
    private String email;
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public Quarto(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
}
