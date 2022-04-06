import java.util.Locale;
import java.util.Scanner;
/*Leia um valor inteiro entre 1 e 12, inclusive. Correspondente a este valor, deve ser apresentado como resposta o mês do ano por extenso, 
em inglês, com a primeira letra maiúscula.*/
public class uri1052{
    public static void main(String[] args){
        
        int n1;
        String mes = " ";

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        n1 = sc.nextInt();

        switch(n1){
            case 1:
            mes = "January";
            break;
            case 2:
            mes = "February";
            break;
            case 3:
            mes = "March";
            break;
            case 4:
            mes = "April";
            break;
            case 5:
            mes = "May";
            break;
            case 6:
            mes = "June";
            break;
            case 7:
            mes = "July";
            break;
            case 8:
            mes = "August";
            break;
            case 9:
            mes = "September";
            break;
            case 10:
            mes = "October";
            break;
            case 11:
            mes = "November";
            break;
            case 12:
            mes = "December";
            break;
        }

        System.out.printf("%s\n",mes);

        sc.close();
    }
}
