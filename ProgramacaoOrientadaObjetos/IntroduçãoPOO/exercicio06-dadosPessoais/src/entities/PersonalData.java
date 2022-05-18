package entities;

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

    public int getDia() { return dia; }

    public void setDia(int dia) { this.dia = dia; }

    public int getMes() { return mes; }

    public void setMes(int mes) { this.mes = mes; }

    public int getAno() { return ano; }

    public void setAno(int ano) { this.ano = ano; }

    public void setAltura(double altura) { this.altura = altura; }

    public double getAltura() { return altura; }

    public String calculaIdade(int dia, int mes, int ano) {

        DateTimeFormatter data = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String[] dataAtual = (data.format(LocalDateTime.now())).split("/");



        return "Idade - " + ano + " ano(s) " + mes + " mes(es) " + dia + " dia(s) ";
    }

    public String toString() {

        return "Nome: " + getNome() + ", Altura: " + getAltura();
    }


}
