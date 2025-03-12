package MobilePhoneInventory;
public class PhoneInventory {
    public static void main(String[] args) {
        // Create a default phone
        MobilePhone phone1 = new MobilePhone();
        // Create a custom phone
        MobilePhone phone2 = new MobilePhone("Samsung", "Galaxy S21", 150000);
        // Create a copied phone
        MobilePhone phone3 = new MobilePhone(phone2);
    }
}