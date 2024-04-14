package HomWork24;

import java.time.LocalDateTime;
import java.util.HashSet;

public class Message {private User sender;
    private String text;
    private LocalDateTime sendTime;
    private HashSet<User> likes;

    public Message(User sender, String text,
                   LocalDateTime sendTime) {
        this.sender = sender;
        this.text = text;
        this.sendTime = sendTime;
        this.likes = new HashSet<>();
    }

    public void likeMessage (User user){
        likes.add(user);
    }



    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getSendTime() {
        return sendTime;
    }

    public void setSendTime(LocalDateTime sendTime) {
        this.sendTime = sendTime;
    }

    public HashSet<User> getLikes() {
        return likes;
    }

    public void setLikes(HashSet<User> likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "Message{" +
                "sender=" + sender +
                ", text='" + text + '\'' +
                ", sendTime=" + sendTime +
                '}';
    }
}

