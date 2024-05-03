package AUTO;

public enum Access {
    NONE(0), READ(1), ADD(2), DELETE(3), ADMIN(4);

    private final int level;

    Access(int level) {
        this.level = level;
    }


    public boolean canNone() {
        return this.level >= NONE.level;
    }

    public boolean canRead() {
        return this.level >= READ.level;
    }

    public boolean canAdd() {
        return this.level >= ADD.level;
    }

    public boolean canDelete() {
        return this.level >= DELETE.level;
    }

    public boolean isAdmin() {
        return this.level == ADMIN.level;

        }
    }


