import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa para ler as medidas da base e altura de um retângulo. Em seguida,
mostrar o valor da área, perímetro e diagonal deste retângulo, com quatro casas
decimais, conforme exemplo.*/
public class ex003 {
    public static void main(String[] args){
        
        double base,alt,perim,diag,area;
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        base = sc.nextDouble();
        alt = sc.nextDouble();

        area = base * alt;
        perim = base * 2 + alt * 2;
        diag = Math.sqrt(Math.pow(base,2) + Math.pow(alt,2));
        
        
        System.out.printf("Area = %.4f\n",area);
        System.out.printf("Perimetro = %.4f\n",perim);
        System.out.printf("Diagonal = %.4f\n",diag);

        sc.close();
    }   
}
