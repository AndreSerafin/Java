package application;

/*A dona de um pensionato possui dez quartos para alugar para estudantes, sendo esses quartos identificados
pelos números 0 a 9. Fazer um programa que inicie com todos os dez quartos vazios, e depois leia uma quantidade N
representando o número de estudantes que vão alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel
dos N estudantes. Para cada registro de aluguel, informar o nome e email do estudante, bem como qual dos quartos ele
escolheu (de 0 a 9). Suponha que seja escolhido um quarto vago. Ao final, seu programa deve imprimir um relatório de
todas ocupações do pensionato, por ordem de quarto, conforme exemplo.*/

import entities.Quarto;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;


public class Program {
    
    public static final int MAX = 10;

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Quarto[] quarto = new Quarto[MAX];
        boolean aux = false;

        do{
            System.out.printf("\nQuantos quartos (1 - %d) serão alugados?: ", MAX);
            int n = sc.nextInt();
            ArrayList<Integer> ocupados = new ArrayList<Integer>();

            if (n <= MAX) {

                String nome = null, email = null;

                for (int i = 0; i < n; i++) {

                    System.out.printf("\nAluguel: %d\n", i + 1);

                    System.out.print("Nome: ");
                    sc.nextLine();
                    nome = sc.nextLine();

                    System.out.print("Email: ");
                    email = sc.nextLine();

                    System.out.print("Numero do quarto: ");
                    int numQuarto;
                    do{
                        numQuarto = sc.nextInt();
                        if(ocupados.contains(numQuarto)){
                            System.out.print("Quarto ocupado!\nSelecione outro: ");
                        }

                    }while (ocupados.contains(numQuarto));
                    ocupados.add(numQuarto);
                    quarto[numQuarto] = new Quarto(nome, email);
                }

                System.out.println("\nQuartos Ocupados: ");
                for (int i = 0; i < MAX; i++) {
                    if (quarto[i] != null) {
                        System.out.printf("%d: %s, %s\n", i, quarto[i].getNome(), quarto[i].getEmail());
                    }
                }

                aux = true;
            } else {
                System.out.print("\nQuatidade digitada maior que a disponivel!\n");
            }


        }while (!aux);

        sc.close();
    }
}
