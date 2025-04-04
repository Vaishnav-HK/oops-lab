public class Account {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.setAccountHolder("Vaish");
        acc.deposit(5000);
        acc.withdraw(1200);

        System.out.println("Account Holder: " + acc.getAccountHolder());
        System.out.println("Remaining Balance: Rs" + acc.getBalance());
    }
} 

class BankAccount {
    private String accountHolder;
    private double balance;

    public void setAccountHolder(String name) {
        accountHolder = name;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void deposit(double amount) {
            balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

