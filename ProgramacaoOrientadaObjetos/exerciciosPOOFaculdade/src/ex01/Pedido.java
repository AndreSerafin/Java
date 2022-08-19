package ex01;

import java.util.ArrayList;

public class Pedido {

    private int codPedido;
    private double valorTotal;
    ArrayList<Produto> produtos = new ArrayList<>();

    public Pedido() {

    }

    public Pedido(int codPedido) {
        this.codPedido = codPedido;
    }

    public int getCodPedido() {
        return codPedido;
    }

    public double getValorTotal() {
        for (Produto x : produtos) {
            valorTotal += x.getPrecoUnitario() * x.getQuantidadePedida();
        }
        return valorTotal;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void adicionarProdutos(Produto produto) {
        this.produtos.add(produto);
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Produto x : produtos){
            sb.append(String.format("%s\n",x.toString()));
        }
        return "Codigo Do Pedido: " + codPedido + "\n"
                + "\nProdutos: \n" + sb + "\n"
                + "Valor Total: R$ " + String.format("%.2f", getValorTotal()) + "\n";
    }
}
