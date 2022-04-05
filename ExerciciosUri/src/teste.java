import java.util.Locale;
import java.util.Scanner;

public class teste {
 
    public static void main(String[] args){
        
        int horaInic,horaFinal,minInic,minFinal,hora,min,total;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        horaInic = sc.nextInt();
        minInic = sc.nextInt();
        horaFinal = sc.nextInt();
        minFinal = sc.nextInt(); 
        
        if(horaFinal <= horaInic){
            total = (horaFinal - horaInic) * 60 + (minFinal - minInic);

            hora = 24 + total/60;
            total %= 60;
            min = total;
            
        }else{
            total = (horaFinal - horaInic) * 60 + (minFinal - minInic);

            hora = total/60;
            total %= 60;
            min = total;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)",hora,min);
        }

        

        
        sc.close();
    }
 
}