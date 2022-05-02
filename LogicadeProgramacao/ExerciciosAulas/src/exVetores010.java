import java.util.Locale;
import java.util.Scanner;
/*Faça um programa que preencha um vetor com seis elementos numéricos inteiros, 
calcule mostre:
• todos os números pares;
• a quantidade de números pares;
• todos os números ímpares;
• a quantidade de números ímpares.*/
public class exVetores010 {
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite a quantidade de numeros: \n");
        int n = sc.nextInt();
        System.out.printf("Digite %d numeros inteiros: \n",n);
        
        int[] numeros = new int[n];
        int[] numerosPar = new int[n];
        int[] numerosImpar = new int[n];
        int par = 0,impar = 0;
        
        for(int i = 0; i < n; i++){
            numeros[i] = sc.nextInt();
            if(numeros[i] % 2 == 0){
                numerosPar[par] = numeros[i];
                par++;
            }else{
                numerosImpar[impar] = numeros[i];
                impar++;
            }
        }
        System.out.printf("\nPares: ");
        for(int i = 0; i < par; i++){
            System.out.printf("%d ",numerosPar[i]);
        }
        System.out.println();
        System.out.printf("Quantidade de pares: %d\n",par);
        
        System.out.printf("\nImpares: ");
        for(int i = 0; i < impar; i++){
            System.out.printf("%d ",numerosImpar[i]);
        }
        System.out.println();
        System.out.printf("Quantidade de impares: %d\n",impar);
        
        sc.close();
    }
}
