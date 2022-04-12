import java.util.Locale;
import java.util.Scanner;
/*Leia 100 valores inteiros. Apresente então o maior valor lido e a posição dentre os 100 valores lidos.*/
public class uri1080 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num = 100,pos=0,maior=0,n;

        n = sc.nextInt();
        
        maior = n;
        pos = 1;

        for(int i=2;i <= num;i++){
            n = sc.nextInt();
            
            if(n > maior){
                maior = n;
                pos = i;
            }
            
        }
        System.out.println(maior);
        System.out.println(pos);
        sc.close();
       
    }
}
