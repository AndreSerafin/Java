import java.util.Locale;
import java.util.Scanner;
/*Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas informações.*/
public class uri1072 {
    public static void main(String[] args){

        int n,x,in=0,out=0;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for(int i = 1;i<=n;i++){
            x = sc.nextInt();
            if(x >= 10 && x <= 20){
                in++;
            }else{
                out++;
            }
        }

        System.out.printf("%d in\n",in);
        System.out.printf("%d out\n",out);

        sc.close();
    }
}
