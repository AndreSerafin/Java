package aplication;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle retangulo = new Rectangle();

        System.out.println("Digite a altura do retangulo: ");
        retangulo.altura = sc.nextDouble();

        System.out.println("Digite a largura do retangulo: ");
        retangulo.largura = sc.nextDouble();

        System.out.println(retangulo.toString());
        sc.close();

    }
}
