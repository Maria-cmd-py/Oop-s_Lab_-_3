package BankingSystem;
class BankAccount {
    static int accountCounter = 1000;
    int accountNumber;
    String name;
    double balance;
    BankAccount() {
        this.accountNumber = ++accountCounter;
        this.name = "Default User";
        this.balance = 5000;
        System.out.println("Account Created - Account No: " + accountNumber + ", Name: " + name + ", Balance: Rs. " + balance);
    }
    BankAccount(String name, double initialDeposit) {
        this.accountNumber = ++accountCounter;
        this.name = name;
        this.balance = initialDeposit;
        System.out.println("Account Created - Account No: " + accountNumber + ", Name: " + name + ", Balance: Rs. " + balance);
    }
    BankAccount(BankAccount existingAccount) {
        this.accountNumber = ++accountCounter;
        this.name = existingAccount.name;
        this.balance = existingAccount.balance;
        System.out.println("Account Copied - Account No: " + accountNumber + ", Name: " + name + ", Balance: Rs. " + balance);
    }
}
