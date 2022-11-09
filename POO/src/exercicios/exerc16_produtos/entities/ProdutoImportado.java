package exercicios.exerc16_produtos.entities;

public class ProdutoImportado extends Produto{

    private Double taxaImportacao;

    public ProdutoImportado() {
        super();
    }

    public ProdutoImportado(String nome, Double preco, Double taxaImportacao) {
        super(nome, preco);
        this.taxaImportacao = taxaImportacao;
    }

    @Override
    public String etiquetaPreco() {
        return getNome() + " R$ " + String.format("%.2f", precoTotal())
                + " (Taxa de importação: R$ " + String.format("%.2f", taxaImportacao) + ")";
    }

    public Double precoTotal() {
        return getPreco() + taxaImportacao;
    }
}
