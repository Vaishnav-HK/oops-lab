class main{
	public static void main(String[] args){
		int num=548834;
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