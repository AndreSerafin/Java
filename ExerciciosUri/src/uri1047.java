import java.util.Locale;
import java.util.Scanner;
/*Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. A seguir calcule a duração do jogo.
Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.*/
public class uri1047{
    public static void main(String[] args){
        
        int horaInic,horaFinal,minInic,minFinal,tempoFinal,tempoInic,total;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        horaInic = sc.nextInt();
        minInic = sc.nextInt();
        horaFinal = sc.nextInt();
        minFinal = sc.nextInt(); 

        tempoInic = horaInic * 60 + minInic;
        tempoFinal = horaFinal * 60 + minFinal;
        
        if(tempoFinal <= tempoInic){
            total = tempoFinal - tempoInic + (24*60);
        }else{
            total = tempoFinal - tempoInic;
        }
        
        horaFinal = total/60;
        total %= 60;
        minFinal = total;

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",horaFinal,minFinal);
        

        
        sc.close();
    }
}
