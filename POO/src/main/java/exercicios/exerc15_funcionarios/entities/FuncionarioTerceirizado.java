package exercicios.exerc15_funcionarios.entities;

public class FuncionarioTerceirizado extends Funcionario{

    private Double adicional;

    public FuncionarioTerceirizado(){
        super();
    }

    public FuncionarioTerceirizado(String nome, Integer horas, Double valorPorHora, Double adicional) {
        super(nome, horas, valorPorHora);
        this.adicional = adicional;
    }

    @Override
    public Double pagamento() {
        return super.pagamento() + 1.1 * adicional;
    }
}
