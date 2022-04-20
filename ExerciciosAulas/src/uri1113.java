import java.util.Locale;
import java.util.Scanner;
/*Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. Escreva para cada X e Y uma mensagem que indique se estes
valores foram digitados em ordem crescente ou decrescente.*/
public class uri1113{
    public static void main(String[] args) {
        
        int n1,n2;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        n1 = sc.nextInt();
        n2 = sc.nextInt();
        
        while(n1 != n2){

            if(n1 > n2){
                System.out.printf("Decrescente\n");
            }else{
                System.out.printf("Crescente\n");
            }

            n1 = sc.nextInt();
            n2 = sc.nextInt();

        }

        sc.close();
    }
}