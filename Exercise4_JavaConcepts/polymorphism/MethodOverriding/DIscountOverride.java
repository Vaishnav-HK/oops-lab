class DiscountOverride {
    public static void main(String[] args) {
        Discount normal = new Discount();
        Discount special = new SpecialDiscount();

        normal.applyDiscount(1000, 10);  
        special.applyDiscount(1000, 10);  
    }
}

class Discount {
    void applyDiscount(double price, double discountPercent) {
        double finalPrice = price - (price * discountPercent / 100);
        System.out.println("Final Price after normal discount: Rs" + finalPrice);
    }
}

class SpecialDiscount extends Discount {
    void applyDiscount(double price, double discountPercent) {
        double specialAmount = 5; 
        double finalPrice = price - (price * (discountPercent + specialAmount) / 100);
        System.out.println("Final Price with special discount: Rs" + finalPrice);
    }
}


