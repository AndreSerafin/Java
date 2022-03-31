import java.util.Locale;
import java.util.Scanner;

public class entradaDeDados2{
    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        
        //sc.next() lê apenas uma palavra
        //sc.nextLine() lê até a quebra de linha
        
        int x;
        String s1,s2,s3;
        x = sc.nextInt();
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.printf("\nDados digitados: \n%d \n%s \n%s \n%s", x, s1, s2, s3);
        
        sc.close();
    }
}
