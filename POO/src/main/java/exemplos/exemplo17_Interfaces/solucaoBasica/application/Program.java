package exemplos.exemplo17_Interfaces.solucaoBasica.application;

import exemplos.exemplo17_Interfaces.solucaoBasica.entities.CarRental;
import exemplos.exemplo17_Interfaces.solucaoBasica.entities.Vehicle;
import exemplos.exemplo17_Interfaces.solucaoBasica.services.BrazilTaxServices;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel: ");
        System.out.print("Modelo do carro: ");
        String carModel = sc.nextLine();
        System.out.print("Retirada (dd/MM/yy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Retorno (dd/MM/yy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        BrazilTaxServices brazilTaxServices = new BrazilTaxServices();
        System.out.println(brazilTaxServices.tax(50.0));

        sc.close();

    }
}
