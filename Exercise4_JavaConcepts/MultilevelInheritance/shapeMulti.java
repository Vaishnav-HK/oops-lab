public class shapeMulti {
    public static void main(String[] args) {
        Box box = new Box();

        box.printShape();
        box.calculateArea();      
        box.calculateVolume();    
    }
}

class Shape {
    void printShape() {
        System.out.println("This is a geometric shape.");
    }
}

class Rectangle extends Shape {
    int length = 10;
    int width = 5;

    void calculateArea() {
        int area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Box extends Rectangle {
    int height = 4;

    void calculateVolume() {
        int volume = length * width * height;
        System.out.println("Volume of Box: " + volume);
    }
}


