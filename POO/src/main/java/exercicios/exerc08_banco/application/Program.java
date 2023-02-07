package exercicios.exerc08_banco.application;

import exercicios.exerc08_banco.entities.Contas;

import java.util.ArrayList;
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

    public static final int MAX = 10;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);


        ArrayList<Contas> conta = new ArrayList<Contas>();

        int op;
        int cont = 0;

        do{

        System.out.println("\n╭────────────────────────────────────────╮");
        System.out.println("│             Menu de opções:            │");
        System.out.println("│          0. Finalizar programa:        │");
        System.out.println("│           1. Cadastrar conta:          │");
        System.out.println("│    2. Vizualizar contas cadastradas:   │");
        System.out.println("│          3. Excluir uma conta:         │");
        System.out.println("╰────────────────────────────────────────╯");

        op = sc.nextInt();


        switch (op) {

            case 1 -> {

                ArrayList<Integer> num = new ArrayList<Integer>();


                for (int i = 0; i < MAX; i++) {

                    sc.nextLine();
                    System.out.print("\nDigite o nome do cliente:\n ► ");
                    String nome = sc.nextLine();
                    System.out.print("Digite o número da conta:\n ► ");

                    int aux = sc.nextInt();

                    if (i == 0) {
                        num.add(i,aux);
                    }else {
                        while (num.contains(aux)) {
                            System.out.print("Numero em uso!\n ► ");
                            aux = sc.nextInt();
                        }
                        num.add(i , aux);
                    }



                    System.out.print("Digite o saldo inicial:\n ► R$ ");
                    double saldo = sc.nextDouble();

                    conta.add(i, new Contas(nome, num.get(i), saldo));
                    cont++;
                }



            }
            case 2 -> {
                if (cont > 0) {
                    vizualizaContas(conta);
                }else{
                    System.out.println("Nenhuma conta cadastrada!");
                }

            }
            case 3 -> {
                if (cont > 0) {

                    conta = excluiContas(conta);
                }else{
                    System.out.println("Nenhuma conta cadastrada!");
                }
            }
            case 0 -> {

            }
            default -> {
                System.out.println("Opção Inválida!");
            }

        }

        }while(op != 0);



        sc.close();

    }

    public static ArrayList<Contas> excluiContas(ArrayList<Contas> c) {

        int op;

        do{

            System.out.println("\n╭────────────────────────────────────────╮");
            System.out.println("│         Selecione uma opcao:           │");
            System.out.println("│      0. Voltar ao menu anterior:       │");
            System.out.println("│  1. Excluir conta a partir do numero:  │");
            System.out.println("│    2. Excluir titularidade duplicada   │");
            System.out.println("╰────────────────────────────────────────╯");

            op = sc.nextInt();

            switch (op){
                case 1 -> {
                    System.out.print("Digite o numero da conta:\n ► ");
                    int num = sc.nextInt();
                    for (int i = 0; i < c.size(); i++) {

                        if(c.get(i).getNumeroDaConta() == num) {
                            c.remove(i);
                        }
                    }
                }
                case 2 -> {
                    System.out.print("Digite o nome do titular: \n ► ");
                    sc.nextLine();
                    String nome = sc.nextLine();
                    for (int i = 0; i < c.size(); i++) {
                        for (int j = 0; j < c.size(); j++) {

                            if (c.get(i).getNome().equals(nome) && c.get(j).getNome().equals(nome)
                                    && c.get(i).getSaldo() > c.get(j).getSaldo()){
                                c.get(i).setSaldo(c.get(i).getSaldo() + c.get(j).getSaldo());
                                c.remove(j);
                            }
                        }
                    }
                }
            }
        }while (op != 0);


        return c;
    }

    public static void vizualizaContas(ArrayList<Contas> c) {


        int op1;
        do{

            System.out.println("\n╭────────────────────────────────────────╮");
            System.out.println("│          Selecione uma opcao:          │");
            System.out.println("│       0. Voltar ao menu anterior:      │");
            System.out.println("│      1. Vizualizar todas contas:       │");
            System.out.println("│   2. Vizualizar contas de um cliente   │");
            System.out.println("╰────────────────────────────────────────╯");

            op1 = sc.nextInt();

            switch (op1){
                case 1 -> {

                    for (int i = 0; i < c.size(); i++) {

                        System.out.printf("\nNome: %s\n", c.get(i).getNome());
                        System.out.printf("Numero da conta: %s\n", c.get(i).getNumeroDaConta());
                        System.out.printf("Saldo: R$ %.2f\n", c.get(i).getSaldo());
                    }
                }
                case 2 -> {

                    System.out.print("\nDigite o nome do Titular: ");

                    sc.nextLine();
                    String nomeTitular = sc.nextLine();

                    for (int i = 0; i < c.size(); i++) {
                        if(c.get(i).getNome().equals(nomeTitular)){
                            System.out.printf("\nNome: %s\n", c.get(i).getNome());
                            System.out.printf("Numero da conta: %s\n", c.get(i).getNumeroDaConta());
                            System.out.printf("Saldo: R$ %.2f\n", c.get(i).getSaldo());
                        }
                    }
                }
                case 0 -> {

                }
                default -> {
                    System.out.println("Opção Inválida!");
                }
            }
        }while (op1 != 0);

    }

}
