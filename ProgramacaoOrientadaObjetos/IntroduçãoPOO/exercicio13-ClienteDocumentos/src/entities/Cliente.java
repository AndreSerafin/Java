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

    public int getCodCLi() {
        return codCLi;
    }

    public String getNome() {
        return nome;
    }

    public void setCodCLi(int codCLi) {
        this.codCLi = codCLi;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String toString() {
        return "Codigo do Cliente: " + codCLi
                + ", Nome: " + nome
                +", Telefone: " + telefone
                +", Endereço: " + endereco;
    }
}
