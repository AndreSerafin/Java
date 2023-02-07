package exercicios.exerc17_figuras.application;

import exercicios.exerc17_figuras.entities.Circulo;
import exercicios.exerc17_figuras.entities.Forma;
import exercicios.exerc17_figuras.entities.Retangulo;
import exercicios.exerc17_figuras.entitiesEnum.Cor;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.RecursiveTask;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ArrayList<Forma> formas = new ArrayList<Forma>();

        System.out.print("Número de formas: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("\nForma #%d: \n", i + 1);
            System.out.print("Retangulo ou circulo(r/c)?: ");
            sc.nextLine();
            char op = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Cor(Preto/Azul/Vermelho): ");
            Cor cor = Cor.valueOf(sc.nextLine().toUpperCase());
            boolean key = false;
            do{
                switch (op) {
                    case 'r' -> {
                        System.out.print("Largura: ");
                        double largura = sc.nextDouble();
                        System.out.print("Altura: ");
                        double altura = sc.nextDouble();
                        formas.add(new Retangulo(cor, largura, altura));
                        key = true;
                    }
                    case 'c' -> {
                        System.out.print("Raio: ");
                        double raio = sc.nextDouble();
                        formas.add(new Circulo(cor, raio));
                        key = true;
                    }
                    default -> {
                        System.out.print("Opção inválida\nDigite novamente(r/c): ");
                        sc.nextLine();
                        op = sc.next().charAt(0);
                    }
                }
            }while (!key);
        }

        System.out.println("\nAreas das Formas: ");
        for (Forma f : formas) {
            System.out.printf("%.2f\n", f.area());
        }

        sc.close();
    }

}
