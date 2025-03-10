class simpleInterest_poly{
	public static void main(String[] args){
	Calc obj=new Calc();
	System.out.println("When value for 'period' is not passed");
	obj.s_interest(1000,5);
	System.out.println("\nWhen value for 'period' is passed as 2");
	obj.s_interest(1000,5,2);
		
	}
}

class Calc{
	public static void s_interest(double principle, double rate, double period){
		double interest=principle*(rate/100.0)*period;
		System.out.println("Principle amount: " + principle +",Rate: "+ rate +", Period(In yrs): " + period );
		System.out.println("Interest is " + interest);
	}
	public static void s_interest(double principle, double rate){
		double interest=principle*(rate/100.00)*1.00;
		System.out.println("Principle amount: "+principle+",Rate: "+rate+", Period(In yrs): "+ 1 );
		System.out.println("Interest rate is "+interest);
	}

}