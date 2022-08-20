package ex04;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome da familia: ");
        String nomeFamilia = sc.nextLine();

        System.out.print("Quantidade de pessoas na familia: ");
        int qtddPessoas = sc.nextInt();

        ArrayList<Pessoa> pessoas = new ArrayList<>();
        Familia familia = null;

        sc.nextLine();
        for (int i = 0; i < qtddPessoas; i++) {
            System.out.printf("---%dª pessoa---\n", i + 1);
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine();
            char op;
            do{
                System.out.print("Cadastrar pai e mae (s/n)?: ");
                op = sc.nextLine().charAt(0);

                switch (op){
                    case 's' ->{
                        System.out.print("Nome da mae: ");
                        String nomeMae = sc.nextLine();
                        System.out.print("Idade da mae: ");
                        int idadeMae = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nome do pai: ");
                        String nomePai = sc.nextLine();
                        System.out.print("Idade do pai: ");
                        int idadePai = sc.nextInt();
                        pessoas.add(new Pessoa(nome,idade, new Pessoa(nomePai, idadePai), new Pessoa(nomeMae,idadeMae)));
                        sc.nextLine();
                    }
                    case 'n' -> {
                        pessoas.add(new Pessoa(nome, idade));
                    }
                    default -> {
                        System.out.print("Opcao Invalida!");
                    }
                }
            }while (op != 's' && op != 'n');

            familia = new Familia(pessoas, nomeFamilia);
        }
        System.out.print("-----------------------------------------");
        System.out.printf("\n%s", familia.toString());
        System.out.print("-----------------------------------------");

        sc.close();
    }
}
