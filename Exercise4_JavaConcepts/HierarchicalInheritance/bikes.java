class bikes{
	public static void main(String[] args){
		motorbike bike=new motorbike("gas",500.0,1000.0);
		cycle cycleOBJ=new cycle();
		cycleOBJ.startPedalling();
		cycleOBJ.useBrakes(true);
		bike.startBike();
		bike.useBrakes(true);
		bike.checkFuel();
	}
}

class two_wheeler{
	int no_of_wheels=2;
	float speed;
	boolean brakes;
	
	public void useBrakes(boolean val){
		brakes=val;
		if(val){
			System.out.println("Engaging Brakes");
		}
		else{
			System.out.println("Disengaging Brakes");
		}
	}
}

class cycle extends two_wheeler{ 
	String type;
	public void startPedalling(){
		System.out.println("Pedalling....");
	}	 
}

class motorbike extends two_wheeler{
	String type;
	double fuelCapacity;
	double fuelLevel;
	public motorbike(String type, double fuelCapacity, double fuelLevel){
		this.type=type;
		this.fuelCapacity=fuelCapacity;
		this.fuelLevel=fuelLevel;
	}
	public void startBike(){
		System.out.println("starting Bike....");
	}
	public void checkFuel(){
		System.out.println("Amount of fuel: "+fuelLevel+" Litres");
	}
	
}
