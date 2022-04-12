import java.util.Locale;
import java.util.Scanner;
/*Faça um programa que leia 5 valores inteiros. Conte quantos destes valores digitados são pares e mostre esta informação.*/
public class uri1065{
    public static void main(String[] args){
        
        int[] n1 = new int[5];
        int pares = 0;
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0;i < 5;i++){
            n1[i] = sc.nextInt();
            if(n1[i] % 2 == 0){
                pares ++;
            }
        }

        System.out.printf("%d valores pares\n",pares);

        sc.close();
    }
}
