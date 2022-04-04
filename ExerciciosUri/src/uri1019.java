import java.util.Locale;
import java.util.Scanner;

/*Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o 
expresso no formato horas:minutos:segundos. */
public class uri1019{
    public static void main(String[] args){
        int segs,horas,mins;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        segs =sc.nextInt();
        horas = segs/3600;
        segs %= 3600;

        mins = segs/60;
        segs %= 60;


        System.out.printf("%d:%d:%d\n",horas,mins,segs);

        sc.close();
    }
}