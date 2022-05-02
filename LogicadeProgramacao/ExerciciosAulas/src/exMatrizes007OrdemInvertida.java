import java.util.Locale;
import java.util.Scanner;
/*O sargento Silva organiza seu pelotão em M filas numeradas a partir de 1, sendo cada fila com a mesma quantidade de
soldados. Por exemplo, a figura abaixo mostra a organização do pelotão em 3 filas com 8 soldados em cada uma.
Um dos exercícios que o sargento Silva realiza com o pelotão é o exercício "girar fila", que consiste em dizer o número
de uma fila, de modo que os soldados desta fila devem se mover para a direita, e o último soldado da direita vai para a
posição mais à esquerda. Você deve fazer um programa para ler a formação do pelotão e executar o exercício "girar fila".*/
public class exMatrizes007OrdemInvertida {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[][] a = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                a[i][j] = sc.nextInt();
            }
        }
        
        System.out.printf("Digite a linha que deseja girar(1 a %d)\n",n);
        int linha = sc.nextInt() - 1;
        
        for(int i = 0; i < n; i++){
            if(i == linha){
                for(int u = m-1; u >= 0; u--){
                    System.out.printf("%d ",a[i][u]);
                }
            }else{
                for(int j = 0; j < m; j++){
                    System.out.printf("%d ", a[i][j]);
                }
            }
            System.out.println();
        }
        
        
        sc.close();
    }
}
