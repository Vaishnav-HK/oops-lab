class Cam{
	public static void main(String[] args){
		DigitalCamera camOBJ=new DigitalCamera();
		camOBJ.setMan("Canon");	
		camOBJ.setFL(0.3);
		camOBJ.setFlash(true);
		camOBJ.takePhoto();
		camOBJ.recharge();
	}
}


class Camera{
	double focalLength;
	String manufacturer;
	boolean flash;
	public void setFL(double fl){
		focalLength=fl;
		System.out.println("focal length set as "+fl);
	}
	public void setFlash(boolean set){
		flash=set;	
		if(set){
		System.out.println("Flash is on...");
		}
		else{
		System.out.println("Flash is off...");
		}
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
	public void recharge(){
		System.out.println("Recharging...");
	} 
}