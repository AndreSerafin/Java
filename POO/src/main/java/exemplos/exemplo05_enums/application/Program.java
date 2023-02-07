package exemplos.exemplo05_enums.application;

import exemplos.exemplo05_enums.entities.*;
import exemplos.exemplo05_enums.entities.enums.NivelDoTrabalhahor;

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

        System.out.print("Nome do Departamento: ");
        String nomeDeparatamento = sc.nextLine();
        System.out.println("Dados do trabalhador ");
        System.out.print("Nome: ");
        String nomeTrab = sc.nextLine();
        System.out.print("Nível: ");
        String nivel = sc.nextLine();
        System.out.print("Salário base: ");
        double salarioBase = sc.nextDouble();

        Trabalhador trabalhador = new Trabalhador(nomeTrab, NivelDoTrabalhahor.valueOf(nivel),
                salarioBase, new Departamento(nomeDeparatamento));

        System.out.print("Quantos contratos para esse trabalhador? ");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.printf("Contrato # %d\n", i + 1);
            System.out.print("Data (DD/MM/AAAA): ");
            Date dataDoContrato = sdf.parse(sc.next());
            System.out.print("Valor por hora: ");
            double valHora = sc.nextDouble();
            System.out.print("Duração(horas): ");
            int horas = sc.nextInt();
            ContratoPorHora contrato = new ContratoPorHora(dataDoContrato, valHora, horas);
            trabalhador.addContrato(contrato);
        }
        
        System.out.println();
        System.out.print("Mes e ano para calcular o salario (MM/AAAA): ");
        String[] mesAno = sc.next().split("/");
        int mes = Integer.parseInt(mesAno[0]);
        int ano = Integer.parseInt(mesAno[1]);
        
        System.out.printf("Nome: %s\n", trabalhador.getNome());
        System.out.printf("Departamento: %s\n", trabalhador.getDepartamento().getNome());
        System.out.printf("Ganhos em %d/%d: %.2f", mes, ano, trabalhador.ganhos(ano,mes));

        sc.close();

    }

}
