package Udemy_NelioAlves.Composicao.StringBuilder;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Program {
    static void main(String[] args) {
        LocalDate date = LocalDate.parse("2026-04-21");

        Post post = new Post(date, "ja postou no linkedin hj?", "nossa q legal postar nessa rede hahah, quero um job", 76 );
        Comment comment = new Comment("obgd por me lembrar, vou curtir e postar algo hahaha");
        Comment comment2 = new Comment("eu odeio essa plataforma");
        Comment comment3 = new Comment("testando o remove");
        post.addComment(comment);
        post.addComment(comment2);
        post.addComment(comment3);
        post.removeComment(comment3);

        System.out.println(post.toString());
    }
}
