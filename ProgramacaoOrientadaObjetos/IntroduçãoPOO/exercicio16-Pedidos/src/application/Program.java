package application;
/*Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois, mostrar um
sumário do pedido conforme exemplo (próxima página). Nota: o instante do pedido deve ser
o instante do sistema: new Date()*/

import entities.Cliente;
import entities.ItensDoPedido;
import entities.Pedido;
import entities.Produto;
import entities.entitiesEnum.StatusPedido;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Dados do cliente: ");
        System.out.print("Nome: ");
        String nomeCli = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Data de nascimento: ");
        Date dataNascimento = new Date();
        dataNascimento = sdf.parse(sc.next());

        Cliente cliente = new Cliente(nomeCli,email,dataNascimento);

        System.out.println("Dados do pedido: ");
        System.out.print("Status: ");
        sc.nextLine();
        StatusPedido so = StatusPedido.valueOf(sc.next().toUpperCase());
        Date momento = new Date(System.currentTimeMillis());

        Pedido pedido = new Pedido(momento, so, cliente);
        System.out.print("Quantos itens nesse pedido: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados pedido #%d",i + 1);
            System.out.print("\nNome do produto: ");
            sc.nextLine();
            String nomeProd = sc.nextLine();
            System.out.print("Preço do produto: ");
            double preco = sc.nextDouble();
            System.out.print("Quantidade: ");
            int quantidade = sc.nextInt();

            Produto produto = new Produto(nomeProd, preco);
            ItensDoPedido iten = new ItensDoPedido(quantidade, preco, produto);
            pedido.addItem(iten);
        }

        System.out.println("Resumo do pedido: ");
        System.out.println(pedido.toString());

        sc.close();
    }

}
