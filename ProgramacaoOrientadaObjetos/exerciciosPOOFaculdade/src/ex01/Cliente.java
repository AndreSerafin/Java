package ex01;

public class Cliente {

    private String nomeCliente;
    private String cpf;
    private Pedido pedido;

    public Cliente() {

    }

    public Cliente(String nomeCliente, String cpf, Pedido pedido) {
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
        this.pedido = pedido;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public String toString() {
        return "Nome do Cliente: " + nomeCliente + "\n"
                + "Cpf: " + cpf + "\n"
                + "\nPedidos: \n" + pedido.toString();
    }
}
