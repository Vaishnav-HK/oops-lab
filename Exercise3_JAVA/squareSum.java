import java.util.Scanner;
class sqaureSum{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter number: ");
		int n=scan.nextInt();
		int sum=0;
		for(int count=0;count<=n;count++){
			sum+=count*count;}
		System.out.println("sum of the squares of the first "+n+" natural numbers is "+sum);
	}
}
