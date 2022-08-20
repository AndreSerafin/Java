package ex05.application;

import ex05.estoque.Compras;
import ex05.estoque.Produto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        int op;
        Compras compras = new Compras();

        compras.addProds(new Produto("Alface",2.0,sdf.parse("25/06/2023")));
        compras.addProds(new Produto("Cenoura",6.0,sdf.parse("23/06/2023")));
        compras.addProds(new Produto("Beterraba",5.0,sdf.parse("28/06/2023")));
        compras.addProds(new Produto("Cebolinha",2.0,sdf.parse("25/06/2023")));
        compras.addProds(new Produto("Cebola",4.0,sdf.parse("30/06/2023")));

        do{

            System.out.println("╭─────────────────────────────────────────╮");
            System.out.println("│          0) Finalizar programa:         │");
            System.out.println("│          1) Cadastrar produto:          │");
            System.out.println("│    2) Fazer compras para o estoque:     │");
            System.out.println("│     3) Fazer retiradas do estoque:      │");
            System.out.println("│       4) Cadastrar contas a pagar:      │");
            System.out.println("│     5) Cadastrar contas a receber:      │");
            System.out.println("│        6) Vizualizar estoque:           │");
            System.out.println("│        7) Vizualizar finanças:          │");
            System.out.println("╰─────────────────────────────────────────╯");

            op = sc.nextInt();
            
            switch (op){
                case 0 -> {
                    
                }
                case 1 -> {
                    System.out.print("Quantos produtos serão cadastrados?: ");
                    int qtddProds = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < qtddProds; i++) {
                        System.out.print("Nome do produto: ");
                        String nomeProduto = sc.nextLine().substring(0,0).toUpperCase();
                        System.out.print("Valor unitario: ");
                        double valorUnitario = sc.nextDouble();
                        System.out.print("Data de validade(dd/mm/aaaa): ");
                        sc.nextLine();
                        Date dataValidade = sdf.parse(sc.nextLine());
                        
                        compras.addProds(new Produto(nomeProduto,valorUnitario,dataValidade));
                    }
                }
                case 2 -> {

                    sc.nextLine();
                    System.out.print("Digite o nome do produto a ser comprado: ");
                    String nomeProduto = sc.nextLine().substring(0,0).toUpperCase();
                    for(Produto x : compras.getProdutos()) {
                        if(x.getNomeProduto().equals(nomeProduto)) {
                            System.out.print("Digite a quantidade a ser comprada: ");
                            int qtddProdutos = sc.nextInt();
                            x.addProdutoAoEstoque(qtddProdutos);
                        }
                    }
                }
                case 3 -> {
                    
                    sc.nextLine();
                    System.out.print("Digite o nome do produto a ser retirado: ");
                    String nomeProduto = sc.nextLine().substring(0,0).toUpperCase();
                    for(Produto x : compras.getProdutos()) {
                        if(x.getNomeProduto().equals(nomeProduto)) {
                            System.out.print("Digite a quantidade a ser retirada: ");
                            int qtddProdutos = sc.nextInt();
                            x.retiraProdutoDoEstoque(qtddProdutos);
                        }
                    }
                }
                default -> {
                    System.out.print("Opção invalida!");
                }
            }

        }while (op != 0);

        sc.close();
    }

}
