import java.util.Locale;
import java.util.Scanner;

/*Ler uma matriz quadrada de ordem N, contendo números reais. Em seguida, fazer as seguintes ações:
* a) calcular e imprimir a soma de todos os elementos positivos da matriz.
* b) fazer a leitura do índice de uma linha da matriz e, daí, imprimir todos os elementos desta linha.
* c) fazer a leitura do índice de uma coluna da matriz e, daí, imprimir todos os elementos desta coluna.
* d) imprimir os elementos da diagonal principal da matriz.
* e) alterar a matriz elevando ao quadrado todos os números negativos da mesma. Em seguida imprimir a matriz alterada.*/

public class exMatrizes006 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[][] a = new double[n][n];

        double soma = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = sc.nextDouble();
                if(a[i][j] > 0){
                    soma += a[i][j];
                }
            }
        }

        System.out.printf("Soma dos elementos positivos: %.1f\n",soma);

        System.out.printf("\nDigite o indice (de 0 a %d) da linha que deseja ver os elementos: ",n-1);
        int linha = sc.nextInt();
        System.out.printf("\nLinha: %d\n",linha);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == linha){

                    System.out.printf("%.1f ",a[i][j]);
                }
            }
        }
        System.out.println();

        System.out.printf("\nDigite o indice (de 0 a %d) da coluna que deseja ver os elementos: ",n-1);
        int coluna = sc.nextInt();

        System.out.printf("\nColuna: %d\n",coluna);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(j == coluna){

                    System.out.printf("%.1f \n",a[i][j]);
                }
            }
        }
        System.out.println();

        System.out.printf("Diagonal principal: \n");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j){

                    System.out.printf("%.1f ",a[i][j]);
                }
            }
        }
        System.out.println();

        System.out.printf("\nTodos os elementos negativos ao quadrado: \n");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
               if(a[i][j] < 0){
                   System.out.printf("%.1f ",Math.pow(a[i][j],2));
                   
                }else{
                    System.out.printf("%.1f ", a[i][j]);
                    
               }
            }
            System.out.println();
        }


        sc.close();
    }
}
