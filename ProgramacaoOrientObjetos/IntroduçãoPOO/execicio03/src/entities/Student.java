package entities;


public class Student {

    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double notaFinal() {

        return nota1 + nota2 + nota3;
    }

    public void situacao() {

        double pontosNecessarios = 60 - notaFinal();

        if(notaFinal() >= 60){
            System.out.println("Aprovado!");
        }else{
            System.out.println("Reprovado!");
            System.out.printf("Faltam %.2f pontos\n", pontosNecessarios);
        }

    }


    public String toString() {

        return "Nota final: "
                + String.format("%.2f", notaFinal());
    }

}
