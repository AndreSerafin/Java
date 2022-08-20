package ex04;

import java.util.ArrayList;

public class Familia {

    private ArrayList<Pessoa> pessoas = new ArrayList<>();
    private String nomeFamilia;

    public Familia(){

    }

    public Familia(ArrayList<Pessoa> pessoas, String nomeFamilia) {
        this.pessoas = pessoas;
        this.nomeFamilia = nomeFamilia;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Pessoa x : pessoas) {
            sb.append(String.format("%s\n", x.toString()));
        }
        return "Nome da Familia: " + nomeFamilia + "\n"
                + "Pessoas: \n\n" + sb;
    }


}
