package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student estudante = new Student();

        System.out.print("Digite o nome do aluno: ");
        estudante.nome = sc.nextLine();

        System.out.println();
        System.out.printf("Digite as 3 notas do(a) %s: \n",estudante.nome);
        estudante.nota1 = sc.nextDouble();
        estudante.nota2 = sc.nextDouble();
        estudante.nota3 = sc.nextDouble();

        System.out.println();
        System.out.println(estudante.toString());

        estudante.situacao();



        sc.close();
    }
}
