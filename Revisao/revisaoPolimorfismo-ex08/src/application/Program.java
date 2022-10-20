package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ArrayList<Product>  productsList = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Numero de produtos: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++) {
            System.out.printf("Produto #%d\n", i + 1);
            char op;
            do {
                System.out.print("Comum, usado ou importado (c/u/i)?");
                op = sc.next().charAt(0);
            }while(op != 'c' && op != 'u' && op != 'i');
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Preço: ");
            double preco = sc.nextDouble();
            switch (op) {
                case 'c' -> {
                    productsList.add(new Product(nome, preco));
                }
                case 'i' -> {
                    System.out.print("Taxa de importação: ");
                    double taxa = sc.nextDouble();
                    productsList.add(new ImportedProduct(nome, preco, taxa));
                }
                case 'u' -> {
                    System.out.print("Data de manufatura: ");
                    sc.nextLine();
                    Date dataManufatura = sdf.parse(sc.nextLine());
                    productsList.add(new UsedProduct(nome, preco, dataManufatura));
                }
            }
        }
        System.out.println("Etiquetas de preço: ");
        for(Product p : productsList) {
            System.out.println(p.priceTag());
        }

        sc.close();
    }

}
