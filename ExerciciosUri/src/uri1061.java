import java.util.Locale;
import java.util.Scanner;
/*Pedrinho está organizando um evento em sua Universidade. O evento deverá ser no mês de Abril, iniciando e terminando dentro do mês. 
O problema é que Pedrinho quer calcular o tempo que o evento vai durar, uma vez que ele sabe quando inicia e quando termina o evento.
Sabendo que o evento pode durar de poucos segundos a vários dias, você deverá ajudar Pedrinho a calcular a duração deste evento.*/

public class uri1061 {
    public static void main(String[] args) {
        
        int diaI,horasI,minsI,segsI,diaF,horasF,minsF,segsF,dT,hT,mT,sT,inicio,fim,duracao;
        String s;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        s = sc.next();
        diaI = sc.nextInt();
        horasI = sc.nextInt();
        s = sc.next();
        minsI = sc.nextInt();
        s = sc.next();
        segsI = sc.nextInt();
        
        s = sc.next();
        diaF = sc.nextInt();
        horasF = sc.nextInt();
        s = sc.next();
        minsF = sc.nextInt();
        s = sc.next();
        segsF = sc.nextInt();
    
        inicio = diaI * 86400 + horasI * 3600 + minsI * 60 + segsI;
        fim = diaF * 86400 + horasF * 3600 + minsF * 60 + segsF;

        duracao = fim - inicio;

        dT =  duracao / 86400;
        duracao %= 86400;
        hT = duracao / 3600;
        duracao %= 3600;
        mT = duracao/60;
        duracao %= 60;
        sT = duracao;

        System.out.printf("%d dia(s)\n",dT);
        System.out.printf("%d hora(s)\n",hT);
        System.out.printf("%d minuto(s)\n",mT);
        System.out.printf("%d segundo(s)\n",sT);

        
        
        sc.close();
    }
}
