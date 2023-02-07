package exercicios.exerc02_salario.entities;

public class Employee {

    public String nome;
    public double salarioBruto;
    public double imposto;

    public double salarioLiquido() {

        return salarioBruto - imposto;
    }

    public void aumentoSalarial(double porcentagem) {

        porcentagem = porcentagem / 100;
        double aumento = (porcentagem * salarioBruto) + salarioBruto;
        System.out.printf("%s, R$ %.2f", nome, aumento - imposto);
    }

    public String toString() {

        return nome
                + ", R$ "
                + String.format("%.2f", salarioLiquido());
    }
}
