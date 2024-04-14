package HomWork26;

public enum OrderStatus {
    PENDING (" Время приготовления 10 минут"),
    PROCESSING( " Оформление оплаты по чеку 3 минут"),
    SHIPPED(" Упаковка еды 4 минуты " ),
    DELIVERED ( " Время доставки 15 минут"),
    CANCELLED(" Отмена заказа");
    private String description;
    OrderStatus (String description)
    {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }

}
