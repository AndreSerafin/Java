package application;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        method1();
    }

    public static void method1() {
        System.out.println("------method 1 start------");
        method2();
        System.out.println("------method 1 end------");
    }

    public static void method2() {
        System.out.println("------method 2 start------");
        Scanner sc = new Scanner(System.in);
        try {
            String[] vect = sc.nextLine().split(" ");
            int pos = sc.nextInt();
            System.out.println(vect[pos]);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Position");
            e.printStackTrace();
            sc.next();
        }catch (InputMismatchException e) {
            System.out.println("Input error");
        }
        sc.close();
        System.out.println("------method 2 end------");
    }
}
