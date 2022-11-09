package exercicios.exerc07_agenda.util;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

    private static final int MAX = 4;
    private static ArrayList<String> nome = new ArrayList<String>();
    private static ArrayList<Integer> idade = new ArrayList<Integer>();
    private static ArrayList<Double> altura = new ArrayList<Double>();

    private static final Scanner sc = new Scanner(System.in);

    public static void armazenaPessoa() {

        for (int i = 0; i < MAX; i++) {

            System.out.printf("\nDigite o %dº nome: ", i + 1);
            if(i > 0)
                sc.nextLine();
            nome.add(i, sc.nextLine());
            System.out.printf("Digite a idade do(a) %s: ", nome.get(i));
            idade.add(i, sc.nextInt());
            System.out.printf("Digite a altura do(a) %s: ", nome.get(i));
            altura.add(i, sc.nextDouble());


        }
    }

    public static void vizualizaPessoas() {

        int op;

        do{

            System.out.println("\n╭────────────────────────────────────────╮");
            System.out.println("│            Escolha uma opção           │");
            System.out.println("│      0. Voltar ao menu anterior        │");
            System.out.println("│     1. Vizualizar todos armazenados    │");
            System.out.println("│          2. Buscar por nome            │");
            System.out.println("╰────────────────────────────────────────╯");

            op = sc.nextInt();

            switch (op){
                case 1 -> {
                    for (int i = 0; i < nome.size(); i++) {
                        System.out.printf("\nNome: %s\n", nome.get(i));
                        System.out.printf("Idade: %d\n", idade.get(i));
                        System.out.printf("Altura: %.2f\n", altura.get(i));
                    }
                }case 2 -> {
                    System.out.print("Digite o nome: ");
                    sc.nextLine();
                    String nome = sc.nextLine();
                    for (int i = 0; i < idade.size(); i++) {
                        if(Agenda.nome.get(i).equals(nome)){
                            System.out.printf("\nNome: %s\n", Agenda.nome.get(i));
                            System.out.printf("Idade: %d\n", idade.get(i));
                            System.out.printf("Altura: %.2f M\n", altura.get(i));
                        }
                    }
                } case 0 -> {

                }default -> {
                    System.out.printf("\nOpção Inválida!\n");
                }
            }
        }while (op != 0);
    }

    public static void excluiPessoa() {

        System.out.print("Digite o nome da pessoa a ser excluída: ");
        sc.nextLine();
        String nome = sc.nextLine();
        for (int i = Agenda.nome.size() - 1; i >= 0; i--) {
            if(Agenda.nome.get(i).equals(nome)){
                Agenda.nome.remove(i);
                Agenda.idade.remove(i);
                Agenda.altura.remove(i);
            }
        }
    }

}
