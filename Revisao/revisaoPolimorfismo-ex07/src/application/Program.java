package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos funcionarios serão registrados? ");
        int n = sc.nextInt();
        ArrayList<Employee> listaDeFuncionarios = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.printf("Funcionario #%d\n", i + 1);
            System.out.print("Terceirizado (s/n)? ");
            char op = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Horas: ");
            int horas = sc.nextInt();
            System.out.print("Valor por hora: ");
            double valorPorHora = sc.nextDouble();
            boolean key = false;

            do{

                if(op == 'n') {
                    listaDeFuncionarios.add(new Employee(nome, horas, valorPorHora));
                    key = true;
                }else if (op == 's') {
                    System.out.print("Custos adicionais: ");
                    double custosAddc = sc.nextDouble();
                    listaDeFuncionarios.add(new OutsourcedEmployee(nome, horas, valorPorHora,custosAddc));
                    key = true;
                }else{
                    System.out.println("Opção inválida!");
                    op = sc.next().charAt(0);
                }

            }while(!key);
        }

        System.out.println("Payments: ");
        for(Employee e : listaDeFuncionarios) {
            System.out.println(e);
        }

        sc.close();
    }
}
