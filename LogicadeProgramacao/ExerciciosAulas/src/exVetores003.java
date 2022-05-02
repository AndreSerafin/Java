import java.util.Locale;
import java.util.Scanner;
/*Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um terceiro vetor C onde
cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima o vetor C gerado.*/
public class exVetores003 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] vetA = new int[n];
        int[] vetB = new int[n];

        for(int i = 0; i < n;i++){
            vetA[i] = sc.nextInt();
        }
        
        for(int i = 0; i < n;i++){
            vetB[i] = sc.nextInt();
        }

        int[] vetC = new int[n];

        for(int i = 0; i < n; i++){
            vetC[i] = vetA[i] + vetB[i];
        }
        System.out.printf("SOMA = ");
        for(int i = 0; i < n; i++){
            System.out.printf("%d ",vetC[i]);
        }
        System.out.println();

        
        sc.close();
    }
}
