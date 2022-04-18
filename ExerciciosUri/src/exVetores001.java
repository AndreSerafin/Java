import java.util.Locale;
import java.util.Scanner;

/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela o maior número
do vetor (supor não haver empates). Mostrar também a posição do maior elemento.*/
public class exVetores001 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vet1 = new double[n];
        
        for(int i = 0; i < n; i++){
            vet1[i] = sc.nextDouble();
            
        }
        double maior = vet1[0];
        int posicao = 0;

        for(int i = 1; i < n;i++){
            if(vet1[i] > maior){
                maior = vet1[i];
                posicao = i;
            }
        }

        System.out.printf("Maior = %.2f\n",maior);
        System.out.printf("Posição = %d\n",posicao);

        sc.close();
    }
}