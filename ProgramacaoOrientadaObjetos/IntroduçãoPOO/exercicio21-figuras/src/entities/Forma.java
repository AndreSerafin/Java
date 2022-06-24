package entities;

import entitiesEnum.Cor;

public abstract class Forma {

    private Cor cor;

    public Forma () {

    }

    public Forma(Cor cor) {
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }

    public abstract Double area ();

}
