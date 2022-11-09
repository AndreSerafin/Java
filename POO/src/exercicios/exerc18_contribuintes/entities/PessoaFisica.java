package exercicios.exerc18_contribuintes.entities;

public class PessoaFisica extends Contribuintes{

    Double gastosSaude;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    @Override
    public Double calculoImposto() {
        if (getRendaAnual() < 20000.0) {
            return (getRendaAnual() * 0.15) - (gastosSaude * 0.5);
        }
        return (getRendaAnual() * 0.25) - (gastosSaude * 0.5);
    }
}
