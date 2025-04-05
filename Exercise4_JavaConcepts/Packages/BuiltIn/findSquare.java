import java.util.Scanner;
import java.lang.Math;
class findSquare{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter number: ");
        double num=scan.nextDouble();
        System.out.print("Enter power");
        double power=scan.nextDouble();
        double answer= Math.pow(num, power);
        System.out.println("ANSWER: "+answer);
    }   
}
