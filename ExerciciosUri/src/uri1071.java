import java.util.Locale;
import java.util.Scanner;

/*Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos números impares entre eles.*/

public class uri1071{
    public static void main(String[] args) {
        
        int n1,n2,soma=0;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        n1 = sc.nextInt();
        n2 = sc.nextInt();

        if(n1>n2){
            for(int i = n2 + 1;i<n1;i++){
                if(i % 2 != 0){
                    
                    soma+=i;
                }
            }

        }else{
            for(int i = n1 + 1;i<n2;i++){
                if(i % 2 != 0){
                    
                    soma+=i;
                }
            }
        }

        System.out.printf("%d\n",soma);

        sc.close();
    }
}