package exercicios.exerc18_contribuintes.application;

import exercicios.exerc18_contribuintes.entities.Contribuintes;
import exercicios.exerc18_contribuintes.entities.PessoaFisica;
import exercicios.exerc18_contribuintes.entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Numero de contribuintes: ");
        int n = sc.nextInt();

        ArrayList<Contribuintes> contribuintes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.printf("Contribuinte #%d\n", i + 1);
            System.out.print("Individual ou Companhia(i/c)? ");
            sc.nextLine();
            char op = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Renda anual: ");
            double renda = sc.nextDouble();
            boolean key = false;
            do{
                switch (op) {
                    case 'i' -> {
                        System.out.print("Gastos com saúde: ");
                        double gastos = sc.nextDouble();
                        contribuintes.add(new PessoaFisica(nome, renda, gastos));
                        key = true;
                    }
                    case 'c' -> {
                        System.out.print("Numero de funcionarios: ");
                        int numFuncionarios = sc.nextInt();
                        contribuintes.add(new PessoaJuridica(nome, renda, numFuncionarios));
                        key = true;
                    }
                    default -> {
                        System.out.print("Opção Invalida!\nSelecione novamente (c/i): ");
                        sc.nextLine();
                        op = sc.next().charAt(0);
                    }
                }
            }while (!key);
        }

        System.out.print("Taxas pagas: ");
        for (Contribuintes c : contribuintes){
            System.out.printf("\n%s: R$ %.2f", c.getNome(), c.calculoImposto());
        }

        double soma = 0.0;
        for(Contribuintes c : contribuintes) {
            soma += c.calculoImposto();
        }
        System.out.printf("\nTaxas Totais: R$ %.2f\n", soma);
        
        sc.close();
    }
}
