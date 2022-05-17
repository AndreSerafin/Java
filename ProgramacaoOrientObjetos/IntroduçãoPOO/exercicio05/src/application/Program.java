package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account conta;

        System.out.print("Numero da conta: ");
        int numeroDaConta = sc.nextInt();
        System.out.print("\nTitular da conta: ");
        sc.nextLine();
        String nomeTitular = sc.nextLine();

        System.out.println("\nDeseja fazer um deposito inicial? (s/n)");
        char op1 = sc.next().charAt(0);

        while(op1 != 's' && op1 != 'n'){
            System.out.println("Opção Inválida!");
            op1 = sc.next().charAt(0);
        }

        if (op1 == 's'){
            System.out.print("\nDigite o valor do deposito inicial: ");
            double depositoInicial = sc.nextDouble();
            conta = new Account(numeroDaConta, nomeTitular, depositoInicial);
        } else{
            conta = new Account(numeroDaConta, nomeTitular);
        }

        System.out.printf("\nDados da conta - %s\n", conta.toString());

        System.out.println("\n╭───────────────────────────────╮");
        System.out.println("│      Selecione uma opcao!     │");
        System.out.println("│        0 - Encerrar           │");
        System.out.println("│        1 - Deposito           │");
        System.out.println("│        2 - Saque              │");
        System.out.println("│  3 - Alterar nome do Titular  │");
        System.out.println("╰───────────────────────────────╯");

        int op2 = sc.nextInt();

        while(op2 != 0){

            switch (op2) {
                case 1 -> {
                    System.out.print("Digite o valor do deposito: ");
                    double deposito = sc.nextDouble();
                    conta.deposito(deposito);
                    System.out.printf("\nDados atualizados:\n%s\n", conta.toString());
                }
                case 2 -> {
                    System.out.print("Digite o valor do saque: ");
                    double saque = sc.nextDouble();
                    conta.saque(saque);
                    System.out.printf("\nDados atualizados:\n%s\n", conta.toString());
                }
                case 3 -> {
                    System.out.print("Digite o novo nome do Titular da conta: ");
                    sc.nextLine();
                    nomeTitular = sc.nextLine();
                    conta.setNomeTitular(nomeTitular);
                    System.out.printf("\nDados atualizados:\n%s\n", conta.toString());
                }
                default -> System.out.println("\nOpcao Invalida!");
            }

            System.out.println("\n╭───────────────────────────────╮");
            System.out.println("│      Selecione uma opcao!     │");
            System.out.println("│        0 - Encerrar           │");
            System.out.println("│        1 - Deposito           │");
            System.out.println("│        2 - Saque              │");
            System.out.println("│  3 - Alterar nome do Titular  │");
            System.out.println("╰───────────────────────────────╯");

            op2 = sc.nextInt();
        }


        sc.close();

    }
}
