package exercicios.exerc14_pedidos.entities;

import exercicios.exerc14_pedidos.entities.entitiesEnum.StatusPedido;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Pedido {

    private Date momento;
    private StatusPedido status;
    Cliente cliente;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");

    public Pedido() {

    }

    public Pedido(Date momento, StatusPedido status, Cliente cliente) {
        this.momento = momento;
        this.status = status;
        this.cliente = cliente;
    }

    ArrayList<ItensDoPedido> itens = new ArrayList<>();

    public void addItem(ItensDoPedido item) {
        this.itens.add(item);
    }

    public void removeItem(ItensDoPedido item) {
        this.itens.remove(item);
    }

    public Double total(){
        double soma = 0;
        for (ItensDoPedido i : itens) {
            soma += i.subTotal();
        }
        return soma;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Momento do pedido: " + sdf.format(momento) + "\n");
        sb.append("Status do pedido: " + status + "\n");
        sb.append(cliente.toString() + "\n");
        for (ItensDoPedido i : itens) {
            sb.append(i.toString() + "\n");
        }
        sb.append("Preço total: " + total());

        return sb.toString();
    }
}
