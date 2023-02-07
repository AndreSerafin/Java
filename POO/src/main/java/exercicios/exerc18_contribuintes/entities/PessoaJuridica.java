package exercicios.exerc18_contribuintes.entities;

public class PessoaJuridica extends Contribuintes {

    Integer numFuncionarios;

    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(String nome, Double rendaAnual, Integer numFuncionarios) {
        super(nome, rendaAnual);
        this.numFuncionarios = numFuncionarios;
    }

    public Integer getNumFuncionarios() {
        return numFuncionarios;
    }
    @Override
    public Double calculoImposto() {
        if(numFuncionarios > 10) {
            return getRendaAnual() * 0.14;
        }
        return getRendaAnual() * 0.16;
    }
}
