import java.util.Locale;
import java.util.Scanner;
/*Neste problema, você deverá ler 3 palavras que definem o tipo de animal possível segundo o esquema abaixo, da esquerda para a direita.  
Em seguida conclua qual dos animais seguintes foi escolhido, através das três palavras fornecidas.*/
public class uri1050{
    public static void main(String[] args){
        
        int ddd;
        String cidade;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        ddd = sc.nextInt();

        if(ddd == 61){
            
            cidade = "Brasilia";
        }else if(ddd == 71){

            cidade = "Salvador";
        }else if(ddd == 11){

            cidade = "Sao Paulo";
        }else if(ddd == 21){

            cidade = "Rio de Janeiro";
        }else if(ddd == 32){

            cidade = "Juiz de Fora";
        }else if(ddd == 19){

            cidade = "Campinas";
        }else if(ddd == 27){

            cidade = "Vitoria";
        }else if(ddd == 31){

            cidade = "Belo Horizonte";
        }else{

            cidade = "DDD nao cadastrado";
        }

        System.out.printf("%s\n",cidade);


        sc.close();
    }
}
