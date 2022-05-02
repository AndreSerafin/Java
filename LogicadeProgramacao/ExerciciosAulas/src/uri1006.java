import java.util.Locale;
import java.util.Scanner;
/*Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. A seguir, calcule a média do aluno, 
sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. Considere que cada nota pode ir de 0 até 
10.0, sempre com uma casa decimal.*/
public class uri1006 {
    public static void main(String[] args){
        
        double a,b,c,media;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        media = (a * 2 + b * 3 + c * 5) / 10;

        System.out.printf("MEDIA = %.1f\n",media);

        sc.close();

    }
    
}
