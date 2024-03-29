package exercicios.exerc17_figuras.entities;


import exercicios.exerc17_figuras.entitiesEnum.Cor;

public class Retangulo extends Forma{

    private Double largura;
    private Double altura;

    public Retangulo() {
        super();
    }

    public Retangulo(Cor cor, Double largura, Double altura) {
        super(cor);
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public Double area() {
        return largura * altura;
    }
}
