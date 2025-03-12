package BankingSystem;
public class Bank {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount("Ali", 10000);
        BankAccount acc3 = new BankAccount(acc2);
    }
}