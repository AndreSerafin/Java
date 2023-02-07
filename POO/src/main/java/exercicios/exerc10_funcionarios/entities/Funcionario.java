package exercicios.exerc10_funcionarios.entities;

public class Funcionario {

    private int id;
    private String nome;
    private float salario;

    public Funcionario(int id, String nome, float salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public float getSalario() {
        return salario;
    }

    public int getId() {
        return id;
    }

    public float aumento(float porcentagem) {

        float aumento = salario * (porcentagem / 100);
        salario += aumento;

        return aumento;
    }
}
