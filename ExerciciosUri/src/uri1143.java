import java.util.Locale;
import java.util.Scanner;
/*Escreva um programa que leia um valor inteiro N. Este N é a quantidade de linhas de saída que serão apresentadas na execução do programa.*/ 
public class uri1143{
    public static void main(String[] args) {
        
        int n;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        
        for(int i = 1;i <= n;i++){
            System.out.printf("%d %d %d\n",i, (int) Math.pow(i, 2), (int) Math.pow(i, 3));
        }

        

        sc.close();
    }
}