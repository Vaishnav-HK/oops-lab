class employees{
	public static void main(String[] args){
		SoftwareEngineer empOBJ=new SoftwareEngineer();
		empOBJ.set("Myname","Developer",5);
		empOBJ.setField("Bug Fixing");
		empOBJ.display();
	}
}

abstract class Employee{
	String name;
	String posting;
	int experience;
	public void set(String n, String p, int exp){
		name=n;
		posting=p;
		experience=exp;
	}
}

class SoftwareEngineer extends Employee{
	String field;
	public void setField(String f){
		field=f;
	}
	public void display(){
		System.out.println("Name: "+name);
		System.out.println("Posting: "+posting);
		System.out.println("Field: "+field);
		System.out.println("Experience: "+experience+" years");	
	}
}
	