class vehicleInherit{
	public static void main(String[] args){
		Car carObj=new Car();
		System.out.println("Car Details:");
		carObj.set("sedan",1999);
		carObj.setType("Hybrid");
		System.out.println("Model: "+carObj.model);
		System.out.println("Year of production: "+carObj.yearOfProduction);
		System.out.println("Type: "+carObj.type);
		System.out.println();	
		System.out.println("Operating Car:");
		carObj.start();
		carObj.drive();
		carObj.stop();
		carObj.off();

	}
}

class Vehicle{
	String model;
	int yearOfProduction;
	
	public void set(String mdl, int year){
		model=mdl;
		yearOfProduction=year;
	}
	
	public void start(){
		System.out.println("starting...");
	}
	public void stop(){
		System.out.println("stopping...");
	}
	public void off(){
		System.out.println("turning engine off...");
	}
}


class Car extends Vehicle{
	String type;
	
	public void setType(String tp){
		type=tp;
	}

	public void drive(){
		System.out.println("Driving the car...");
	}
} 