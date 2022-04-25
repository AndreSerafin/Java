import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa para ler dois números inteiros M e N. Em seguida, ler uma matriz de M linhas e N colunas
contendo números double. Gerar um vetor de modo que cada elementodo vetor seja a soma dos elementos da linha 
correspondente da matriz.
Mostrar o vetor gerado.*/
public class ex013 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        double[][] matriz = new double[m][n];
        double[] vetor = new double[m];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                matriz[i][j] = sc.nextDouble();
                vetor[i] += matriz[i][j]; 
            }
            System.out.println();
        }
        System.out.printf("Vetor: ");
        for(int i = 0; i < m; i++){
            System.out.printf("%.2f ", vetor[i]);
        }

        System.out.printf("\n");
        sc.close();

    } 
}
