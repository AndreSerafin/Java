package application;

import entities.Linha;
import entities.Ponto;

import java.util.Arrays;

public class TesteClasseLinha {

    public static void main(String[] args) {

        Linha l1 = new Linha();
        l1.setInicioXY(79,4);
        l1.setFimXY(11,3);

        System.out.printf("Comprimento l1: %.5f\n", l1.getCoprimento());
        System.out.printf("Gradiente l1: %.5f\n", l1.getGradiente());

        System.out.println("l1: " + l1.toString());

        Linha l2 = new Linha(1,33, 44,32);

        System.out.printf("Comprimento l2: %.5f\n", l2.getCoprimento());

        Ponto p1 = new Ponto(3, 8);
        Ponto p2 = new Ponto(6, 23);

        Linha l3 = new Linha(p1, p2);
        System.out.printf("l3: %s\n", l3.toString());
        System.out.printf("Comprimento l3: %.5f", l3.getCoprimento());



    }

}
