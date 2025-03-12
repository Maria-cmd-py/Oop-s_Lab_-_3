package DiscountSystem;
class Discount {
    void applyDiscount(double percentage, double price) {
        double discountAmount = (price * percentage) / 100;
        double finalPrice = price - discountAmount;
        System.out.println("Applying " + percentage + "% discount. Final Price: " + finalPrice);
    }
    void applyDiscount(int fixedAmount, double price) {
        double finalPrice = price - fixedAmount;
        System.out.println("Applying Rs. " + fixedAmount + " discount. Final Price: " + finalPrice);
    }
    void applyDiscount(String couponCode, double price) {
        if (couponCode.equals("SAVE20")) {
            double discountAmount = price * 0.20;
            double finalPrice = price - discountAmount;
            System.out.println("Applying coupon '" + couponCode + "'. Final Price: " + finalPrice);
        } else {
            System.out.println("Invalid coupon code!");
        }
    }
}