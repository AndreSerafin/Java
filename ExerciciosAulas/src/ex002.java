import java.util.Scanner;

/*Fazer um programa para ler as medidas da largura e comprimento de um terreno
retangular com uma casa decimal, bem como o valor do metro quadrado do terreno
com duas casas decimais. Em seguida, o programa deve mostrar o valor da área do
terreno, bem como o valor do preço do terreno, ambos com duas casas decimais,
conforme exemplo.*/
public class ex002 {
    public static void main(String[] args){

        double larg,comp,val,area,preco;

        Scanner sc = new Scanner(System.in);
        larg = sc.nextDouble();
        comp = sc.nextDouble();
        val = sc.nextDouble();

        area = larg * comp;
        preco = area * val;

        System.out.printf("\nArea = %.2f\n",area);
        System.out.printf("Preco = %.2f\n",preco);


        sc.close();
    }
}
