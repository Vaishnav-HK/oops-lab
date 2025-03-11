import java.util.Scanner;

class reverse{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter number to reverse: ");
		int num=scan.nextInt();
		int rev=0;
		int digit=0;
		while(num>0){
			digit=num%10;
			rev=rev*10+digit;
			num=num/10;
			}
		System.out.print(rev);
	}
}
