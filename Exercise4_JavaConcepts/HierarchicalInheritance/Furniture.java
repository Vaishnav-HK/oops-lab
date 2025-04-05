class Furniture{
	public static void main(String[] args){
		HeightAdjustTable tableOBJ=new HeightAdjustTable(5.0,20);
		FoldableTable foldable=new FoldableTable(1.2);
		foldable.Table(15.0,10,10,"metal");
		foldable.unfold();
		foldable.fold();
		tableOBJ.Table(20,50,10,"wood");
		tableOBJ.changeHeight(10);
		tableOBJ.changeHeight(50);
	}	
}


class Table{
	double length;
	double breadth;
	double standHeight;
	String material;
	public void Table(double len,double bred,double sh,String mat){
		this.length=len;
		this.breadth=bred;
		this.standHeight=sh;
		this.material=mat;
	}
}

class FoldableTable extends Table{
	Double foldedHeight;
	public FoldableTable(Double fh){
		this.foldedHeight=fh;
	}
	public void fold(){
		System.out.println("FOLDING TABLE - Now you have more space");
	}
	public void unfold(){
		System.out.println("UNFOLDING TABLE - Table is ready to be used");
	}
}

class HeightAdjustTable extends Table{
	double maxHeight;
	double minHeight;
	double curHeight=standHeight;
	public HeightAdjustTable(double minH,double  maxH){
		this.maxHeight=maxH;
		this.minHeight=minH;
	}
	public void changeHeight(double height){
		if(height>maxHeight){
			System.out.println("MAXIMUM HEIGHT IS "+maxHeight);
		}
		else if(height<minHeight){
			System.out.println("MINIMUM HEIGHT IS "+minHeight);
		}
		else{
			System.out.println("adjusting height to "+height);
			curHeight=height;
		}
	}
}
