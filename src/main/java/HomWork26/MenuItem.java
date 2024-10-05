package HomWork26;

public class MenuItem  {
   private String name;
   private MenuItemTape type;

    public MenuItem(String name, MenuItemTape type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public MenuItemTape getType() {
        return type;
    }

    @Override
    public String toString() {
        return "MenuItem: name='" + name  + ", type=" + type;
    }
}

