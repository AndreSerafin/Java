/*Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas
válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
possui a maior área.
A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c é a
seguinte (fórmula de Heron):*/

package exemplos.exemplo01_introducaoClasses.application;

import  exemplos.exemplo01_introducaoClasses.entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Digite as medidas do triangulo X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite as medidas do triangulo Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double area1 = x.calculaArea();
        System.out.printf("Area do triangulo X: %.4f\n", area1);
        double area2 = y.calculaArea();
        System.out.printf("Area do triangulo Y: %.4f\n", area2);

        double aux;

        aux = Math.max(area1, area2);
        char triangulo;

        if(aux == area1){
            triangulo = 'X';
        }else{
            triangulo = 'Y';
        }

        System.out.printf("Maior área: %c\n", triangulo);



        sc.close();

    }
}
