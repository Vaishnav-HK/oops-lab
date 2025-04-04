public class amphibians {
    public static void main(String[] args) {
        Amphibian frog = new Amphibian();
        frog.walkOnLand();
        frog.swim();
    }
}

interface Terestrial {
    void walkOnLand();
}

interface Aquatic {
    void swim();
}

class Amphibian implements Terestrial, Aquatic {
    public void walkOnLand() {
        System.out.println("Walking on land");
    }

    public void swim() {
        System.out.println("Swimming in water");
    }
}


