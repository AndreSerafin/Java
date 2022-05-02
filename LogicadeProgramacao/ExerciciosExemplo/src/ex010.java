import java.util.Locale;
import java.util.Scanner;
/*Faça um programa que leia N números reais e armazene-os em um vetor.
Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor*/
public class ex010 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vet = new double[n];
        double soma = 0;

        for(int i = 0;i < n;i++){
            vet[i] = sc.nextDouble();
        }

        for(int i = 0;i < n;i++){
            soma += vet[i];
            System.out.printf("%.2f ",vet[i]);
        }
        System.out.println();
        
        double media = soma / n;
        System.out.printf("SOMA = %.2f\n",soma);
        System.out.printf("MEDIA = %.2f\n",media);
        sc.close();
    }
}
