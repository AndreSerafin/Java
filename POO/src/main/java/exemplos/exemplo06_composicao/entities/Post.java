package exemplos.exemplo06_composicao.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Post {

    private Date momento;
    private String titulo;
    private String conteudo;
    private Integer likes;
    private ArrayList<Comentarios> comentarios = new ArrayList<>();
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public Post(){

    }

    public Post(Date momento, String titulo, String conteudo, Integer likes) {
        this.momento = momento;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.likes = likes;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Integer getLike() {
        return likes;
    }

    public void setLike(Integer like) {
        this.likes = like;
    }

    public ArrayList<Comentarios> getComentarios() {
        return comentarios;
    }

    public void addComentarios(Comentarios comentario) {
        this.comentarios.add(comentario);
    }

    public void removeComentarios(Comentarios comentario) {
        comentarios.remove(comentario);
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(titulo + "\n");
        sb.append(likes + " Likes - ");
        sb.append(sdf.format(momento) + "\n");
        sb.append(conteudo + "\n");
        sb.append("Comentarios: \n");
        for (Comentarios c : comentarios) {
            sb.append(c.getTexto() + "\n");
        }

        return sb.toString();
    }

}
