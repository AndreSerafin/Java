import java.util.Locale;
import java.util.Scanner;
/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.*/
public class uri1038 {
    public static void main(String[] args){
        
        int n,quant;
        double total = 0;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        quant = sc.nextInt();

        switch(n){
            case 1:
                total = quant * 4.0;
                break;
            case 2:
                total = quant * 4.5;
                break;
            case 3:
                total = quant * 5.0;
                break;
            case 4:
                total = quant * 2.0;
                break;
            case 5:
                total = quant * 1.5;
                break;
        }

        System.out.printf("Total: R$ %.2f\n",total);
        
        sc.close();
    }
}
