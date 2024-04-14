package Lessons26;

public enum AccessLevel {
    NONE(0),READ(1),WRITE(2),ADMIN(3);

    private final  int level;

    AccessLevel(int level) {
        this.level = level;
    }

    public boolean canRead(){
        return this.level >= READ.level;
    }

    public boolean canWrite(){
        return this.level >= WRITE.level;
    }
    public  boolean isAdmin(){
        return this.level == ADMIN.level;
    }
}
