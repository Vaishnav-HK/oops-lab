class factorial{
	public static void main(String[] args){
		int num=5;
		int fac=1;
		for(int i=1; i<=5;i++){
			fac=fac*i;
		}
		System.out.print("factorial of ");
		System.out.print(num);
		System.out.print(" is ");
		System.out.print(fac);
	}
}