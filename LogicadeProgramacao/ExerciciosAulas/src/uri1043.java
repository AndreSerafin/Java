import java.util.Locale;
import java.util.Scanner;
/* Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem:
Perimetro = XX.X
Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem
Area = XX.X*/
public class uri1043{
    public static void main(String[] args){
        
        double ab,cd,ef,area,perim;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        ab = sc.nextDouble();
        cd = sc.nextDouble();
        ef = sc.nextDouble();

        if(ab + ef > cd && ab + cd > ef && ef + cd > ab){
            //System.out.printf("Forma um triangulo\n");
            perim = ab + cd + ef;
            System.out.printf("Perimetro = %.1f\n",perim);
        }else{
            //System.out.printf("Nao forma um triangulo\n");
            area = (ab + cd) * ef /2;
            System.out.printf("Area = %.1f\n",area);
        }

        sc.close();
    }
}
