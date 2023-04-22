package section13enum.exercise2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Post {

    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private String title;
    private String content;
    private int likes;
    private LocalDateTime moment;

    private ArrayList<Comment> comments = new ArrayList<>();

    public Post(String title, String content, LocalDateTime moment, int likes) {
        this.title = title;
        this.content = content;
        this.moment = moment;
        this.likes = likes;
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

    public int getLikes() {
        return likes;
    }


    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void addComment(Comment comment){
        this.comments.add(comment);
    }

    public void removeComment(Comment comment){
        this.comments.remove(comment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n");
        sb.append(likes );
        sb.append(" Likes - ");
        sb.append(dtf.format(moment) + "\n");
        sb.append(content + "\n");
        sb.append("Comments: \n");
        for(Comment c : comments){
            sb.append(c.getText() + "\n");
        }
        return sb.toString();
    }
}
