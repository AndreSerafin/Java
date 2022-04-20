import java.util.Locale;
import java.util.Scanner;
/*
Leia um valor inteiro N. Este valor será a quantidade de valores que serão lidos em seguida. Para cada valor lido, mostre uma mensagem 
em inglês dizendo se este valor lido é par (EVEN), ímpar (ODD), positivo (POSITIVE) ou negativo (NEGATIVE). No caso do valor ser igual a 
zero (0), embora a descrição correta seja (EVEN NULL), pois por definição zero é par, seu programa deverá imprimir apenas NULL.
*/
public class uri1074{
    public static void main(String[] args){

        int n,x;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for(int i=1;i<=n;i++){
            x = sc.nextInt();
            
            if(x != 0){

                if(x % 2 == 0){
                    System.out.printf("EVEN ");
                }else{
                    System.out.printf("ODD ");
                }
                if(x > 0){
                    System.out.printf("POSITIVE\n");
                } else{
                    System.out.printf("NEGATIVE\n");
                }
            }else{
                System.out.printf("NULL\n");
            }
        }


        sc.close();
    }
}