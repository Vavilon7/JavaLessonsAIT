package Lessons30;

public class User extends AccessCheck {
    public User() {
        super(1);
    }
    @Override
    boolean canRead() {
        return false;
    }

    @Override
    boolean canRight() {
        return false;
    }
}
