import java.util.Locale;
import java.util.Scanner;
/*Ler um número N e depois uma matriz quadrada NxN com números inteiros. Depois, mostrar na tela a soma dos
elementos de cada linha da matriz.*/
public class exMatrizes002 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] matriz = new int[n][n];
        int[] soma = new int[99];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matriz[i][j] = sc.nextInt();
                soma[i] += matriz[i][j];
            }        
        }
        for(int i = 0; i < n; i++){
            System.out.printf("Soma linha %d : %d\n",i,soma[i]);
        }
        
        sc.close();
    }
}
