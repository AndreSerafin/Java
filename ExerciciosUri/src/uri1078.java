import java.util.Locale;
import java.util.Scanner;
/*Leia 1 valor inteiro N (2 < N < 1000). A seguir, mostre a tabuada de N:      
1 x N = N      2 x N = 2N        ...       10 x N = 10N*/ 
public class uri1078{
    public static void main(String[] args) {
        
        int n;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();

        for(int i = 1; i <= 10;i++){
            System.out.printf("%d x %d = %d\n",i,n,i*n);
        }

        sc.close();
    }
}