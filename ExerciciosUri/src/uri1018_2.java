import java.util.Locale; 
import java.util.Scanner;
/*Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. 
As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.*/
public class uri1018_2 {
    public static void main(String[] args){
        
        //int[] cedulas = {100,50,20,10,5,2,1};
        int valor,quantidade;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
       
        valor = sc.nextInt();

        
            quantidade = valor/100;
            quantidade %= 100;
            System.out.printf("%d nota(s) de R$ %d,00\n",quantidade,100);
            
            quantidade = valor/50;
            quantidade %= 50;
            System.out.printf("%d nota(s) de R$ %d,00\n",quantidade,50);
            
            quantidade = valor/20;
            quantidade %= 20;
            System.out.printf("%d nota(s) de R$ %d,00\n",quantidade,20);
            
            
            quantidade = valor/10;
            quantidade %= 10;
            System.out.printf("%d nota(s) de R$ %d,00\n",quantidade,10);
            
            quantidade = valor/5;
            quantidade %= 5;
            System.out.printf("%d nota(s) de R$ %d,00\n",quantidade,5);
            
            quantidade = valor/2;
            quantidade %= 2;
            System.out.printf("%d nota(s) de R$ %d,00\n",quantidade,2);
            
            quantidade = valor/1;
            quantidade %= 1;
            System.out.printf("%d nota(s) de R$ %d,00\n",quantidade,1);

        sc.close();
        
    }
}
