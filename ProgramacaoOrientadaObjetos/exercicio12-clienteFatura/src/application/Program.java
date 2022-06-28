package application;

import entities.Cliente;
import entities.Fatura;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Cliente
        System.out.print("Id do Cliente: ");
        int idCliente = sc.nextInt();

        System.out.print("Nome: ");
        sc.nextLine();
        String nome = sc.nextLine();

        System.out.print("Porcentagem de Desconto: ");
        int desconto = sc.nextInt();

        Cliente cliente = new Cliente(idCliente, nome, desconto);

        //Fatura
        System.out.print("Id da Fatura: ");
        int idFatura = sc.nextInt();

        System.out.print("Valor da Fatura: ");
        double valor = sc.nextDouble();

        Fatura fatura = new Fatura(idFatura, cliente, valor);

        System.out.println(fatura.toString());

        sc.close();
    }
}
