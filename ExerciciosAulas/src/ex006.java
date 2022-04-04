import java.util.Locale;
import java.util.Scanner;
/*Fazer um programa para ler três números inteiros. Em seguida, mostrar qual o
menor dentre os três números lidos. Em caso de empate, mostrar apenas uma vez.*/
public class ex006 {
    public static void main(String[] args){
        
        int a,b,c,menor=0;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a < b && a < c){
            menor = a;
        }else if(b < c){
            menor = b;
        }else{
            menor = c;
        }

        System.out.printf("Menor = %d\n",menor);

        sc.close();
    }
}
