class banking {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();

        sa.displayBankName();         
        sa.displayAccountDetails();   
        sa.calculateInterest(2);      
    }
}

class Bank {
    String bankName = "ABC Bank";

    void displayBankName() {
        System.out.println("Bank Name: " + bankName);
    }
}

class Account extends Bank {
    String accHolder = "Vaish";
    double balance = 10000;

    void displayAccountDetails() {
        System.out.println("Account Holder: " + accHolder);
        System.out.println("Balance: Rs" + balance);
    }
}

class SavingsAccount extends Account {
    double interestRate = 4.5; 
    void calculateInterest(int years) {
        double interest = (balance * interestRate * years) / 100;
        System.out.println("Interest for " + years + " years: Rs" + interest);
    }
}

