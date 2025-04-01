import java.util.Scanner;
class search{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		Browser obj=new Browser();

		System.out.print("Enter search query: ");
		String sq=scan.nextLine();
		
		System.out.print("would you like to use your desired search engine?(y/n) ");
		String ans=scan.nextLine();
		if(ans.compareTo("y")==0){
			System.out.print("Enter search engine name: ");
			String engine=scan.nextLine();
			obj.search(sq,engine);
		}
		else{
			obj.search(sq);
		}
	}
}


class Browser{
	String searchEngine;
	public void search(String query){
		System.out.println("Search Engine: google");
		System.out.println("Searching for: "+query);
	}
	public void search(String query, String engine){
		searchEngine=engine;
		System.out.println("Search Engine: "+engine);
		System.out.println("Searching for: "+query);
	}
}



