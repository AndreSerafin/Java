package aplication;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Digite os dados do produto: ");
        System.out.print("Nome: ");
        product.nome = sc.nextLine();
        System.out.print("Preco: ");
        product.preco = sc.nextDouble();

        System.out.print("Quantidade: ");
        product.quantidade = sc.nextInt();

        System.out.println();
        System.out.println("Dados do produto: " + product);

        System.out.println();
        System.out.print("Digite a quantidade de produtos a serem adicionados no estoque: ");
        int quantidade = sc.nextInt();
        product.addProducts(quantidade);

        System.out.println();
        System.out.println("Dados atualizados: " + product);

        System.out.println();
        System.out.print("Digite a quantidade de produtos a serem removidos do estoque: ");
        quantidade = sc.nextInt();
        product.removeProducts(quantidade);

        System.out.println();
        System.out.println("Dados atualizados: " + product);



        sc.close();
    }
}
