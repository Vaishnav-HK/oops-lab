public class Products {
    public static void main(String[] args) {
        Product item = new Product();
        item.setName("Laptop");
        item.setPrice(55000);
        item.setQuantity(2);
        System.out.println("Product: " + item.getName());
        System.out.println("Total Value: ₹" + item.getTotalValue());
    }
}

class Product {
    private String name;
    private double price;
    private int quantity;
    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double p) {
            price = p;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int q) {
            quantity = q;
    }

    public int getQuantity() {
        return quantity;
    }
    
    public double getTotalValue() {
        return price * quantity;
    }
}

