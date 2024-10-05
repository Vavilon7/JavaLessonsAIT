package HomWork31;

public class Content {
    private User user;

    private String creationDate;

    public Content(User user, String creationDate) {
        this.user = user;
        this.creationDate = creationDate;
    }

    public Content(String creationDate) {
        this.creationDate = creationDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }


}
