public class DeviceHybrid {
    public static void main(String[] args) {
        System.out.println("Laptop");
        Laptop dell = new Laptop();
        dell.powerOn();     
        dell.runOS();       
        dell.fold();        

        System.out.println("\nTablet");
        Tablet ipad = new Tablet();
        ipad.powerOn();     
        ipad.touchSupport();
    }
}

class Device {
    void powerOn() {
        System.out.println("Device is powered on...");
    }
}

class Computer extends Device {
    void runOS() {
        System.out.println("Computer is running its OS...");
    }
}

class Laptop extends Computer {
    void fold() {
        System.out.println("Laptop is foldable and portable...");
    }
}

class Tablet extends Device {
    void touchSupport() {
        System.out.println("Tablet supports touch input....");
    }
}


