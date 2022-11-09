package exercicios.exerc16_produtos.application;

import exercicios.exerc16_produtos.entities.Produto;
import exercicios.exerc16_produtos.entities.ProdutoImportado;
import exercicios.exerc16_produtos.entities.ProdutoUsado;

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
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        ArrayList<Produto> prods = new ArrayList<Produto>();

        System.out.print("Digite o numero de produtos: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Produto p1;
            System.out.printf("\nDados Produto #%d\n", i + 1);
            System.out.print("Comum, usado ou importado (c/u/i)? ");
            sc.nextLine();
            char op = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Preço: ");
            double preco = sc.nextDouble();
            boolean key = false;

            do{
                switch (op) {
                    case 'c' -> {
                        p1 = new Produto(nome, preco);
                        prods.add(p1);
                        key = true;
                    }
                    case 'i' -> {
                        System.out.print("Taxa de importação: ");
                        double taxa = sc.nextDouble();
                        p1 = new ProdutoImportado(nome, preco, taxa);
                        prods.add(p1);
                        key = true;
                    }
                    case 'u' -> {
                        System.out.print("Data de manufatura(DD/MM/YYYY): ");
                        sc.nextLine();
                        Date dataManufatura = sdf.parse(sc.nextLine());
                        p1 = new ProdutoUsado(nome, preco, dataManufatura);
                        prods.add(p1);
                        key = true;
                    }
                    default -> {
                        System.out.print("Tipo de produto Invalido\nEscolha novamente (c/u/i): ");
                        sc.nextLine();
                        op = sc.next().charAt(0);
                    }
                }
            }while(!key);

        }

        System.out.println("\nEtiquetas de preço: ");
        for (Produto p : prods) {
            System.out.println(p.etiquetaPreco());
        }

        sc.close();
    }

}
