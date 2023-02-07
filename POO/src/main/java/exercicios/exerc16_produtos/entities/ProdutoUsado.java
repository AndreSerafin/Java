package exercicios.exerc16_produtos.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {

    Date dataDeManufatura;

    public ProdutoUsado() {
        super();
    }

    public ProdutoUsado(String nome, Double preco, Date dataDeManufatura) {
        super(nome, preco);
        this.dataDeManufatura = dataDeManufatura;
    }

    @Override
    public String etiquetaPreco() {
        StringBuilder sb = new StringBuilder();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sb.append(getNome() + " (usado) R$ ");
        sb.append(String.format("%.2f", getPreco()) + "(");
        sb.append(" Data de manufatura: ");
        sb.append(sdf.format(dataDeManufatura) + ")");
        return sb.toString();
    }

}
