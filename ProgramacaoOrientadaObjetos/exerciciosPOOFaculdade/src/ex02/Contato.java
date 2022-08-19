package ex02;

public class Contato {

    private String nome;
    private String numTelefone;
    private String email;

    public Contato() {

    }

    public Contato(String nome, String numTelefone, String email) {
        this.nome = nome;
        this.numTelefone = numTelefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getNumTelefone() {
        return numTelefone;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n"
                + "Numero de telefone: " + numTelefone + "\n"
                + "E-mail: " + email + "\n";
    }
}
