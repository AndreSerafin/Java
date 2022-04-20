import java.util.Locale;
import java.util.Scanner;
/*Faça um programa para ler um número indeterminado de dados, contendo cada um, a
idade de um indivíduo. O último dado, que não entrará nos cálculos, contém um valor
de idade negativa. Calcular e imprimir a idade média deste grupo de indivíduos. Se for
entrado um valor negativo na primeira vez, mostrar a mensagem "impossivel calcular".*/
public class ex007 {
    public static void main(String[] args){

        int idade;
        double media=0;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        idade = sc.nextInt();

        int i = 0;
        
        while(idade >= 0){

            media += idade;
            
            idade = sc.nextInt();
            i++;
        }
        

        if(media > 0){

            media = (double) media / i;
    
            System.out.printf("Media = %.2f\n",media);
        }else{
            System.out.printf("Impossivel calcular\n");
        }

        sc.close();
    }
}
