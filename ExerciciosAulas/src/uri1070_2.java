import java.util.Locale;
import java.util.Scanner;
/*Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos a partir de X, um valor por linha, inclusive o X ser for o caso.*/
public class uri1070_2{
    public static void main(String[] args){
        
        int n;
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();

        if(n % 2 != 0){
            for(int i = n; i <= n + 10;i++){

                if(i % 2 != 0){
                   
                    System.out.printf("%d\n",i);
                }
                
            }
        }else{

            for(int i = n; i <= n + 12;i++){
    
                if(i % 2 != 0){
                   
                    System.out.printf("%d\n",i);
                }
                
            }
        }

        sc.close();
    }
}
