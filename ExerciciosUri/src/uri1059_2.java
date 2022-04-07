import java.util.Locale;
import java.util.Scanner;
/*Faça um programa que mostre os números pares entre 1 e 100, inclusive.*/
public class uri1059_2{
    public static void main(String[] args){
        
        int i;
        
        Locale.setDefault(Locale.US);
    
        i = 1;
        while(i < 101){
            if(i % 2 == 0){
                System.out.printf("%d\n",i);   
            }
            i++;
        }    

    }
}
