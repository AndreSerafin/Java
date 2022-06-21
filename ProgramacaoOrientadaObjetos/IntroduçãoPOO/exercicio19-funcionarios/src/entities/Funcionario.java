package entities;

public class Funcionario {

    protected String nome;
    protected Integer horas;
    protected Double valorPorHora;

    Funcionario() {

    }

    public Funcionario(String nome, Integer horas, Double valorPorHora) {
        this.nome = nome;
        this.horas = horas;
        this.valorPorHora = valorPorHora;
    }

    public String getNome() {
        return nome;
    }

    public Integer getHoras() {
        return horas;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public Double pagamento() {
        return horas * valorPorHora;
    }
}
