package application;

import entities.Conta;
import entities.ContaComercial;
import entities.ContaPoupanca;

public class Teste1 {

    public static void main(String[] args) {

        //Conta c = new Conta(1001, "andre", 0.0);
        ContaComercial cc = new ContaComercial(1002, "maria", 0.0, 500.0);

        //Upcasting

        Conta c1 = cc;
        Conta c2 = new ContaComercial(1003, "Bob", 0.0, 200.0);
        Conta c3 = new ContaPoupanca(1004, "Anna", 0.0, 0.01);

        //Downcasting

        ContaComercial c4 = (ContaComercial) c2;
        c4.emprestimo(100.0);

        //ContaComercial c5 = (ContaComercial) c3;

        if (c3 instanceof ContaComercial){
            ContaComercial c5 = (ContaComercial) c3;
            System.out.println("Emprestimo");
        }

        if (c3 instanceof ContaPoupanca) {
            ContaPoupanca c5 = (ContaPoupanca) c3;
            c5.atualizaSaldo();
            System.out.println("Atualizado!");
        }

    }
}
