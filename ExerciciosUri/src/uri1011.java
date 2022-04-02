import java.util.Locale;
import java.util.Scanner;
/* Faça um programa que calcule e mostre o volume de uma esfera sendo fornecido o valor de seu raio (R). A fórmula para calcular o volume é:
(4/3) * pi * R3. Considere (atribua) para pi o valor 3.14159.
Dica: Ao utilizar a fórmula, procure usar (4/3.0) ou (4.0/3), pois algumas linguagens (dentre elas o C++), assumem que o resultado da divisão 
entre dois inteiros é outro inteiro. */
public class uri1011 {
    public static void main(String[] args){
        double pi = 3.14159,vol;
        int raio;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        raio = sc.nextInt();

        vol = 4/3.0 * pi * Math.pow(raio,3);

        System.out.printf("VOLUME = %.3f\n",vol);

        sc.close();
        
    }
}
