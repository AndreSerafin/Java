package entities;

public class ItensDoPedido {

    private Integer quantidade;
    private Double preco;

    private Produto produto;

    ItensDoPedido(){

    }

    public ItensDoPedido(Integer quantidade, Double preco, Produto produto) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.produto = produto;
    }

    public Double subTotal(){
        return preco * quantidade;
    }

    public String toString() {
        return "Nome do produto: " + produto.getNome()
                + ", Quantidade: " + quantidade
                + ", Subtotal: " + subTotal();
    }
}
