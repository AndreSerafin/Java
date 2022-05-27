package application;

import entities.Conta;

import java.util.Locale;
import java.util.Scanner;

/*Faça um programa que realize o cadastro de contas bancárias com as seguintes informações: número da conta, nome do cliente e
saldo. O banco permitirão cadastramento de apenas 15 contas e não poderá haver mais que uma conta com o mesmo número. Crie o menu
de opções a seguir.Menu de opções:
1. Cadastrar contas.
2. Visualizar todas as contas de determinado cliente.
3. Excluir a conta com menor saldo(supondoanão existência de saldos iguais).
4. Sair.*/
public class Program {

    public static final int MAX = 4;

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Conta[] conta = new Conta[MAX];

        int op;

        do{

        System.out.println("\n╭──────────────────────────────────────╮");
        System.out.println("│            Menu de opções:           │");
        System.out.println("│        0. Finalizar programa:        │");
        System.out.println("│         1. Cadastrar conta:          │");
        System.out.println("│   2. Vizualizar contas cadastradas:  │");
        System.out.println("│        3. Excluir uma conta:         │");
        System.out.println("╰──────────────────────────────────────╯");

        op = sc.nextInt();

        switch (op) {

            case 1 -> {

                int[] num = new int[MAX];

                for (int i = 0; i < conta.length; i++) {

                    sc.nextLine();
                    System.out.print("Digite o nome do cliente:\n ► ");
                    String nome = sc.nextLine();
                    System.out.print("Digite o número da conta:\n ► ");
                        
                        if(i > 0 && num[i] == num[i - 1]){
                            System.out.println("Número de conta Indisponível!");
                        }else {

                            num[i] = sc.nextInt();
                        }
                    System.out.print("Digite o saldo inicial:\n ► ");
                    double saldo = sc.nextDouble();

                    conta[i] = new Conta(nome, num, saldo);
                }



            }
            case 2 -> {

            }

        }

        }while(op != 0);



        sc.close();

    }

}
