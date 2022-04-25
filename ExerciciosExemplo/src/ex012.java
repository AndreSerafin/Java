import java.util.Locale;
import java.util.Scanner;

public class ex012 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite um tamanho para a matriz: \n");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        int negativos = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                mat[i][j] = sc.nextInt();
                if(mat[i][j] < 0){
                    negativos++;
                }
            }
            System.out.println();
        }
        System.out.printf("Diagonal Principal: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j){
                    System.out.printf("%d ",mat[i][j]);
                }
            }
        }
        System.out.println();
        
        System.out.printf("Quantidade de negativos: %d\n",negativos);

        sc.close();
    }
}
