import java.util.Locale;
import java.util.Scanner;

/* Fazer um programa para ler duas matrizes de números inteiros A e B, contendo de M linhas e N colunas cada. Depois,
gerar uma terceira matriz C onde cada elemento desta é a soma dos elementos correspondentes das matrizes originais.
Imprimir na tela a matriz gerada.*/

public class exMatrizes005 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] a = new int[m][n];
        int[][] b = new int[m][n];

        System.out.printf("Digite os elementos da matriz A: \n");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = sc.nextInt();
            }
        }
        
        System.out.printf("Digite os elementos da matriz B: \n");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                b[i][j] = sc.nextInt();
            }
        }
        
        //Matriz resultado da soma
        int[][] c = new int[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.printf("Matriz C:\n");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.printf("%d ",c[i][j]);
            }
            System.out.println();
        }

        
        sc.close();
    }
}
