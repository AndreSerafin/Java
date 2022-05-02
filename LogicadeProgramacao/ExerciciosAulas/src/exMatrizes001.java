import java.util.Locale;
import java.util.Scanner;
/*Ler dois números M e N, e depois ler uma matriz MxN de números inteiros, conforme exemplo. Em seguida, mostrar
na tela somente os números negativos da matriz.*/

public class exMatrizes001 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] matriz = new int[m][n];
        int[] negativos = new int[99];
        int cont = 0;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                matriz[i][j] = sc.nextInt();
                if(matriz[i][j] < 0){
                    negativos[cont] = matriz[i][j];
                    cont++;
                }
            }
        }
        
        System.out.printf("Negativos: ");
        for(int i = 0; i < cont; i++){
            System.out.printf("%d ",negativos[i]);
        }
        System.out.println();

        sc.close();
    }
}
