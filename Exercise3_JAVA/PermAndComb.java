import java.util.Scanner;
class PermAndComb{
	public static void main(String[] args){
		int ch=0;
		while(ch!=3){
			Operations obj=new Operations();
			Scanner scan=new Scanner(System.in);
			System.out.println("\n1.nCr");
			System.out.println("2.nPr");
			System.out.println("3.EXIT");
			ch=scan.nextInt();
			if(ch==1){
				System.out.print("Enter n: ");
				int n=scan.nextInt();
				System.out.print("Enter r: ");
				int r=scan.nextInt();
				System.out.println("Answer: "+obj.C(n,r));
			}
			else if(ch==2){
				System.out.print("Enter n: ");
				int n=scan.nextInt();
				System.out.print("Enter r: ");
				int r=scan.nextInt();
				System.out.println("Answer: "+obj.P(n,r));
			}
			else if(ch==3){
				System.out.println("Exiting...");
				break;
			}
			else{
				System.out.println("Invalid Input");
			}
		}
	}
}


class factorial{
	public long factorial(long n){
		long fac=1;
		for(int i=2;i<=n;i++){
			fac=fac*i;
		}
		return fac;
	}
}

class Operations extends factorial{
	public long P(int n, int r){
		return factorial(n)/factorial(n-r);
	}
	public long C(int n, int r){
		return factorial(n)/((factorial(n-r))*factorial(r));
	}
}