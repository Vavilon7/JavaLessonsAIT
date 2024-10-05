package HomWork31;

public interface Interactable {
    void addLike();
    void addDislike();
    void addView();
    void addComment(User user, String creationDate, String text);
}

