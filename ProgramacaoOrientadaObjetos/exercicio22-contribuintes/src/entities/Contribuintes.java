package entities;

public abstract class Contribuintes {

    private String nome;
    private Double rendaAnual;

    public Contribuintes() {

    }

    public Contribuintes(String nome, Double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public String getNome() {
        return nome;
    }

    public Double getRendaAnual() {
        return rendaAnual;
    }

    public abstract Double calculoImposto();
}
