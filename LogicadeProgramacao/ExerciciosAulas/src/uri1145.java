import java.util.Locale;
import java.util.Scanner;
/*Escreva um programa que leia dois valores X e Y. A seguir, mostre uma sequência de 1 até Y, 
passando para a próxima linha a cada X números.*/ 
public class uri1145 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int x,y;

        x = sc.nextInt();
        y = sc.nextInt();
       
        for(int i = 1;i <= y;i++){
            System.out.printf("%d",i);
            if(i % x == 0){
                System.out.printf("\n");
            }else{
                System.out.printf(" ");
            }
        }

        sc.close();
    }
}