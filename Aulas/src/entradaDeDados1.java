import java.util.Locale;
import java.util.Scanner;

public class entradaDeDados1 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        int y;
        double z;
        String x;
        //char c;
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();

        System.out.printf("Dados digitados: \n%s \n%d \n%.2f", x, y, z);
        
        sc.close();
    }
}
