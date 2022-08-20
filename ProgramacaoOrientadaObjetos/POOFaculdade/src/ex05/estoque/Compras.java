package ex05.estoque;

import java.util.ArrayList;
import java.util.Random;

public class Compras {

    private static ArrayList<Produto> produtos = new ArrayList<>();
    private double valorTotal;

    public Compras() {

    }

    public Compras(ArrayList<Produto> produtos) {
        this.produtos = produtos;
        this.valorTotal = calculaValorTotal();
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public static void setProdutos(ArrayList<Produto> produtos) {
        Compras.produtos = produtos;
    }

    public double calculaValorTotal() {
        for(Produto x : produtos) {
            valorTotal += x.getValorUnitario() * x.getQntddProduto();
        }

        return valorTotal;
    }

    public void addProds(Produto produto){
        produtos.add(produto);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Produto x : produtos) {
            sb.append(String.format("%s",x.toString()));
        }
        return "Produtos: " + sb;
    }
}
