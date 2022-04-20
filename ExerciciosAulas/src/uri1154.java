import java.util.Locale;
import java.util.Scanner;
/*Faça um algoritmo para ler um número indeterminado de dados, contendo cada um, a idade de um indivíduo. O último dado, 
 não entrará nos cálculos, contém o valor de idade negativa. Calcular e imprimir a idade média deste grupo de indivíduos.*/
public class uri1154{
    public static void main(String[] args) {
        
        int idade=0;
        double media=0;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int i=0;
        while(idade >= 0){
            idade = sc.nextInt();
            
            if(idade > 0){
                
                media+=idade;
                i++;
            }

        }

        //System.out.printf("%d\n",i);

        media /=(double) i;

        System.out.printf("%.2f\n",media);

        sc.close();
    }
}