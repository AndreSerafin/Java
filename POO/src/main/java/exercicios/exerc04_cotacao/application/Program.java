package exercicios.exerc04_cotacao.application;

import exercicios.exerc04_cotacao.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual e o preco do dolar?");
        double preco = sc.nextDouble();
        System.out.println("Quantos dolares serão comprados? ");
        double quantidade = sc.nextDouble();

        System.out.printf("Preço a ser pago: R$ %.2f\n",CurrencyConverter.valorEmReais(preco, quantidade));

        sc.close();
    }

}
