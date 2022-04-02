import java.util.Scanner;
import java.util.Locale;
/*Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo 
produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/
public class uri1007 {
    public static void main(String[] args){
        
        int a,b,c,d,dif;

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        dif = (a * b) - (c * d);

        System.out.printf("DIFERENCA = %d\n",dif);

        sc.close();

    }
}
