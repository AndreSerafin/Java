import java.util.Locale;
import java.util.Scanner;
/*Pedrinho está organizando um evento em sua Universidade. O evento deverá ser no mês de Abril, iniciando e terminando dentro do mês. 
O problema é que Pedrinho quer calcular o tempo que o evento vai durar, uma vez que ele sabe quando inicia e quando termina o evento.
Sabendo que o evento pode durar de poucos segundos a vários dias, você deverá ajudar Pedrinho a calcular a duração deste evento.*/

public class teste {
    public static void main(String[] args) {
        
        String[] dados;
        String d;
        int a;
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
           
        dados = sc.next().split("");
        
        System.out.println(dados);
        

        sc.close();
    }
}
