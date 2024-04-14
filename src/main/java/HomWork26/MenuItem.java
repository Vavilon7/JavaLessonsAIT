package HomWork26;

public class MenuItem {
    public static void main(String[] args) {
        foodList(MenuItemTape.DISH);
        foodList(MenuItemTape.DRINK);
        orderStatus(OrderStatus.PENDING);
        orderStatus(OrderStatus.PROCESSING);
        orderStatus(OrderStatus.SHIPPED);
        orderStatus(OrderStatus.DELIVERED);
        orderStatus(OrderStatus.CANCELLED);

    }

    public static void foodList(MenuItemTape menuItemTape) {
        switch (menuItemTape) {
            case DISH:
                System.out.println(menuItemTape.name() + " " + menuItemTape.getType() + " " + menuItemTape.getPortion());
                break;
            case DRINK:
                System.out.println(menuItemTape.name() + " " + menuItemTape.getType() + " " + menuItemTape.getPortion());
                break;
        }


    }

    public static void orderStatus(OrderStatus orderStatus) {
        switch (orderStatus) {
            case PENDING:
                System.out.println( orderStatus.getDescription());
                break;
            case PROCESSING:
                System.out.println(orderStatus.getDescription());
                break;
            case SHIPPED:
                System.out.println(orderStatus.getDescription());
                break;
            case DELIVERED:
                System.out.println(orderStatus.getDescription());
            case CANCELLED:
                System.out.println(orderStatus.getDescription());
        }
    }
}

