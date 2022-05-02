import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa para ler um vetor de N números reais. Em seguida, mostrar na tela a média aritmética de todos
elementos. Depois mostrar todos os elementos do vetor que estejam abaixo da média.*/

public class exVetores004 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vet = new double[n];

        for(int i = 0; i < n; i++){
            vet[i] = sc.nextDouble();
        }

        double media = 0;

        for(int i = 0; i < n; i++){
            media += vet[i];
        }
        
        media /= n;

        System.out.printf("Media: %.3f\n",media);

        System.out.printf("Abaixo da media: ");
        for(int i = 0; i < n; i++){
            if(vet[i] < media){
                System.out.printf("%.1f ",vet[i]);
            }
        }
        System.out.println();

        sc.close();
    }
}
