/*Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as
seguintes operações:
void armazenaPessoa(String nome, int idade, float altura);
void removePessoa(String nome);
int buscaPessoa(String nome); // informa em que posição da agenda está a pessoa
void imprimeAgenda(); // imprime os dados de todas as pessoas da agenda
void imprimePessoa(int index); // imprime os dados da pessoa que está na posição “i” da
agenda.*/

package application;

import util.Agenda;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int op;
        boolean key = false;

        do{

            System.out.println("\n╭────────────────────────────────────────╮");
            System.out.println("│            Menu de opções:             │");
            System.out.println("│        0. Finalizar programa:          │");
            System.out.println("│         1. Armazenar pessoa:           │");
            System.out.println("│  2. Vizualizar pessoas armazernadas:   │");
            System.out.println("│         3. Excluir uma pessoa:         │");
            System.out.println("╰────────────────────────────────────────╯");

            op = sc.nextInt();

            switch (op){
                case 1 -> {
                    Agenda.armazenaPessoa();
                    key = true;
                }case 2 -> {
                    if(!key){
                        System.out.println("Nehuma pessoa armazenada ate o momento!");
                    }else {
                        Agenda.vizualizaPessoas();
                    }
                }case 3 -> {
                    if(!key){
                        System.out.println("Nehuma pessoa armazenada ate o momento!");
                    }else {
                        Agenda.excluiPessoa();
                    }
                } case 0 -> {
                }
                default -> {
                    System.out.printf("\nOpção Inválida!");
                }
            }



        }while (op != 0);

        Agenda.armazenaPessoa();

        sc.close();
    }
}
