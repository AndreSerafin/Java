package application;

import model.entities.Reservation;
import model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Numero do quarto: ");
            int number = sc.nextInt();
            System.out.print("Data de Check-in: ");
            Date checkIn = sdf.parse(sc.next());
            System.out.print("Data de Check-out: ");
            Date checkOut = sdf.parse(sc.next());


            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reserva: " + reservation);

            System.out.println();
            System.out.println("Digite os dados para atualizar a reserva!");
            System.out.print("Data de Check-in: ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Data de Check-out: ");
            checkOut = sdf.parse(sc.next());

            reservation.updateDates(checkIn, checkOut);

            System.out.println("Reservation: " + reservation);
        } catch (ParseException e ) {
            System.out.println("Invalid date format!");
        } catch (DomainException e) {
            System.out.println("Erro na reserva: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Erro Inesperado");
        }

        sc.close();
    }
}
