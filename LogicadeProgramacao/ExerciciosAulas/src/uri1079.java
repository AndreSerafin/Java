import java.util.Locale;
import java.util.Scanner;
/*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste de 3 valores reais, 
cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que o primeiro valor 
tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.*/ 
public class uri1079{
    public static void main(String[] args) {
        
        int n;
        double n1,n2,n3,media;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();

        for(int i=1;i<=n;i++){
            n1 = sc.nextDouble();
            n2 = sc.nextDouble();
            n3 = sc.nextDouble();

            media = (n1 * 2 + n2 * 3 + n3 * 5) / 10.0;

            System.out.printf("%.1f\n",media);
        }

        sc.close();
    }
}