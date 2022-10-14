package application;

import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

        Date moment = sdf.parse("21/06/2018 13:05:44");
        String title = "Viajando para Nova Zelandia!";
        String content = "Estou indo para este lindo país!";
        Integer likes = 12;
        Post post1 = new Post(moment,title,content,likes);
        post1.addComments("Tenha um otima viagem");
        post1.addComments("Wow isso é incrível!");


        moment = sdf.parse("28/07/2018 23:14:19");
        title = "Boa noite pessoas!";
        content = "Vejo vcs amanhã";
        likes = 5;
        Post post2 = new Post(moment,title,content,likes);
        post2.addComments("Que a força esteja com vc!");
        post2.addComments("Durma bem!");

        System.out.println(post1);
        System.out.println(post2);


    }

}
