class hillStations_poly{
	public static void main(String[] args){
		Manali place=new Manali();
		place.location();
		place.famousfor();
	}
}

class Hillstations{
	public void location(){
		System.out.println("We are in a hillstation");	
	}
	public void famousfor(){
		System.out.println("This is a famous hillstation");	
	}

}

class Manali extends Hillstations{
	public void location(){
		System.out.println("We are in Manali");	
	}
	public void famousfor(){
		System.out.println("It is Famous for the Hadimba Temple and adventure sports");	
	}

}

class Mussoorie extends Hillstations{
	public void location(){
		System.out.println("We are in Mussoorie");	
	}
	public void famousfor(){
		System.out.println("This is a famous for the scenery");	
	}

}

class Gulmarg extends Hillstations{
	public void location(){
		System.out.println("We are in Gulmarg");	
	}
	public void famousfor(){
		System.out.println("This is a famous himalayan background scenerys");	
	}

}
