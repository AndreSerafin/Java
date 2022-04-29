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

        for(int i = 0; i < n; i++){
            numeros[i] = sc.nextInt();
        }

        int[] mult2 = new int[n];
        int[] mult3 = new int[n];
        int[] mult2e3 = new int[n];
        int quantMult2 = 0, quantMult3 = 0, quantMult2e3 = 0;
        
        for(int i = 0; i < n; i++){
            if(numeros[i] % 2 == 0){
                mult2[quantMult2] = numeros[i];
                quantMult2++;
            }
            if(numeros[i] % 3 == 0){
                mult3[quantMult3] = numeros[i];
                quantMult3++;
            }
            if(numeros[i] % 2 == 0 && numeros[i] % 3 == 0){
                mult2e3[quantMult2e3] = numeros[i];
                quantMult2e3++;
            }
        }

        System.out.printf("Numeros multiplos de 2: \n");
        for(int i = 0; i < quantMult2; i++){
            System.out.printf("%d ", mult2[i]);
        }
        System.out.println();

        System.out.printf("Numeros multiplos de 3: \n");
        for(int i = 0; i < quantMult3; i++){
            System.out.printf("%d ", mult3[i]);
        }
        System.out.println();

        System.out.printf("Numeros multiplos de 2 e 3: \n");
        for(int i = 0; i < quantMult2e3; i++){
            System.out.printf("%d ", mult2e3[i]);
        }
        System.out.println();


        sc.close();
    }
}
