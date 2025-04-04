import java.util.*;
public class SquareRoot{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number to find square root");
        double num=scan.nextDouble(); 
            try {
                if (num < 0) {
                    throw new IllegalArgumentException("Cannot take square root of negative number");
                }
                double root = Math.sqrt(num);
                System.out.println("Square root of" + num + " = " + root);
            } catch (IllegalArgumentException e) {
                System.out.println("Imaginary Numbers Not Allowed");
            }
        }
    }

