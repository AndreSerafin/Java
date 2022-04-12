import java.util.Locale;
import java.util.Scanner;
/*Escreva um algoritmo que leia 2 números e imprima o resultado da divisão do primeiro pelo segundo. 
Caso não for possível mostre a mensagem “divisao impossivel” para os valores em questão.*/
public class uri1116 {
    public static void main(String[] args){

        int x;
        double n1,n2,div;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();

        for(int i = 1;i <= x;i++){
            n1 = sc.nextDouble();
            n2 = sc.nextDouble();

            if(n2 == 0){
                System.out.printf("divisao impossivel\n");
            }else{

                div = n1 / n2;
    
                System.out.printf("%.1f\n",div);
            }
        }

        sc.close();
    }
}
