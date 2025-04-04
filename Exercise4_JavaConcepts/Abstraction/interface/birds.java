public class birds {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();
        bird.sing();
    }
}
interface Aerial{
    void fly();
}

interface Singer {
    void sing();
}

class Bird implements Aerial, Singer {
    public void fly() {
        System.out.println("The bird is flying.");
    }

    public void sing() {
        System.out.println("The bird is singing.");
    }
}


