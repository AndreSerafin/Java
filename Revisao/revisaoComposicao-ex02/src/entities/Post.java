package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Post {

    private Date moment;
    private String title;
    private String content;
    private Integer likes;

    private ArrayList<Comment> comments = new ArrayList<>();

    public Post() {

    }

    public Post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public void addComments(String text){
        Comment c1 = new Comment(text);
        this.comments.add(c1);
    }

    public void removeComment(String text) {
        Comment c1 = new Comment(text);
        this.comments.remove(c1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        sb.append(title + "\n");
        sb.append(likes + "-Likes " + sdf.format(moment) + "\n");
        sb.append(content + "\n");
        sb.append("Comments: \n");
        for(Comment c : comments) {
            sb.append(c).append("\n");
        }
        return sb.toString();
    }
}
