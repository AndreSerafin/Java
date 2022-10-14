package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Digite o nome do departamento: ");
        String nomeDepartamento = sc.nextLine();
        System.out.println("Dados do Funcionario: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Nivel: ");
        String level = sc.nextLine();
        System.out.print("Salario base: ");
        Double salarioBase = sc.nextDouble();

        Worker empregado = new Worker(nome, WorkerLevel.valueOf(level.toUpperCase()),
                salarioBase, new Department(nomeDepartamento));

        System.out.print("Quantos contratos para esse empregado? ");
        int qtddConts = sc.nextInt();
        for(int i = 0; i < qtddConts; i++) {
            System.out.printf("Dados contrato #%d\n", i + 1);
            System.out.print("Data (DD/MM/AAAA): ");
            Date dataDoContrato = sdf.parse(sc.next());
            System.out.print("Valor por hora: ");
            double valHora = sc.nextDouble();
            System.out.print("Duração(horas): ");
            int horas = sc.nextInt();
            HourContract contrato = new HourContract(dataDoContrato, valHora, horas);
            empregado.addContract(contrato);
        }

        sc.nextLine();
        System.out.print("Digite o mes e o ano para calcular o valor recebido (MM/YYYY): ");
        String[] anoMes = sc.nextLine().split("/");
        System.out.printf("Nome: %s\n", empregado.getName());
        System.out.printf("Departamento: %s\n", empregado.getDepartment().getName());
        System.out.printf("Valor recebido em %s/%s: %.2f", anoMes[0],anoMes[1],
                empregado.income(Integer.parseInt(anoMes[0]), Integer.parseInt(anoMes[1])));

        sc.close();
    }
}
