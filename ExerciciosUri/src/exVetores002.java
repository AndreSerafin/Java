import java.util.Locale;
import java.util.Scanner;
/*Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na tela:
- todos os números pares
- a quantidade de números pares*/
public class exVetores002 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] vet = new int[n];
        int[] pares = new int[n];
        
        int j = 0;

        for(int i = 0; i < n; i++){
            vet[i] = sc.nextInt();
            if(vet[i] % 2 == 0){
                pares[j] = vet[i];
                j++;
            }
            
        }

        System.out.printf("Pares = ");
        for(int i = 0; i < j; i++){

            System.out.printf("%d ",pares[i]);
        }
        System.out.println();
        System.out.printf("Número de pares = %d\n",j);

        sc.close();
    }
}
