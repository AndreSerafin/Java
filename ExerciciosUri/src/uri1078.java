import java.util.Locale;
import java.util.Scanner;
/*O programa deve ler um valor inteiro X indefinidas vezes. (O programa irá parar quando o valor de X for igual a 0). Para cada X lido,
imprima a soma dos 5 pares consecutivos a partir de X, inclusive o X , se for par. Se o valor de entrada for 4, por exemplo, a saída deve 
ser 40, que é o resultado da operação: 4+6+8+10+12, enquanto que se o valor de entrada for 11, por exempo, a saída deve ser 80, que é a 
soma de 12+14+16+18+20.*/ 
public class uri1078{
    public static void main(String[] args) {
        
        int n=1;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while(n!=0){
            
            for(int i = 1;i<=10;i++){
                System.out.printf("%d x %d = %d\n",n,i,n*i);
            }
            n = sc.nextInt();
        }


        sc.close();
    }
}