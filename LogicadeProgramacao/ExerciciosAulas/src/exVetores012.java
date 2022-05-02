import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

/* Faça um programa que preencha um vetor com 100 números inteiros. Calcule e mostre:
• O vetor preenchido 
• Os números primos e suas posições
• Quantos números são menores que a soma dos primos*/

public class exVetores012 {
    
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Random numsAleatorios = new Random();
        
        System.out.printf("Digite a quantidade de numeros a serem analisados\n");
        int n = sc.nextInt();
        int[] numeros = new int[n];
        int[] vetPrimos = new int[n];
        int primos = 0;

        for(int i = 0; i < n; i++){
            numeros[i] = numsAleatorios.nextInt(100);
            //System.out.printf("%d\n",numeros[i]);
            if(numeros[i] == 0 || numeros[i] == 1){
                //nao primo
                continue;
            }else if(numeros[i] == 2 || numeros[i] == 3 || numeros[i] == 5 || numeros[i] == 7){
                vetPrimos[primos] = numeros[i];
                primos++;
            }else if(numeros[i] % 2 == 0 || numeros[i] % 3 == 0 || numeros[i] % 5 == 0 || numeros[i] % 7 == 0){
                //nao primo
                continue;
            }else{
                vetPrimos[primos] = numeros[i];
                primos++;
            }
        }
        System.out.printf("\nVetor Preenchido: ");
        for(int i = 0; i < n; i++){
            System.out.printf("%d ",numeros[i]);
        }
        System.out.println();
        
        System.out.printf("\nPrimos: ");
        for(int i = 0; i < primos; i++){
            System.out.printf("%d ",vetPrimos[i]);
        }
        System.out.println();

        

        sc.close();
    }
}
