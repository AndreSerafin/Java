import java.util.Locale;
import java.util.Scanner;
/*Neste problema, você deverá ler 3 palavras que definem o tipo de animal possível segundo o esquema abaixo, da esquerda para a direita.  
Em seguida conclua qual dos animais seguintes foi escolhido, através das três palavras fornecidas.*/
public class uri1049{
    public static void main(String[] args){
        
        String filo,classe,dieta,animal = " ";

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        filo = sc.next();
        classe = sc.next();
        dieta = sc.next();

        if(filo.equals("vertebrado")){
            if(classe.equals("ave")){

                if(dieta.equals("carnivoro")){
                    
                    animal = "aguia";
                }else if(dieta.equals("onivoro")){

                    animal = "pomba";
                }
            }else if(classe.equals("mamifero")){

                if(dieta.equals("onivoro")){

                    animal = "homem";
                }else if(dieta.equals("herbivoro")){

                    animal = "vaca";
                }
                
            }
        }else if(filo.equals("invertebrado")){

            if(classe.equals("inseto")){

                if(dieta.equals("hematofago")){

                    animal = "pulga";
                }else if(dieta.equals("herbivoro")){

                    animal = "lagarta";
                }
            }else if(classe.equals("anelideo")){

                if(dieta.equals("hematofago")){

                    animal = "sanguessuga";
                }else if(dieta.equals("onivoro")){

                    animal = "minhoca";
                }
            }
        }

        System.out.printf("%s\n",animal);

        sc.close();
    }
}
