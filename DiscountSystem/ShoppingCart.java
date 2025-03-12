package DiscountSystem;
public class ShoppingCart {
    public static void main(String[] args) {
        Discount discount = new Discount();
        double price = 5000;
        discount.applyDiscount(10.5, price); // Percentage discount
        discount.applyDiscount(500, price); // Fixed discount
        discount.applyDiscount("SAVE20", price); // Coupon discount
    }
}