public class Book {
    private final String title;
    private final String author;
    private final String content;

    public Book(String title, String author, String content){
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public String getTitle(){
        return title;
    }

     public String getAuthor(){
        return author;
    }

    public String getContent(){
        return content;
    }

}