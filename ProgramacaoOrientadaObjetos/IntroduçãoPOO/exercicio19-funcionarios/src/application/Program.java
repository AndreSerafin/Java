package application;

import entities.Funcionario;
import entities.FuncionarioTerceirizado;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero de funcionarios: ");
        int n = sc.nextInt();

        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Funcionario f1;
            System.out.printf("\nDados funcionario #%d\n", i + 1);
            char op;

                System.out.print("Terceirizado(s/n)? ");
                sc.nextLine();
                op = sc.next().charAt(0);
                System.out.print("Nome: ");
                sc.nextLine();
                String nome = sc.nextLine();
                System.out.print("Horas: ");
                int horas = sc.nextInt();
                System.out.print("Valor por hora: ");
                double valHora = sc.nextDouble();
                boolean key = false;

            do{


                switch (op) {
                    case 's' -> {
                        System.out.print("Custos adicionais: ");
                        double custosAdc = sc.nextDouble();
                        f1 = new FuncionarioTerceirizado(nome, horas, valHora, custosAdc);
                        funcionarios.add(f1);
                        key = true;
                    }
                    case 'n' -> {
                        f1 = new Funcionario(nome, horas, valHora);
                        funcionarios.add(f1);
                        key = true;
                    }
                    default -> {
                        System.out.print("Opção Inválida!\nSelecione novamente:\n ");
                        System.out.print("Terceirizado(s/n)? ");
                        sc.nextLine();
                        op = sc.next().charAt(0);
                    }
                }

            }while (!key);
        }

        System.out.println("Pagamentos: ");
        for (Funcionario f : funcionarios) {
            System.out.printf("\n%s - $ %.2f", f.getNome(), f.pagamento());
        }

        sc.close();
    }

}
