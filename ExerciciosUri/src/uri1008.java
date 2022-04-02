import java.util.Scanner;
import java.util.Locale;
/*Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
decimais.*/
public class uri1008 {
    public static void main(String[] args){
        
        int num,horas;
        double salHora,sal;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();
        horas = sc.nextInt();
        salHora = sc.nextDouble();
        sal = horas * salHora;

        System.out.printf("NUMBER = %d\n",num);
        System.out.printf("SALARY = U$ %.2f\n",sal);
        sc.close();

    }
}
