package ex04;

public class Pessoa {

    private String nome;
    private int idade;
    private Pessoa pai;
    private Pessoa mae;

    public Pessoa() {

    }

    public Pessoa(String nome, int idade, Pessoa pai, Pessoa mae) {
        this.nome = nome;
        this.idade = idade;
        this.pai = pai;
        this.mae = mae;
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Pessoa getPai() {
        return pai;
    }

    public Pessoa getMae() {
        return mae;
    }

    @Override
    public String toString() {
        if(pai == null || mae == null){
            return "Nome: " + nome + "\n"
                    + "Idade: " + idade + "\n";

        }
        return "Nome: " + nome + "\n"
                + "Idade: " + idade + "\n"
                + "Pai: " + pai + "\n"
                + "Mae: " + mae + "\n";
    }


}
