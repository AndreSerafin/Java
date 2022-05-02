import java.util.Locale;
import java.util.Scanner;
/*Escreva um programa que leia dois valores X e Y. A seguir, mostre uma sequência de 1 até Y, 
passando para a próxima linha a cada X números.*/ 
public class uri1146 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
         while(x != 0){

            for(int i = 1;i < x;i++){
                System.out.printf("%d ",i);
            }
            System.out.printf("%d\n",x);;
            x = sc.nextInt();
         }

        sc.close();
    }
}