package pl.kamilTestZAkademii.springTest;

import java.util.ArrayList;
import java.util.List;

public class Post {
    private String title;
    private String descripton;
    private String author;

    private static List<Post> posts=new ArrayList<>();

    public static List<Post> findAll(){
        return posts;
    }

    public Post(String title, String descripton, String author) {
        this.title = title;
        this.descripton = descripton;
        this.author = author;
        posts.add(this);
    }
    public Post(){
        posts.add(this);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescripton() {
        return descripton;
    }

    public void setDescripton(String descripton) {
        this.descripton = descripton;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Post Brzmi {" +
                "title=' " + title + '\'' +
                ", descripton=' \n  " + descripton + '\'' +
                ", author=' " + author + '\'' +
                "  ! }";
    }
}
