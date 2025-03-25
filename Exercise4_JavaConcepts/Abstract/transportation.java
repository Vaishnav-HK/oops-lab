class transportaion{
	public static void main(String[] args){
		Car carOBJ=new Car();
		carOBJ.set("electric","tesla",4,4);
		carOBJ.recharge();
		carOBJ.start();
		carOBJ.stop();
	}
}

abstract class Vehicle{
	String type;
	String manufacturer;
	int no_of_wheels;
	int max_no_of_passengers;
	public void set(String t, String man, int now, int nop){
		type=t;
		manufacturer=man;
		no_of_wheels=now;
		max_no_of_passengers=nop;
	}
	abstract public void start();
	abstract public  void stop();
}	

class Car extends Vehicle{
	public void start(){
		System.out.println("STARTING THE CAR...");
	}
	public void stop(){
		System.out.println("STOPPING THE CAR...");
	}
	public void recharge(){
		System.out.println("REFUELLING THE CAR.....");
	}
}