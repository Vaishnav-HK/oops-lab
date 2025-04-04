class bikes{
	public static void main(String[] args){
		
	}
}

class two-wheeler{
	const no_of_wheels=2;
	float speed;
	bool brakes;
	
	public void useBrakes(boool val){
		brakes=val;
		if(val){
			System.out.prinln("Engaging Brakes");
		}
		else{
			System.out.prinln("Disengaging Brakes");
		}
	}
}

class cycle extends two-wheeler{ 
	String type;
	public void startPedalling(){
		System.out.println("Pedalling....");
	}	 
}

class motorbike extends two-wheeler{
	String type;
	double fuelCapacity;
	double fuelLevel;
	public void motorbike(String t, double fc, double fl){
		this.type=t;
		this.fuelCapacity=fc;
		this.fuelLevel=fl;
	}
	public void startBike(){
		System.out.println("starting Bike....");
	}
	public void checkFuel(){
		System.out.println("Amount of fuel: "+fl+" Litres");
	}
	
}