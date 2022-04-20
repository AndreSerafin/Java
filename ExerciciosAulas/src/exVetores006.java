import java.util.Locale;
import java.util.Scanner;
/*Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Depois, mostrar na tela o nome
da pessoa mais velha.*/
public class exVetores006 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] vetNomes = new String[n];
        int[] vetIdade = new int[n];

        for(int i = 0; i < n; i++){
            vetNomes[i] = sc.next();
            vetIdade[i] = sc.nextInt();
        }

        int maior = 0;
        String maisVelho = " ";

        for(int i = 0; i < n; i++){
            if(vetIdade[i] > maior){
                maior = vetIdade[i];
                maisVelho = vetNomes[i];
            }      
        }

        System.out.printf("Pessoa mais velha: %s\n",maisVelho);

        sc.close();
    }
}
