package CreatingAFoodOrder;
public class FoodOrderingApp {
    public static void main(String[] args) {
        FoodOrder order1 = new FoodOrder();
        FoodOrder order2 = new FoodOrder("Burger & Fries", 2);
        FoodOrder order3 = new FoodOrder(order2);
    }
}