package exemplos.exemplo04_encapsulamento.aplication;

import exemplos.exemplo04_encapsulamento.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dados do produto: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Preco: ");
        double preco = sc.nextDouble();


        Product produto = new Product(nome, preco);

        produto.setNome("Computador");
        System.out.printf("Nome atualizado: %s\n",produto.getNome());
        produto.setPreco(1200.00);
        System.out.printf("Preco atualizado: %.2f\n", produto.getPreco());

        System.out.println();
        System.out.println("Dados do produto: " + produto);

        System.out.println();
        System.out.print("Digite a quantidade de produtos a serem adicionados no estoque: ");
        int quantidade = sc.nextInt();
        produto.addProducts(quantidade);

        System.out.println();
        System.out.println("Dados atualizados: " + produto);

        System.out.println();
        System.out.print("Digite a quantidade de produtos a serem removidos do estoque: ");
        quantidade = sc.nextInt();
        produto.removeProducts(quantidade);

        System.out.println();
        System.out.println("Dados atualizados: " + produto);

        sc.close();
    }
}
