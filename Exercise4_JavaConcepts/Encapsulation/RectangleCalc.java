public class RectangleCalc{
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setDimensions(5.5, 3.0);

        System.out.println("Area: " + r.getArea());
        System.out.println("Perimeter: " + r.getPerimeter());
    }
}

class Rectangle {
    private double length;
    private double width;

    public void setDimensions(double l, double w){
            length=l;
            width=w;
    }

    public double getArea() {
        return length*width;
    }

    public double getPerimeter() {
        return 2*(length+width);
    }
}


