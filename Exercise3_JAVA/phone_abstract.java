class phone_abstract{
	public static void main(String[] args){
		SmartPhone obj=new SmartPhone();
		obj.turnOn();
		obj.setNum(1234567894);
		obj.call(1234567890);
		obj.download("YouTube");
		obj.turnOff();
		
	}
}

abstract class Phone{
	long ph_no;
	public void setNum(long num){
		ph_no=num;
	}
	
	public void call(long num){
		System.out.println("calling "+ num);
	}
	public void turnOn(){
		System.out.println("Turning on...");
	}
	public void turnOff(){
		System.out.println("Turning off...");
	}
}

class SmartPhone extends Phone{
	public  void download(String app){
		System.out.println("Downloading "+app+"...");
	}
	public void playMusic(){
		System.out.println("Playing Music!");
	}
}