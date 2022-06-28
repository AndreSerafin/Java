package application;

import entities.Ponto;
import entities.Triangulo;

public class TesteClasseTriangulo {
    public static void main(String[] args) {

        Triangulo t1 = new Triangulo(-5, 5, 15, 5, 5, -12.32);

        System.out.println(t1.existe());
        System.out.println(t1.tipo());
        System.out.println(t1.toString());
        Ponto p1 = new Ponto(3, 1);
        Ponto p2 = new Ponto(6, 3);
        Ponto p3 = new Ponto(-2, 9);
        Triangulo t2 = new Triangulo(p1, p2, p3);
        System.out.println(t2.existe());
        System.out.println(t2.tipo());
        System.out.println(t2.toString());
    }
}
