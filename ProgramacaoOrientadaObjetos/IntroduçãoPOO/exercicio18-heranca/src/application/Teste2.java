package application;

import entities.Conta;
import entities.ContaPoupanca;

public class Teste2 {

    public static void main(String[] args){

        Conta c1 = new Conta(2321,"Pedro", 800.0);
        c1.saque(30.00);
        System.out.println(c1.getSaldo());

        Conta c2 = new ContaPoupanca(1221, "Jose", 800.0, 0.2);
        c2.saque(30.00);
        System.out.println(c2.getSaldo());

    }

}
