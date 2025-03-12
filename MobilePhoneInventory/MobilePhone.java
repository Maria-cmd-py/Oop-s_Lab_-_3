package MobilePhoneInventory;
class MobilePhone {
    String brand;
    String model;
    double price;
    // Default Constructor
    MobilePhone() {
        this.brand = "Unknown";
        this.model = "N/A";
        this.price = 0.0;
        System.out.println("Default phone created: " + this.brand + ", " + this.model + ", Rs. " + this.price);
    }
    // Parameterized Constructor
    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        System.out.println("Custom phone created: " + this.brand + ", " + this.model + ", Rs. " + this.price);
    }
    // Copy Constructor
    MobilePhone(MobilePhone existingPhone) {
        this.brand = existingPhone.brand;
        this.model = existingPhone.model;
        this.price = existingPhone.price;
        System.out.println("Copied phone created: " + this.brand + ", " + this.model + ", Rs. " + this.price);
    }
}
