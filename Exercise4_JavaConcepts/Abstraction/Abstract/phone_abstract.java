class phone_abstract{
	public static void main(String[] args){
		SmartPhone obj=new SmartPhone();
		obj.turnOn();
		obj.setNum("1234567890");
		obj.call("1234567891");
		obj.download("YouTube");
		obj.turnOff();
	}
}

abstract class Phone{
	String ph_no;
	public void setNum(String num){
		if(num.length() ==10){
		ph_no=num;}
		else{
		System.out.println("NUMBER MUST ONLY BE 10 DIGITS");
		}	
	}
	
	public void call(String num){
		if(num.length()== 10 && num!=ph_no){
		System.out.println("calling "+ num);}
		else if(num==ph_no){
		System.out.println("YOU CANNOT DIAL YOURSELF");
		}
		else{
		System.out.println("NUMBER MUST ONLY BE 10 DIGITS");
		}
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