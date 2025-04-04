public class payment_abstract {
    public static void main(String[] args) {
        Payment credit = new CreditCardPayment(120.50, "1234567812345678");
        Payment UPI = new UPIPayment(89.99, "1234567890@bankname");

        credit.paymentInfo();
        credit.makePayment();

        System.out.println();

        UPI.paymentInfo();
        UPI.makePayment();
    }
}

abstract class Payment {
    double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    abstract void makePayment();

    void paymentInfo() {
        System.out.println("Processing payment of Rs" + amount);
    }
}

class CreditCardPayment extends Payment {
    String cardNumber;

    CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    void makePayment() {
        System.out.println("Charged Rs" + amount + " to credit card ending in " + cardNumber.substring(cardNumber.length() - 4));
    }
}

class UPIPayment extends Payment {
    String upiID;

    UPIPayment(double amount, String upiID) {
        super(amount);
        this.upiID = upiID;
    }

    void makePayment() {
        System.out.println("Paid Rs" + amount + " via UPI account: " + upiID);
    }
}

