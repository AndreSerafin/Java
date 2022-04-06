import java.util.Locale;
import java.util.Scanner;
/*Faça um programa que leia 6 valores. Estes valores serão somente negativos ou positivos (desconsidere os valores nulos). 
A seguir, mostre a quantidade de valores positivos digitados.*/
public class uri1067{
    public static void main(String[] args){
        
        int n,n1;
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();

        for(int i = 1; i <= n;i++){

            if(i % 2 != 0){
                n1 = i;
                System.out.printf("%d\n",n1);
            }
            
        }

        sc.close();
    }
}
