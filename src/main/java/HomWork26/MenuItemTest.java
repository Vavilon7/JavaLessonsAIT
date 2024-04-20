package HomWork26;

public class MenuItemTest {
    public static void main(String[] args) {
        OrderStatus orderStatus= OrderStatus.PENDING;

         MenuItem pizza = new MenuItem("Pizza",MenuItemTape.DISH);
         MenuItem pelimeni = new MenuItem("Pelimeni",MenuItemTape.DISH);
         MenuItem airan = new MenuItem("Airan" , MenuItemTape.DRINK);
        System.out.println(pizza.toString());
        System.out.println(pelimeni.toString());
        System.out.println(airan.toString());
        System.out.println(orderStatus.name() + " " + orderStatus.getDescription());
        System.out.println(orderStatus.canCancel());
   }
} 
