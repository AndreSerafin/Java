import java.util.Locale; 
import java.util.Scanner;
/*Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. 
As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.*/
public class uri1018 {
    public static void main(String[] args){
        
        int[] cedulas = {100,50,20,10,5,2,1};
        int valor,quantidade=0,resto=0;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
       
        valor = sc.nextInt();
        resto = valor;
        for(int i = 0;i <= 6;i++){
            quantidade = valor/cedulas[i];
            resto %= cedulas[i];
            System.out.printf("%d nota(s) de R$ %d,00\n",resto,cedulas[i]);
        }
        

        sc.close();
        
    }
}
