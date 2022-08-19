package ex03;

public class Pessoa {

    private String nome;
    private String cpf;
    private int codCadastro;

    public Pessoa() {

    }

    public Pessoa(String nome, String cpf, int codCadastro) {
        this.nome = nome;
        this.cpf = cpf;
        this.codCadastro = codCadastro;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getCodCadastro() {
        return codCadastro;
    }

    public String toString() {
        return "Nome: " + nome + "\n"
                + "Cpf: " + cpf + "\n"
                + "Codigo de cadastro: " + codCadastro;
    }
}
