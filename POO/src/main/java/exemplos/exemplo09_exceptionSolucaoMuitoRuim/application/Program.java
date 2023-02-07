package exemplos.exemplo09_exceptionSolucaoMuitoRuim.application;

import exemplos.exemplo09_exceptionSolucaoMuitoRuim.model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Numero do quarto: ");
        int number = sc.nextInt();
        System.out.print("Data de Check-in: ");
        Date checkIn = sdf.parse(sc.next());
        System.out.print("Data de Check-out: ");
        Date checkOut = sdf.parse(sc.next());

        if(!checkOut.after(checkIn)) {
            System.out.println("Erro na reserva: data de check-out deve ser depois da data de check-in!");
        }else {
            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reserva: " + reservation);

            System.out.println();
            System.out.println("Digite os dados para atualizar a reserva!");
            System.out.print("Data de Check-in: ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Data de Check-out: ");
            checkOut = sdf.parse(sc.next());

            Date now = new Date();
            if(checkIn.before(now) || checkOut.before(now)) {
                System.out.println("Erro no reserva: Datas de reserva para atualização devem ser futuras!");
            }else if(!checkOut.after(checkIn)) {
                System.out.println("Erro na reserva: data de check-out deve ser depois da data de check-in!");
            }else {
                reservation.updateDates(checkIn,checkOut);
                System.out.println("Reserva: " + reservation);
            }


        }

        sc.close();
    }
}
