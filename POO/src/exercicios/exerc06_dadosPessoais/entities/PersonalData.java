package exercicios.exerc06_dadosPessoais.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PersonalData {

    private String nome;
    private int dia;
    private int mes;
    private int ano;
    private double altura;

    public void setNome(String nome){ this.nome = nome; }
    public String getNome() { return nome; }
    public void setDia(int dia) { this.dia = dia; }
    public void setMes(int mes) { this.mes = mes; }
    public void setAno(int ano) { this.ano = ano; }

    public void setAltura(double altura) { this.altura = altura; }

    public double getAltura() { return altura; }

    public String calculaIdade() {

        DateTimeFormatter data = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String[] dataAtual = (data.format(LocalDateTime.now())).split("/");

        int dias = (Integer.parseInt(dataAtual[0]) - dia);
        int meses = (Integer.parseInt(dataAtual[1]) - mes);
        int anos = (Integer.parseInt(dataAtual[2]) - ano);

        dias += anos * 365 + meses * 30;
        anos = dias/365;
        dias %= 365;
        meses = dias/30;
        dias %= 30;

        return "Idade - " + anos + " ano(s) " + meses + " mes(es) " + dias + " dia(s) ";
    }

    public String toString() {

        return "Nome: " + nome + ", Altura: " + altura;
    }


}
