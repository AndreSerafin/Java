import java.util.Locale;
import java.util.Scanner;
/*Escreva um programa que leia um valor inteiro N. Este N é a quantidade de linhas de saída que serão apresentadas na execução do programa.*/ 
public class uri1142{
    public static void main(String[] args) {
        
        int n,a=0,b=0,c=0;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
           
        a = 1;
        for(int i = 1;i <= n;i++){
            System.out.printf("%d ",a);
            b= a + 1;
            System.out.printf("%d ",b);
            c= b + 1;
            System.out.printf("%d ",c);
            System.out.printf("PUM\n");
            a = c + 2;
        }

        

        sc.close();
    }
}