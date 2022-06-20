package application;

import entities.Ponto;

import java.util.Arrays;
import java.util.Locale;

public class TesteClassePonto {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Ponto p1 = new Ponto(6,11);

        System.out.println(p1.toString());

        System.out.printf("%.4f\n", p1.distancia(2,3));

        Ponto p2 = new Ponto(6,5);

        System.out.printf("%.4f\n", p1.distancia(p2));
        System.out.printf("%.4f\n", p2.distancia(p1));
        System.out.printf("%4f\n", p1.distancia());

        System.out.println(p2.getXY()[0]);
        System.out.println(p2.getXY()[1]);

        Ponto[] pontos = new Ponto[10];
        for (int i = 0; i < 10; i++) {
            Ponto p3 = new Ponto(i + 1 , i+ 1);
            pontos[i] = p3;
            System.out.println(pontos[i].toString());
        }

    }

}
