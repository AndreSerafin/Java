import java.util.Locale;
import java.util.Scanner;
/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma 
duração mínima de 1 hora e máxima de 24 horas.*/
public class uri1046{
    public static void main(String[] args){
        
        int horaInic,horaFinal,horaTotal;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        horaInic = sc.nextInt();
        horaFinal = sc.nextInt();
        
        

        if(horaFinal < horaInic){
            horaTotal = 24 + horaFinal - horaInic;
            System.out.printf("O JOGO DUROU %d HORA(S)\n",horaTotal);
        }
        else if(horaFinal == horaInic){
            System.out.printf("O JOGO DUROU %d HORA(S)\n",24);
        }
        else{
            horaTotal = horaFinal - horaInic;
            System.out.printf("O JOGO DUROU %d HORA(S)\n",horaTotal);
        }

        sc.close();
    }
}
