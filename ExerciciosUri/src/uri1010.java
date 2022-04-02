import java.util.Scanner;
import java.util.Locale;
/*Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.*/
public class uri1010 {
    public static void main(String[] args){
        int cod1,cod2,num1,num2;
        double preco1,preco2,valTotal;
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        cod1 = sc.nextInt();
        num1 = sc.nextInt();
        preco1 = sc.nextDouble();
        
        cod2 = sc.nextInt();
        num2 = sc.nextInt();
        preco2 = sc.nextDouble();

        valTotal = num1 * preco1 + num2 * preco2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n",valTotal);

        sc.close();
    }
}
