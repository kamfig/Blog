package pl.kamilTestZAkademii.springTest;

public class Post {
    private String title;
    private String descripton;
    private String author;

    public Post(String title, String descripton, String author) {
        this.title = title;
        this.descripton = descripton;
        this.author = author;
    }
    public Post(){}

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
        return "Post{" +
                "title='" + title + '\'' +
                ", descripton='" + descripton + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
