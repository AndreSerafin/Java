import java.util.Locale;
import java.util.Scanner;

/*Ler um inteiro N e uma matriz quadrada de ordem N. Mostrar a soma dos elementos acima da diagonal principal.*/

public class exMatrizes004 {
    public static void main(String[] agrs) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] matriz = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        int soma = 0;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(j != i && j > i){
                    //System.out.printf("%d ", matriz[i][j]);
                    soma += matriz[i][j];
                }
            }
        }

        System.out.printf("%d\n",soma);

        sc.close();
    }            
}