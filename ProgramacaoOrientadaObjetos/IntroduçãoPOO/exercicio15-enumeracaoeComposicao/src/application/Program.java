package application;

import entities.Comentarios;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comentarios c1 = new Comentarios("Tenha uma boa viagem!");
        Comentarios c2 = new Comentarios("Uau isso é incrivel!");
        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Viajando para Nova Zelandia",
                "Vou visitar esse país maravilhoso", 12);

        p1.addComentarios(c1);
        p1.addComentarios(c2);

        System.out.println(p1);
        //--------------------
        Comentarios c3 = new Comentarios("Boa noite!");
        Comentarios c4 = new Comentarios("Que a força esteja com vcs!");
        Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Boa noite pessoal",
                "Vejo vcs amanhã", 5);

        p2.addComentarios(c3);
        p2.addComentarios(c4);

        System.out.println(p2);
    }
}
