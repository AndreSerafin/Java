import java.util.Locale;
import java.util.Scanner;
/*Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.*/
public class uri1153 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int fat = 1;
        
        for(int i = 1;i <= n;i++){
            fat *= i; 
        }
        System.out.printf("%d\n",fat);


        sc.close();
    }
}
