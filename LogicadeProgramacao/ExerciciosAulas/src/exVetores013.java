import java.util.Locale;
import java.util.Scanner;

/*Faça um programa que leia um vetor com quinze posições para números inteiros. Depois da leitura, divida todos os seus elementos 
pelo maior valor do vetor. Mostre o vetor após os cálculos.*/

public class exVetores013 {
    public static void main(String[] agrs){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um tamanho para o vetor: \n");
        int n = sc.nextInt();

        int[] vet = new int[n];
        System.out.printf("Digite %d numeros para preencher o vetor:\n",n);
        for(int i = 0; i < n;i++){
            vet[i] = sc.nextInt();
        }

        int maior = acharMaior(vet, n);

        double[] vet2 = new double[n];
        vet2 = dividirPeloMaior(maior, vet, n);

        System.out.printf("\nVetor dividido por %d: \n",maior);
        for(int i = 0; i < n; i++){
            System.out.printf("%.2f ",vet2[i]);
        }

        sc.close();
    }

    public static int acharMaior(int[] vetor, int n){

        int maior = 0;

        for(int i = 0; i < n; i++){
            if(vetor[i] > maior){
                maior = vetor[i];
            }
        }
        //System.out.printf("%d",maior);

        return maior;
    }

    public static double[] dividirPeloMaior(int maior, int[] vet, int n){

        double[] vet2 = new double[n];

        for(int i = 0; i < n; i++){
            vet2[i] = vet[i] / (double) maior;
            //System.out.printf("%.2f ",vet2[i]);
        }
        

        return vet2;
    }
}