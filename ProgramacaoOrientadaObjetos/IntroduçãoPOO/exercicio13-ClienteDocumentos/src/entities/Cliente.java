package entities;

public class Cliente {

    private int codCLi;
    private String nome;
    private String telefone;
    private String endereco;

    public Cliente (int codCLi, String nome, String telefone, String endereco) {
        this.codCLi = codCLi;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }
}
