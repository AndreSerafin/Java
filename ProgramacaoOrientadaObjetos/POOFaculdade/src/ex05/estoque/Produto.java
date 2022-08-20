package ex05.estoque;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Produto {
    private String nomeProduto;
    private int qntddProduto;
    private double valorUnitario;
    private Date dataValidade;

    public Produto() {

    }

    public Produto(String nomeProduto, int qntddProduto, double valorUnitario, Date dataValidade) {
        this.nomeProduto = nomeProduto;
        this.qntddProduto = qntddProduto;
        this.valorUnitario = valorUnitario;
        this.dataValidade = dataValidade;
    }

    public Produto(String nomeProduto, double valorUnitario, Date dataValidade) {
        this.nomeProduto = nomeProduto;
        this.valorUnitario = valorUnitario;
        this.dataValidade = dataValidade;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public int getQntddProduto() {
        return qntddProduto;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void addProdutoAoEstoque(int qtddProduto) {
        this.qntddProduto += qtddProduto;
    }

    public void retiraProdutoDoEstoque(int qtddProduto) {
        this.qntddProduto -= qtddProduto;
    }

    public String toString(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = sdf.format(dataValidade);
        return "Nome do Produto: " + nomeProduto + "\n"
                + "Quantidade: " + qntddProduto + "\n"
                + "Valor Unitario: " + valorUnitario + "\n"
                + "Data de validade: " + dataFormatada;
    }
}
