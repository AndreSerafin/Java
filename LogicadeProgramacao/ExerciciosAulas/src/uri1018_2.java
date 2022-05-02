import java.util.Locale; 
import java.util.Scanner;
/*Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. 
As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.*/
public class uri1018_2 {
    public static void main(String[] args){
        
        //int[] cedulas = {100,50,20,10,5,2,1};
        int valor,quantidade,resto,nota;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
       
        valor = sc.nextInt();
        resto = valor;

            nota=100;
            quantidade = resto/nota;
            resto %= 100;
            System.out.printf("%d nota(s) de R$ %d,00\n",quantidade,nota);
            
            nota=50;
            quantidade = resto/nota;
            resto %= nota;
            System.out.printf("%d nota(s) de R$ %d,00\n",quantidade,nota);
            
            nota=20;
            quantidade = resto/nota;
            resto %= nota;
            System.out.printf("%d nota(s) de R$ %d,00\n",quantidade,nota);
            
            nota=10;
            quantidade = resto/nota;
            resto %= nota;
            System.out.printf("%d nota(s) de R$ %d,00\n",quantidade,nota);
            
            nota=5;
            quantidade = resto/nota;
            resto %= nota;
            System.out.printf("%d nota(s) de R$ %d,00\n",quantidade,nota);
            
            nota=2;
            quantidade = resto/nota;
            resto %= nota;
            System.out.printf("%d nota(s) de R$ %d,00\n",quantidade,nota);
            
            nota=1;
            quantidade = resto/nota;
            System.out.printf("%d nota(s) de R$ %d,00\n",quantidade,nota);

        sc.close();
        
    }
}
