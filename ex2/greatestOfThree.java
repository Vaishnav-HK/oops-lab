class greatestOfThree{
	public static void main(String[] args){
		int a=334;
		int b=290;
		int c=2310;

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
