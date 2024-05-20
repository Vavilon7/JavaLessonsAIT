package HomWork31;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Video extends Content implements Interactable {
    private int id;
    private String title;
    private int duration;
    private int views;
    private int likes;
    private int dislikes;
    private List<Comment> comments = new ArrayList<>();


    public Video(String creationDate, int id, String title, int duration) {
        super(creationDate);
        this.id = id;
        this.title = title;
        this.duration = duration;
    }


    public int getId() {
        return id;
    }


    public String getTitle() {
        return title;
    }


    public int getDuration() {
        return duration;
    }


    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", duration=" + duration +
                ", views=" + views +
                ", likes=" + likes +
                ", dislikes=" + dislikes +
                ", comments=" + comments +
                "} " + getCreationDate();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Video video)) return false;
        return getId() == video.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }


    @Override
    public void addLike() {
        likes++;
    }


    @Override
    public void addDislike() {
        dislikes++;
    }


    @Override
    public void addView() {
        views++;
    }

    /**
     * @param user
     * @param creationDate
     * @param text
     */
    @Override
    public void addComment(User user, String creationDate, String text) {
        Comment comment = new Comment(user, creationDate, text);
        comments.add(comment);
    }


}


