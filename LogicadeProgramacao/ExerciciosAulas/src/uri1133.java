import java.util.Locale;
import java.util.Scanner;
/*Escreva um algoritmo que leia 2 valores inteiros X e Y calcule a soma dos números que não são múltiplos de 13 entre X e Y, incluindo ambos.*/
public class uri1133 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        
        int maior,menor;

        if(x > y){
            maior = x;
            menor = y;
        }else{
            maior = y;
            menor = x;
        }

        int soma = 0;
        for(int i = menor;i <= maior;i++){
            if(i % 13 != 0){
                soma += i;
            }
        }System.out.printf("%d\n",soma);

        sc.close();
    }
    
}
