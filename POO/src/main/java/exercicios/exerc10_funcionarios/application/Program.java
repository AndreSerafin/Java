package exercicios.exerc10_funcionarios.application;

/*Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) d N funcionários. Não deve haver
repetição de id Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário Para isso, o programa
deve ler um id e o valor X. Se o id informado não existir, mostrar um mensagem e abortar a operação. Ao final, mostrar a
listagem atualizada dos funcionários conforme exemplos Lembre-se de aplicar a técnica de encapsulamento para não permitir
que o salário possa ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de aumento por
porcentagem dada.*/

import exercicios.exerc10_funcionarios.entities.Funcionario;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {


    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario> funcionarios = new ArrayList<Funcionario>();
        List<Integer> idsDigitados = new ArrayList<Integer>();
        int op;
        boolean key = false;


        do{
            System.out.println("╭──────────────────────────────╮");
            System.out.println("│             Menu:            │");
            System.out.println("│         0. Finalizar         │");
            System.out.println("│   1. Cadastrar funcionarios: │");
            System.out.println("│     2. Aumento salarial:     │");
            System.out.println("│  3. Vizualizar funcionarios: │");
            System.out.println("╰──────────────────────────────╯");

            op = sc.nextInt();

            switch (op) {

                case 0 -> {

                }
                case 1 -> {
                    System.out.printf("Quantidade de funcionarios: ");
                    int n = sc.nextInt();

                    float salario;
                    int id;
                    String nome;

                    for (int i = 0; i < n; i++) {
                        System.out.printf("\nFuncionario: %d\n", i + 1);
                        System.out.print("Nome: ");
                        sc.nextLine();
                        nome = sc.nextLine();
                        System.out.print("Id: ");
                        id = sc.nextInt();

                        if (idsDigitados.contains(id)) {
                            do {
                                System.out.print("Id em uso!Digite outro: ");
                                id = sc.nextInt();
                            } while (idsDigitados.contains(id));
                        }
                        idsDigitados.add(id);

                        System.out.print("Salario inicial: ");
                        salario = sc.nextFloat();

                        funcionarios.add(i, new Funcionario(id, nome, salario));
                    }
                }
                case 2 -> {

                    if(key){
                        System.out.print("Digite o id do funcionario que receberá aumento: ");
                        int id = sc.nextInt();
                        for (Funcionario x : funcionarios) {
                            if (x.getId() == id) {
                                System.out.print("Porcentagem de aumento: ");
                                int porcentagem = sc.nextInt();
                                x.aumento(porcentagem);
                            }
                        }
                    }else{
                        System.out.println("Nenhum funcionario cadastrado!");
                    }
                }
                case 3 -> {

                    System.out.printf("Lista de funcionarios: \n");
                    for (Funcionario x: funcionarios) {

                        System.out.printf("\nNome: %s\n", x.getNome());
                        System.out.printf("Id: %d\n", x.getId());
                        System.out.printf("Salario: R$ %.2f\n", x.getSalario());
                    }
                }
                default -> {
                    System.out.printf("Opção Inválida!\n");
                }
            }
        }while(op != 0);

        sc.close();
    }



}
