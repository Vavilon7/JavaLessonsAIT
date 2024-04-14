package Lessons26;

public enum Day {
    MONDAY ("Monday are dad day"),
    TUESDAY("Tuesday are bad day"),
    WEDNESDAY( "Wednesday is a small Friday"),
    THURSDAY ("Thursday is a small Saturday"),
    FRIDAY("Friday is cool"),
    SATURDAY("Saturday is cool"),
    SUNDAY ("Sunday is small monday");
    private String description;

    Day(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
