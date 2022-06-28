package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {

    private String nome;
    private String email;
    private Date dataNascimento;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Cliente(){

    }

    public Cliente(String nome, String email, Date dataNascimento) {
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public String toString() {
        return  nome
                + ", " + email
                + ", " + sdf.format(this.dataNascimento);

    }
}
