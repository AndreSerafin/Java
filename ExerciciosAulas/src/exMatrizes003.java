import java.util.Locale;
import java.util.Scanner;
/*Ler um inteiro N e uma matriz quadrada de ordem N. Mostrar qual o maior elemento de cada linha. Suponha não haver
empates.*/
public class exMatrizes003 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] matriz = new int[n][n];
        int[] vetMaior = new int[n];
        int maior = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matriz[i][j] = sc.nextInt();
            }
        }
        
        for(int i = 0; i < n; i++){
            maior = matriz[i][0];
            for(int j = 1; j < n; j++){
                if(matriz[i][j] > maior){
                    maior =  matriz[i][j];
                    vetMaior[i] =  maior;
                }
            }
            maior = 0;
        }

        for(int i = 0; i < n; i++){
            System.out.printf("Maior linha %d : %d\n",i,vetMaior[i]);
        }
        sc.close();

    }
    
}
