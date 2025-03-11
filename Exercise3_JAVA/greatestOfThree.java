import java.util.Scanner;
class greatestOfThree{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int a=scan.nextInt();
		System.out.print("Enter 2nd number: ");
		int b=scan.nextInt();
		System.out.print("Enter 3rd number: ");
		int c=scan.nextInt();

		if (a>b){
			if(a>c){      
  				System.out.println(a+" is the largest");
			}
		}
		if (b>c){
			if (b>a){
				System.out.println(b+" is the largest");
			}
		}
		if (c>a){
			if(c>b){
				System.out.println(c+" is the largest");
			}
		}
	}
}
