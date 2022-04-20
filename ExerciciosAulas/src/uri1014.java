import java.util.Locale; 
import java.util.Scanner;
/*Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em Km) e o total de combustível gasto (em litros).
O arquivo de entrada contém dois valores: um valor inteiro X representando a distância total percorrida (em Km), e um valor real Y representando 
o total de combustível gasto, com um dígito após o ponto decimal.*/
public class uri1014 {
    public static void main(String[] args){
        int x;
        double y,dist; 

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        x = sc.nextInt();
        y = sc.nextDouble();

        dist = x / y;
        
        System.out.printf("%.3f km/l\n",dist);

        sc.close();
        
    }
}
