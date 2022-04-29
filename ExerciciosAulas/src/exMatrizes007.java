import java.util.Locale;
import java.util.Scanner;
/*O sargento Silva organiza seu pelotão em M filas numeradas a partir de 1, sendo cada fila com a mesma quantidade de
soldados. Por exemplo, a figura abaixo mostra a organização do pelotão em 3 filas com 8 soldados em cada uma.
Um dos exercícios que o sargento Silva realiza com o pelotão é o exercício "girar fila", que consiste em dizer o número
de uma fila, de modo que os soldados desta fila devem se mover para a direita, e o último soldado da direita vai para a
posição mais à esquerda. Você deve fazer um programa para ler a formação do pelotão e executar o exercício "girar fila".*/
public class exMatrizes007 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite o tamanho da matriz (N x M)\n");

        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[][] a = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.printf("%d ",a[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        int[][] b = new int[n][m];
        System.out.printf("Digite a linha que deseja girar(1 a %d)\n",n);
        int linha = sc.nextInt() - 1;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(i == linha){
                    if(j == 0 ){
                        b[i][j] = a[i][m-1];
                                               
                    }else{
                        b[i][j] = a[i][j-1];
                    }
                    
                }else{
                    b[i][j] = a[i][j];
                    
                }
                System.out.printf("%d ",b[i][j]);
            }
            System.out.println();
        }
        
        sc.close();
    }
}