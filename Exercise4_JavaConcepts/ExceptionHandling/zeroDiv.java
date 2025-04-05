import java.util.Scanner;

public class zeroDiv {
    public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
        try {
	    System.out.println("Enter Numerator");
            int a = scan.nextInt(); 
	    System.out.println("Enter Denominator");
	    int b = scan.nextInt();
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
