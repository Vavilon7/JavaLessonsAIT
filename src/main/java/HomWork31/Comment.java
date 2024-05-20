package HomWork31;

public class Comment extends Content{

    private String text;


    public Comment(User user, String creationDate, String text) {
        super(user, creationDate);
        this.text = text;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "text='" + text + '\'' +
                '}';
    }
}

