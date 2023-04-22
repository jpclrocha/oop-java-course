package section13.exercise2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDateTime t1 = LocalDateTime.of(2018, 06, 21, 13, 05, 44);
        LocalDateTime t2 = LocalDateTime.of(2018, 07, 28, 23, 14, 19);


        Post p1 = new Post("Traveling to New Zealand", "I'm going to visit this wonderful country!", t1, 12);
        Post p2 = new Post("Good night guys", "See you tomorrow", t2,5);

        p1.addComment(new Comment("Have a nice trip"));
        p1.addComment(new Comment("Wow that's awesome!"));

        p2.addComment(new Comment("Good night"));
        p2.addComment(new Comment("May the Force be with you"));

        System.out.println(p1);
        System.out.println(p2);
    }
}
