import java.util.Locale;
import java.util.Scanner;
/*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano. 
Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos uma de duas 
coordenadas for NULA (nesta situação sem escrever mensagem alguma).*/
public class uri1114{
    public static void main(String[] args) {
        
        int x,y;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextInt();
        
        while(x != 0 || y != 0){
            
            if(x > 0 && y > 0){
                System.out.printf("primeiro\n");
            }else if(x < 0 && y > 0){
                System.out.printf("segundo\n");
            }else if(x < 0 && y < 0){
                System.out.printf("terceiro\n");
            }else if(x > 0 && y < 0){
                System.out.printf("quarto\n");
            }
            
            x = sc.nextInt();
            y = sc.nextInt();

        }
        sc.close();
    }
}