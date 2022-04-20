    import java.util.Locale;
    import java.util.Scanner;

/*Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A, e a soma de C com D for maior 
que a soma de A e B e se C e D, ambos, forem positivos e se a variável A for par escrever a mensagem "Valores aceitos", senão escrever 
"Valores nao aceitos".*/

public class uri1035 {
    public static void main(String[] args){

        int a,b,c,d;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        if(b > c && d > a && c + d > a + b && c > 0 && d > 0 && a % 2 == 0){
            System.out.printf("Valores aceitos\n");
        }else{
            System.out.printf("Valores nao aceitos\n");
        }
        
        sc.close();
        
    }
}
