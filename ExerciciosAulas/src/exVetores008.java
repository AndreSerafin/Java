import java.util.Locale;
import java.util.Scanner;
/*Tem-se um conjunto de dados contendo a altura e o sexo (M, F) de N pessoas. Fazer um programa que calcule e escreva:
• a maior e a menor altura do grupo
• a média de altura das mulheres
• o número de homens*/
public class exVetores008 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] altura = new double[n];
        char[] sexo = new char[n];

        for(int i = 0; i < n; i++){
            altura[i] = sc.nextDouble();
            sexo[i] = sc.next().charAt(0);
            while(sexo[i] != 'F' && sexo[i] != 'M'){
                if(sexo[i] != 'F' && sexo[i] != 'M'){
                    System.out.printf("Sexo Invalido!\n");
                }
                sexo[i] = sc.next().charAt(0);
            }

        }

        double maior = altura[0];
        double menor = altura[0];

        for(int i = 1; i < n; i++){
            if(altura[i] > maior){
                maior = altura[i];
            }
            if(altura[i] < menor){
                menor = altura[i];
            }
        }

        double mediaMulheres = 0;
        int numMulheres = 0;
        int numHomens = 0;
        
        for(int i = 0; i < n; i++){
            if(sexo[i] == 'F'){
                numMulheres++;
                mediaMulheres += altura[i];
            }else{
                numHomens++;
            }
        }

        mediaMulheres /= numMulheres;

        System.out.printf("Menor altura: %.2f\n",menor);
        System.out.printf("Maior altura: %.2f\n",maior);
        System.out.printf("Media das aturas das Mulheres: %.2f\n",mediaMulheres);
        System.out.printf("Numero de Homens: %d\n",numHomens);     
        
        sc.close();
    }
}
