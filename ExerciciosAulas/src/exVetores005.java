import java.util.Locale;
import java.util.Scanner;
/*Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média aritmética somente
dos números pares lidos.*/
public class exVetores005 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vet = new double[n];
        double media = 0;
        int pares = 0; 

        for (int i = 0; i < n; i++) {
            vet[i] = sc.nextDouble();
            if(vet[i] % 2 == 0){
                media += vet[i];
                pares++;
            }
        }
        media /= (double) pares;

        System.out.printf("Media: %.2f\n",media);

        sc.close();
    }
}
