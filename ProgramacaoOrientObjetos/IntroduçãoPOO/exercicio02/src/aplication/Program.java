package aplication;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee funcionario = new Employee();

        System.out.println("Digite o nome do funcionario: ");
        funcionario.nome = sc.nextLine();

        System.out.println();
        System.out.println("Digite o salario bruto do funcionario: ");
        funcionario.salarioBruto = sc.nextDouble();

        System.out.println();
        System.out.println("Digite o valor do imposto a ser pago: ");
        funcionario.imposto = sc.nextDouble();

        System.out.println(funcionario.toString());

        System.out.println();
        System.out.println("Em quantos porcento o salario será aumentado? ");
        double porcentagem = sc.nextDouble();
        funcionario.aumentoSalarial(porcentagem);

        sc.close();
    }
}
