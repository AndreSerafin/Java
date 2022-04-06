import java.util.Locale;
import java.util.Scanner;
/*Faça um programa que leia 6 valores. Estes valores serão somente negativos ou positivos (desconsidere os valores nulos). 
A seguir, mostre a quantidade de valores positivos digitados.*/
public class uri1067{
    public static void main(String[] args){
        
        int n;
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        int[] n1 = new int[n];

        for(int i = 1; i <= n;i++){

            if(i % 2 != 0){
                n1[i] = i;
                System.out.printf("%d\n",n1[i]);
            }
            
        }

        sc.close();
    }
}
