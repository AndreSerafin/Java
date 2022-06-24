package entities;

import entitiesEnum.Cor;
import static java.lang.Math.PI;

public class Circulo extends Forma {

    private Double raio;

    public Circulo() {
        super();
    }

    public Circulo(Cor cor, Double raio) {
        super(cor);
        this.raio = raio;
    }

    @Override
    public Double area(){
        return PI * Math.pow(raio, 2);
    }
}
