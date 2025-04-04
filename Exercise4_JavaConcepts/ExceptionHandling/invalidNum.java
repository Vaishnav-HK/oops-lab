import java.util.*;
public class invalidNum {
    public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter a number");
        try {
            int num=scan.nextInt();
            System.out.println("Number: " + num);
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid number.");
        }
    }
}
