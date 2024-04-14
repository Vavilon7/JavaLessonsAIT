package HomWork26;

public enum MenuItemTape {
    DRINK("Coca cola", 400  ),
    DISH("Пицца" , 250  );
    private String type;
    private int portion;
    MenuItemTape(String type, int portion ) {
        this.type = type;
        this.portion = portion;
    }
    public String getType() {
        return type;
    }
    public int getPortion() {
        return portion;
    }
}

