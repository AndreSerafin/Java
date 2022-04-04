import java.util.Locale;
import java.util.Scanner;

/*Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias
Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. Nos casos de teste nunca haverá uma situação 
que permite 12 meses e alguns dias, como 360, 363 ou 364. Este é apenas um exercício com objetivo de testar raciocínio matemático simples.*/
public class uri1020{
    public static void main(String[] args){
        int dias,meses,anos;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        dias =sc.nextInt();
        anos = dias/365;
        dias %= 365;

        meses = dias/30;
        dias %= 30;


        System.out.printf("%d ano(s)\n",anos);
        System.out.printf("%d mes(es)\n",meses);
        System.out.printf("%d dia(s)\n",dias);

        sc.close();
    }
}