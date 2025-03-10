import java.util.Scanner;
class factorial{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		calculate obj=new calculate();
		System.out.print("Enter number to find factorial: ");
		long num=scan.nextLong();
		long fact=obj.fac(num);
		System.out.println("factorial of "+num+" is "+fact);
		
		
		
	}
}
class calculate{
	public long fac(long num){
		long fac=1;
		for(long i=1; i<=num;i++){
				fac=fac*i;
			}
		return fac;
	}
}
