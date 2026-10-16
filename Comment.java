public class Comment{
    private User Author;
    private String text;

    public 
    Comment(User Author , String text){
        this.Author = Author;
        this.text = text; 
    }

    public User get_author(){return Author;}
    public String get_text(){return text;}
} 