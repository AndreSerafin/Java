import java.util.Locale;
import java.util.Scanner;
/*Leia um valor inteiro N que é a quantidade de casos de teste que vem a seguir. Cada caso de teste consiste de dois inteiros X e Y. 
Você deve apresentar a soma de Y ímpares consecutivos a partir de X inclusive o próprio X se ele for ímpar. Por exemplo:
para a entrada 4 5, a saída deve ser 45, que é equivalente à: 5 + 7 + 9 + 11 + 13
para a entrada 7 4, a saída deve ser 40, que é equivalente à: 7 + 9 + 11 + 13*/
public class uri1158 {
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1;i <= n;i++){
            
            int soma = 0;
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(x % 2 == 0){
                
                for(int count = x;count <= x + y * 2;count++){
                    if(count % 2 != 0){
                        soma += count;
                    }
                }
            }else{
                
                for(int count = x;count < x + y * 2;count++){
                    if(count % 2 != 0){
                        soma += count;
                    }
                }
            }
            System.out.printf("%d\n",soma);
            
           
        }



        sc.close();
    }
}
