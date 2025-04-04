public class laptopOverride {
    public static void main(String[] args) {
        Laptop normal = new Laptop();
        Laptop better = new GamingLaptop();

        normal.features();    
        better.features();    
    }
}

class Laptop {
    void features() {
        System.out.println("Laptop features: Browsing, Docs, Videos");
    }
}

class GamingLaptop extends Laptop {
    void features() {
        System.out.println("Gaming Laptop features: High-performance GPU, Cooling, RGB");
    }
}


