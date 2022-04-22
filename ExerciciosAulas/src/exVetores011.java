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
        
        System.out.printf("Digite a quantidade de numeros a serem analisados: \n");
        int n = sc.nextInt();
        int[] numeros = new int[n];
        int[] vetMult2 = new int[n];
        int[] vetMult3 = new int[n];
        int[] vetMult2e3 = new int[n];
        int mult2 = 0, mult3 = 0, mult2e3 = 0;
        
        for(int i = 0; i < n; i++){
            numeros[i] = sc.nextInt();
            if(numeros[i] % 2 == 0){
                vetMult2[mult2] = numeros[i];
                mult2++;
            }
            if(numeros[i] % 3 == 0){
                vetMult3[mult3] = numeros[i];
                mult3++;
            }
            if(numeros[i] % 2 == 0 && numeros[i] % 3 == 0){
                vetMult2e3[mult2e3] = numeros[i];
                mult2e3++;
            }
        }
        
        
        System.out.printf("\nMultiplos de 2: \n");
        for(int i = 0; i < mult2; i++){
            System.out.printf("%d ",vetMult2[i]);
        }
        System.out.println();
        
        System.out.printf("\nMultiplos de 3: \n");
        for(int i = 0; i < mult3; i++){
            System.out.printf("%d ",vetMult3[i]);
        }
        System.out.println();
        
        System.out.printf("\nMultiplos de 2 e 3: \n");
        for(int i = 0; i < mult2e3; i++){
            System.out.printf("%d ",vetMult2e3[i]);
        }
        System.out.println();
        
        sc.close();
    }
    
}
