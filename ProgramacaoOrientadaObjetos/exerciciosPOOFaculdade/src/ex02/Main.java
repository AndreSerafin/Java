package ex02;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Agenda agenda = new Agenda();

        System.out.print("Quantos contatos serão cadastrados?: ");
        int qtddContatos = sc.nextInt();

        sc.nextLine();
        for (int i = 0; i < qtddContatos; i++) {
            System.out.printf("--- Contato %d ---\n", i + 1);
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Numero de telefone: ");
            String numeroTel = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();

            Contato contato = new Contato(nome, numeroTel, email);

            agenda.cadastraContato(contato);
        }

        System.out.printf("\n%s",agenda.toString());

        sc.close();
    }
}
