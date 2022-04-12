import java.util.Locale;
import java.util.Scanner;
/*Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.*/
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
