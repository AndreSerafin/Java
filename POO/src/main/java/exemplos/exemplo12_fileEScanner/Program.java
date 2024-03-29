package exemplos.exemplo12_fileEScanner;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        File file = new File("res\\in.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while(sc.hasNextLine()) {
                System.out.print(sc.nextLine() + "\n");
            }
        }catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }finally {
            if(sc != null) {
                sc.close();
            }
        }
    }
}
