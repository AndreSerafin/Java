import java.util.Locale;
import java.util.Scanner;
/*Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em
Fahrenheit. Perguntar se o usuário deseja repetir (s/n). Caso o usuário digite "s", repetir o
programa.*/
public class ex008 {
    public static void main(String[] args){

        double c,f;
        char op = ' ';

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        
        do {
            System.out.printf("Digite a temperatura em Celsius: \n");
            c = sc.nextDouble();
            f = (1.8 * c) + 32;
            System.out.printf("%.2f° Celsius = %.2f Fahrenheit\n",c,f);
            System.out.printf("Deseja repetir?(s/n)\n");
            op = sc.next().charAt(0);
        }while(op != 'n');
        
        sc.close();
    }
}
