import java.util.Locale;
import java.util.Scanner;
/*Faça um programa que leia N números inteiros e armazene-os
em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.*/
public class ex009 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] n1 = new int[n];
        
        for(int i = 0;i < n;i++){
            n1[i] = sc.nextInt();
        }

        for(int i = 0;i < n;i++){
            if(n1[i] < 0){
                System.out.printf("%d\n",n1[i]);
            }
        }

        sc.close();

    }
}
