import java.util.Locale;
import java.util.Scanner;
/*Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. Se não for possível 
calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz 
de numero negativo.*/
public class uri1036 {
    public static void main(String[] args){
        
        double a,b,c,x1,x2,delta;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        delta = Math.pow(b, 2) - (4 * a * c);

        //System.out.printf("%.5f\n",delta);

        if(a == 0 || delta < 0){
            System.out.printf("Impossivel calcular\n");
        }else{

            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.printf("R1 = %.5f\n",x1);
            System.out.printf("R2 = %.5f\n",x2);
        }
        
        sc.close();
    }
}
