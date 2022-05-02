import java.util.Locale;
import java.util.Scanner;
/*Leia um conjunto não determinado de pares de valores M e N (parar quando algum dos valores for menor ou igual a zero). 
Para cada par lido, mostre a sequência do menor até o maior e a soma dos inteiros consecutivos entre eles (incluindo o N e M).*/ 
public class uri1101 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int m,n,maior=0,menor=0;

        m = sc.nextInt();
        n = sc.nextInt();
        
        
        
        int soma=0;

        while(m > 0 && n > 0){
            
            if(m > n){
                maior = m;
                menor = n;
            }else{
                maior = n;
                menor = m;
    
            }

            for(int i = menor;i <= maior;i++){
                System.out.printf("%d ",i);
                soma += i;
            }
            System.out.printf("Sum=%d\n",soma);
            soma = 0;
            
            m = sc.nextInt();
            n = sc.nextInt();
            
        }

        sc.close();
    }
}