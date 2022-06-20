package application;

import entities.Circulo;
import entities.Ponto;

public class TesteClasseCirculo {

    public static void main(String[] args) {

        Circulo c1 = new Circulo();
        c1.setCentroXY(1,5);
        c1.setRaio(9);

        System.out.println(c1.toString());
        System.out.printf("Area: %.2fm²\n", c1.getArea());
        System.out.printf("Circunferencia: %.2fm\n", c1.getCircumferencia());

        Circulo c2 = new Circulo(11, 4, 12);

        System.out.printf("Distancia entre c1 e c2: %.5f\n", c1.distancia(c2));

        Ponto p1 = new Ponto(7,3);

        Circulo c3 = new Circulo(p1, 40);
        System.out.printf("Area: %.2fm²\n", c3.getArea());
        System.out.printf("Distancia entre c3 e c2: %.5f\n", c2.distancia(c3));

    }
}
