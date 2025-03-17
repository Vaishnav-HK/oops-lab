
import java.util.Scanner;


class calculate{
    public static void main(String[] args){
        int choice=0;
        Calc calc=new Calc();
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1=scan.nextInt();
        System.out.print("Enter num2: ");
        int num2=scan.nextInt();
        while(choice!=5){
            System.out.println("PICK AN OPERATION:");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.EXIT");
            choice=scan.nextInt();
            switch (choice) {
                case 1:
                    calc.add(num1, num2);
                    break;
                case 2:
                    calc.subtract(num1, num2);
                    break;
                case 3:
                    calc.multiply(num1, num2);
                    break;
                case 4:
                    calc.divide(num1, num2);
                    break;
                case 5:
                    System.out.println("EXITING.....");
                    break;            
                default:
                    System.out.println("-----INVALID-----");
            }

        }
        
    }

}

class Calc{
    public void add(int a, int b){
        int c=a+b;
        System.out.println("ANSWER: "+a + "+"+b+"="+c+"\n");
    }
    public void subtract(int a, int b){
        int c=a-b;
        System.out.println("\nANSWER: "+a + "-" +b + "=" + c+"\n"); 
    }
    public void multiply(int a , int b){
        int c=a*b;
        System.out.println("\nANSWER: "+a+"x"+b+"="+c+"\n"); 
    }
    public void divide(double a, double b){
        double c=a/b;
        System.out.println("\nANSWER: "+a+"/"+b+"="+c+"\n");
    }
}