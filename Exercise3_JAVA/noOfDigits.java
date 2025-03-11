import java.util.Scanner;

class noOfDigits{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter number: ");
		int num=scan.nextInt();
		int tnum=num;
		int digits=0;
		while (tnum>0){
			int digit=tnum%10;
			tnum=tnum/10;
			digits+=1;
		}
		System.out.println(num+" has "+digits+" digits");
	}
}
