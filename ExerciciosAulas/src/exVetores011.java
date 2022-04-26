import java.util.Locale;
import java.util.Scanner;
/*Faça um programa que preencha um vetor com sete números inteiros, calcule e mostre:

• os números múltiplos de 2;
• os números múltiplos de 3;
• os números múltiplos de 2 e de 3.*/
public class exVetores011 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite a quantidade de numeros: \n");
        int n = sc.nextInt();
        int[] numeros = new int[n];
        int[] mult2 = new int[n];
        int[] mult3 = new int[n];
        int[] mult2e3 = new int[n];
        
        for(int i = 0; i < n; i++){
            
        }


        sc.close();
    }
}
