package CreatingAFoodOrder;
class FoodOrder {
    String items;
    int quantity;
    FoodOrder() {
        this.items = "Standard Meal";
        this.quantity = 1;
        System.out.println("Order Created: " + items + "(Qty: " + quantity + ")");
    }
    FoodOrder(String items, int quantity) {
        this.items = items;
        this.quantity = quantity;
        System.out.println("Order Created: " + items + "(Qty: " + quantity + ")");
    }
    FoodOrder(FoodOrder order) {
        this.items = order.items;
        this.quantity = order.quantity;
        System.out.println("Order Copied: " + items + "(Qty: " + quantity + ")");
    }
}