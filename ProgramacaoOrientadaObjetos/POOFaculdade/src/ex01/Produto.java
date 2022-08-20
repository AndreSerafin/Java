package ex01;

public class Produto {

    private String nomeProduto;
    private double precoUnitario;
    private int quantidadePedida;

    public Produto() {

    }

    public Produto(String nomeProduto, double precoUnitario, int quantidadePedida) {
        this.nomeProduto = nomeProduto;
        this.precoUnitario = precoUnitario;
        this.quantidadePedida = quantidadePedida;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }



    public int getQuantidadePedida() {
        return quantidadePedida;
    }

    @Override
    public String toString(){
        return "Nome Do Produto: " + nomeProduto + "\n"
                + "Preço Unitario: R$ " + String.format("%.2f", precoUnitario) + "\n"
                + "Quantidade Pedida: " + quantidadePedida + "\n";
    }
}
