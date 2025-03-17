
import java.util.Scanner;


class Area{
    public static void main(String[] args){
        int choice=0;
        double l;
        double b;
        double h;
        double r;
        findArea find=new findArea();
        Scanner scan=new Scanner(System.in);  
        while(choice!=4){
            System.out.println("FIND AREA FOR:");
            System.out.println("1.RECTANGLE");
            System.out.println("2.CIRCLE");
            System.out.println("3.TRIANGLE");
            System.out.println("4.EXIT");
            choice=scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter length: ");
                    l=scan.nextDouble();
                    System.out.print("Enter breadth: ");
                    b=scan.nextDouble();
                    find.rectArea(l, b);
                    break;
                case 2:
                    System.out.print("Enter radius: ");
                    r=scan.nextDouble();
                    find.CircleArea(r);
                    break;
                case 3:
                    System.out.print("Enter base: ");
                    b=scan.nextDouble();
                    System.out.print("Enter height: ");
                    h=scan.nextDouble();
                    find.triArea(b, h); 
                    break;
                case 4:
                    System.out.println("EXITING.....");
                    break;            
                default:
                    System.out.println("-----INVALID-----");
            }

        }
        
    }

}

class findArea{
    public void rectArea(double l, double b){
        double c=l*b;
        System.out.println("AREA OF RECTANGLE: "+c );
    }
    public void CircleArea(double r){
        double c=3.14159*r;
        System.out.println("AREA OF CIRCLE: "+c );
    }
    public void triArea(double b, double h){
        double c=0.5*b*h;
        System.out.println("AREA OF TRIANGLE: "+c );
    }
     
}