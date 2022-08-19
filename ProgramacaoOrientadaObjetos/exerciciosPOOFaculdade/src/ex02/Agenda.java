package ex02;

import java.util.ArrayList;

public class Agenda {

    public ArrayList<Contato> contatos = new ArrayList<>();

    public Agenda(){

    }

    public Agenda(ArrayList<Contato> contatos) {
        this.contatos = contatos;
    }

    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    public void cadastraContato(Contato contato) {
        this.contatos.add(contato);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Contato x : contatos){
            sb.append(String.format("\n%s\n",x.toString()));

        }
        return "Contatos:" + sb;
    }
}
