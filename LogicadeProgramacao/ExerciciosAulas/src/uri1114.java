import java.util.Locale;
import java.util.Scanner;
/*Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha incorreta informada, 
escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e 
o algoritmo encerrado. Considere que a senha correta é o valor 2002.
*/
public class uri1114{
    public static void main(String[] args) {
        
        int n1;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        n1 = sc.nextInt();
        while(n1 != 2002){
            System.out.printf("Senha Invalida\n");
            n1 = sc.nextInt();
        }
        if(n1 == 2002){
            System.out.printf("Acesso Permitido\n");
        }

        sc.close();
    }
}