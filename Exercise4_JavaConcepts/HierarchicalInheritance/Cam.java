class Cam{
	public static void main(String[] args){
		DigitalCamera camOBJ=new DigitalCamera();
		camOBJ.setFL(0.3);
		camOBJ.setMan("Canon");
		camOBJ.turnOn();
		camOBJ.digitalZoom(1.5);
		camOBJ.takePhoto();
		camOBJ.turnOff();
		camOBJ.recharge();
	}
}


class Camera{
	double focalLength;
	String manufacturer;
	
	public void setFL(double fl){
		focalLength=fl;
		System.out.println("focal length set as "+fl);
	}	
	public void setMan(String man){
		manufacturer=man;
		System.out.println("Manufacturer set as "+man);
	}
	public void takePhoto(){
		System.out.println("TAKING PHOTO.....");
	}
}

class DigitalCamera extends Camera{
	double batteryLevel;
	double digiZoom;
	public void turnOn(){
		System.out.println("turning on camera....");
	}
	public void turnOff(){
		System.out.println("turning off camera....");
	}
	public void recharge(){
		System.out.println("Recharging...");
	} 
	public void digitalZoom(double zoomVal){
		digiZoom=zoomVal;
		System.out.println("Digital Zoom set at "+zoomVal);
	} 
}