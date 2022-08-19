package ex01;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ArrayList<Cliente> clienteLista = new ArrayList<>();

        System.out.print("Quantos clientes a serem cadastrados: ");
        int qtddClientes = sc.nextInt();

        for (int i = 0; i < qtddClientes; i++) {

            System.out.printf("\nNome do Cliente %d: ", i + 1);
            sc.nextLine();
            String nomeCliente = sc.nextLine();
            System.out.print("Cpf: ");
            String cpf = sc.nextLine();


            System.out.print("Codigo do Pedido: ");
            int codPedido = sc.nextInt();
            Pedido pedido = new Pedido(codPedido);

            Cliente cliente = new Cliente(nomeCliente, cpf, pedido);
            cliente.setPedido(pedido);

            System.out.print("Quantos Itens serao cadastrados?: ");
            int qtddItens = sc.nextInt();

            for (int j = 0; j < qtddItens; j++) {

                System.out.printf("\nNome do Produto %d: ",j + 1);
                sc.nextLine();
                String nomeProd = sc.nextLine();
                System.out.print("Quantidade: ");
                int quantidade = sc.nextInt();
                System.out.print("Valor Unitario: ");
                double valorUnitario = sc.nextDouble();

                Produto produto = new Produto(nomeProd, valorUnitario, quantidade);

                cliente.getPedido().adicionarProdutos(produto);

            }

            clienteLista.add(cliente);
        }

            System.out.print("_________________________________________________________");
        for(Cliente x : clienteLista) {
            System.out.printf("\n%s", x.toString());
            System.out.print("_________________________________________________________");
        }


        sc.close();
    }
}
